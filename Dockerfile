# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
# copy WAR into image
ENV JAVA_APP_DIR=/opt/
RUN mkdir -p ~/opt
COPY target/microprofilesample-microbundle.jar /opt/microprofilesample-microbundle.jar
RUN file="$(ls -la /opt)" && echo $file

# run application with this command line 
CMD ["/usr/bin/java", "-jar", "/opt/microprofilesample-microbundle.jar"]
