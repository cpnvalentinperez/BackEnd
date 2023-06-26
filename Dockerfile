FROM amazoncorretto:17
MAINTAINER VP
COPY target/vp-0.0.1-SNAPSHOT.jar vp-app.jar
ENTRYPOINT ["java","-jar","/vp-app.jar"]
