FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} products-service.jar
ENTRYPOINT ["java","-jar","/products-service.jar"]
EXPOSE 6060