FROM java:8
VOLUME /tmp
ADD target/app.jar app.jar
EXPOSE 8080
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongo/loanapp", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]