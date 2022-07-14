FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} service-reg.jar
ENTRYPOINT ["java","-jar","/service-reg.jar"]
EXPOSE 8761