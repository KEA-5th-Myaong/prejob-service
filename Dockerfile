FROM openjdk:17
COPY build/libs/popolog-prejobs-service.jar popolog-prejobs-service.jar
ENTRYPOINT ["java", "-jar", "/popolog-prejobs-service.jar"]