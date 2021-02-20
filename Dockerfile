FROM java:8-jre
RUN mkdir -p /opt/usersapp/
COPY ./target/users-in-mem-app-0.0.1-SNAPSHOT.jar /opt/usersapp/users-in-mem-app.jar
WORKDIR /opt/usersapp/
EXPOSE 8000
CMD ["java", "-jar", "users-in-mem-app.jar"]
