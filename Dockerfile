FROM openjdk:17
EXPOSE 9090
ADD target/*.jar spring-jenkins.jar
ENTRYPOINT ["java","-jar","/spring-jenkins.jar"]