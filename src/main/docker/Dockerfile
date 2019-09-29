FROM openjdk

VOLUME /tmp
ADD maven/spring-boot-mongodb-0.0.1-SNAPSHOT.jar jgApp.jar
RUN sh -c 'touch /jgApp.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/jgApp.jar"]
