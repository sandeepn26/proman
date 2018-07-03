Setup
Install Java 1.8 and set up JAVA_HOME

Install maven

Install MySQL 5.6.x community server

Install git

create a directory projects

in projects, `git clone https://github.com/sandeepn26/proman.git`

Download tomcat 8.x and setup CATALINA_HOME


Running locally

clone

To test this use :

http://localhost:8080/app/hello

To deploy:

mvn tomcat7:run

When deployed directly, use

`http://localhost:8080/proman/home`