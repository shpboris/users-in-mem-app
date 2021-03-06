# users-in-mem-app
Users REST API based on Spring Boot and Swagger. 
Can be deployed to Kubernetes/Istio environment. 

1. The application is accessible on http://localhost:8000/env1/swagger-ui.html

2. The CONTEXT_PATH environment variable should be supplied

3. The application's docker image can be found at
https://hub.docker.com/repository/docker/shpboris/usersmemrestserver

4. To expose the application using plain docker on port 8888, run the following: sudo docker run -d --name users-in-mem-app-docker -e CONTEXT_PATH=env1 -p 8888:8000 shpboris/usersmemrestserver

5. To deploy users REST application to Kubernetes/Istio, execute the following using files from users-in-mem-app/src/main/resources/deployment/ folder of this project:
    5.1 kubectl apply -f namespace.yml
    
    5.2 kubectl apply -f deployment-env1.yml

    5.3 kubectl apply -f deployment-env2.yml

    5.4 kubectl apply -f virtual-service.yml

    5.5 kubectl apply -f gateway.yml
   
   Alternatively, if Tilt is installed, all that is needed for full flow of
   compiling, creating docker image and deploying to kubernetes is just executing the following from users-in-mem-app:
   tilt up

