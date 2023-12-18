ARG JAVA_VERSION=17
FROM openjdk:${JAVA_VERSION}
COPY target/order-service-0.0.1-SNAPSHOT.jar order-service.jar
EXPOSE 8080
CMD ["java","-jar","/order-service.jar"]