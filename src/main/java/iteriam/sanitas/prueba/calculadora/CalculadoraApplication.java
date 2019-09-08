package iteriam.sanitas.prueba.calculadora;

import java.lang.reflect.WildcardType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.AlternateTypeRules;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class CalculadoraApplication {

	@Autowired
	private TypeResolver typeResolver;

	@Value("${app.version}")
	private String appVersion;

	public CalculadoraApplication() {
	}

	public CalculadoraApplication(TypeResolver typeResolver, String appVersion) {
		super();
		this.typeResolver = typeResolver;
		this.appVersion = appVersion;
	}

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
	}

	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("iteriam.sanitas.prueba.calculadora.controller"))
				.paths(PathSelectors.regex("/calculadora/.*")).build().pathMapping("/")
				.genericModelSubstitutes(ResponseEntity.class)
				.alternateTypeRules(AlternateTypeRules.newRule(
						typeResolver.resolve(DeferredResult.class,
								typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
						typeResolver.resolve(WildcardType.class)))
				.useDefaultResponseMessages(false).apiInfo(apiInfo());
	}

	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {

		return new ApiInfo("API Prueba Iteriam-Sanitas",
				"API de prueba para proceso de seleccion de Sanitas con Iteriam", appVersion, "urn:tos", "", "", "");
	}
}
