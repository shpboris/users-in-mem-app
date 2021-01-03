FROM java:8-jre
RUN mkdir -p /opt/usersapp/ 
COPY ./users-in-mem-app.jar /opt/usersapp/
WORKDIR /opt/usersapp/
EXPOSE 8000
CMD ["java", "-jar", "users-in-mem-app.jar"]
