# pruebaIteriamSanitas

Para todo el proceso de desarrollo seguiremos la metodologia de gitflow, aunque sin la extension propia de gitflow.

Se desarrollara en la rama master hasta la primera subida preliminar del proyecto Spring Boot.
A partir de este paso se creara una rama develop que sera sobre la que se haran los cambios de nuevos desarrollos. Apoyandonos en ramas feature basadas en develop para cada issue.

A nivel pruebas de usuario de los servicios usamos la herramienta de escritorio Postman

Para los test unitarios añadimos la libreria Mockito a traves de maven.

Para añadir el trazador que se nos pasa como libreria, lo añadimos como dependencia al pom y añadimos los jar a nuestro repositorio local. Para añadirlo al repositorio local debemos ejecutar el siguiente comando en consola, previa instalacion de maven en nuestro equipo.

mvn install:install-file -Dfile=D:\Descargas\pruebas-tecnicas\pruebas-tecnicas\test4\tracer-1.0.0.jar -DgroupId=io.corp.calculator -DartifactId=tracer -Dversion=1.0.0 -Dpackaging=jar

Adaptando la ruta a donde tengamos ubicado el jar.

Se implementa la interfaz de usuario de Swagger, para que sea mas facil e intuitivo de consumir.

Por ultimo se mergeara la rama develop en master para generar una version de la api operativa.

Para usar la api se debe compilar a traves de maven usando el comando mvn clean install, y se creara un jar en la carpeta target del proyecto.
 
Ejecutando este jar, se desplegara el webservice en localhost:9080, para acceder a la interfaz hay que acceder mediante la ruta: http://localhost:9080/swagger-ui.html 

