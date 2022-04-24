# Alpine Linux with OpenJDK JRE
FROM openjdk:8-alpine
# copy WAR into image
COPY /target/demo-0.0.1.jar  /app.jar
# run application with this command line
CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/app.jar"]