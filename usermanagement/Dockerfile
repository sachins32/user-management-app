FROM ubuntu:latest
LABEL authors="sachin"
WORKDIR app
COPY ./target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]