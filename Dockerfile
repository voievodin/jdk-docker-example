FROM openjdk:17
COPY build/libs/jdk-docker-example-0.0.1.jar app.jar
CMD ["java", "-jar", "app.jar"]
