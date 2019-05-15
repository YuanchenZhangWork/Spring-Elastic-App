FROM openjdk:8-jdk-alpine

WORKDIR /spring
COPY target/gs-rest-service-0.1.0.jar app.jar

#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring/app.jar"]




