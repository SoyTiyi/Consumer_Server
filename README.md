# Consumer_Server

Este es una parte del primer parcial de AREP, en el cual nos piden crear un servidor web el cual consuma el servidor calculador y retorne un json con la respuesta

## Correr proyecto

Primero Clonaremos el repositorio, para eso desde nuestro navegador nos dirigiremos al siguiente link

```sh
https://github.com/SoyTiyi/Consumer_Server.git
```

Para clonar el repositorio debemos de correr el siguiente comando en cmd o en la terminal 

```sh
git clone https://github.com/SoyTiyi/Consumer_Server.git
 ```

 Y luego entraremos a la carperta Consumer_Server

```sh
$ cd Consumer_Server
 ```
Descargaremos y compilaremos el proyecto con el siguiente comando
Este comando nos descargara la dependencias necesarias, como lo son JUnit y Spark

 ```sh
$ mvn package
 ```
 Y finalmente para ejecutar la aplicación.

 ```sh
$ mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.app.Spark.SparkWebApp"
 ```

### Prerequisitos

* Tener conocimientos básicos en la terminal o CMD
* Java SE Development Kit 8 -Java SE Runtime Environment 8 -Apache Maven.


## Despliegue en Heroku

[![Heroku App](http://heroku-shields.herokuapp.com/enigmatic-earth-07531)](https://enigmatic-earth-07531.herokuapp.com)

## Correr Pruebas

Para correr las pruebas, ejecutamos el siguiente comando

```sh
$ mvn test
 ```

### Generar Javadoc

Para generar el javadoc, corremos el siguiente comando

```sh
$ mvn javadoc:javadoc 
 ```

## Construido con

* [Maven](https://maven.apache.org/) - Dependency Management
* [JUnit](https://mvnrepository.com/artifact/junit/junit) - Test framework
* [VIM](https://www.vim.org/download.php) - Editor de Texto VIM

## Author

 - Santiago Martínez Martínez 
 - Estudiante de la Escuela Colombiana De Ingeniería Julio Garavito 
 - Noveno Semestre

## License

Este proyecto está licenciado bajo la GNU v3.0 - ver el archivo LICENSE.md para más detalles
