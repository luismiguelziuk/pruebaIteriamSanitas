# pruebaIteriamSanitas

Para todo el proceso de desarrollo seguiremos la metodologia de gitflow, aunque sin la extension propia de gitflow.

Se desarrollara en la rama master hasta la primera subida preliminar del proyecto Spring Boot.
A partir de este paso se creara una rama develop que sera sobre la que se haran los cambios de nuevos desarrollos. Apoyandonos en ramas feature basadas en develop para cada issue.

Para el tratamiento de JSON usaremos la libreria de Google Gson. La importaremos a traves de maven como dependencia.

A nivel pruebas de usuario de los servicios usamos la herramienta de escritorio Postman

Para los test unitarios añadimos la libreria Mockito a traves de maven.

Para añadir el trazador que se nos pasa como libreria, lo añadimos como dependencia al pom y añadimos los jar a nuestro repositorio local.
