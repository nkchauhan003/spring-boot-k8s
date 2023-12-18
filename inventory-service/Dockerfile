ARG JAVA_VERSION=17
FROM openjdk:${JAVA_VERSION}
COPY target/inventory-service-0.0.1-SNAPSHOT.jar inventory-service.jar
EXPOSE 8080
CMD ["java","-jar","/inventory-service.jar"]