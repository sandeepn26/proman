# Proman

[Change log](CHANGELOG.md).

## Setup
- Install Java 1.8 and set up JAVA_HOME

- Install maven

- Install MySQL 5.6.x community server

- Download tomcat 8.x and setup CATALINA_HOME

- Install git

- create a directory projects

- in projects, `git clone https://github.com/sandeepn26/proman.git`

## Running locally

- If you setup a password for the root user while installing mysql, update the docker-compose.yml and the initdb.cmd and initdb.sh file with the root user password.

- If the OS does not support docker, run initdb.cmd initdb.sh depending on your OS.

- If your OS supports docker, `docker-compose up` from the proman (parent)

- cd proman `mvn clean install`

- Copy the proman war file from `\projects\proman\proman-web\target\proman.war` to tomcat webapps directory

- start the tomcat from the tomcat bin directory

- From the browser navigate to http://localhost:8080/proman/signup

## Testing

- Enter a username password and retype password and click create account.

- Ensure the you see the success page.

