# microservices
Microservices project using Spring Cloud (Eureka, Zuul, CloudBus), Docker and AWS EC2.

Microservices as an architecture consists of small web-services that are capabale of running independently and 
serve only one business capability. To effectively communicate, the micro-services need to be started in an orderly manner
so that the services which are dependent on some other ones are up and running before them.

In this project, there are few instances of different microservices that are deployed on AWS EC2 instances
using Docker containers.

## Docker commands used:
* `service docker start` - starting the docker as a service
* `docker ps -a` - shows all the containers (running or stopped)
* `docker run <container-id>` - runs the particular container
* `docker stop <container-id>` - stops the running container
* `docker rm <container-id>` - deletes the container
* `docker images -a` - lists all images on computer
* `docker rmi <image-id>` - removes the particular image
* `docker run --name=<any-name> -p <ports> <image-name>` - pulls and runs the image on specified ports
* `docker build --tag=<any-name> --force-rm=true .` - creating the docker image on computer

## Steps
* Clone the project and extract all the files.
* Run EC2 instance on AWS console and connect to it using SSH with command `SSH -i private-key-file ec2-user@instance-public-ip`. 
Be sure to download and change the private key file when creating the instance into appropriate form.
* Install Docker on EC2 instance using `yum install docker` and use `service docker start` to start the service.
* Pull RabbitMQ image from the DockerHub and run the command `docker run --name=<any-name> -p 5672:5672 -p 15672:15672 -p 5671:5671 rabbitmq:3-management`
and it will start the rabbitmq service on these ports. Open these ports for the EC2 instance's Security group inbound rules.
* In the config-server directory, run `mvn clean` and then `mvn install` to create the executable "jar" file.
* To build the image for the config-server, run `docker build --tag=<name> --force-rm=true .`
* Push the docker image to the dockerHub using `docker push <dockerHub-repository-name>`.
* In the same EC2 instance, open a new security inbound rule for "port: 8012" for config-server.
* Pull the config-server image from the dockerHub and run the container on specified ports using the rabbitmq 
spring properties specified in the application.properties file of the microservice.
* Run new EC2 instance for the Eureka discovery service and repeat the steps for creating the docker image and pushing onto
the dockerHub and pulling it for running the microservice on "port: 8011".
* Repeat the steps for other micro-services with dockerfiles in their directories.
* Keep in mind of providing the correct IP addresses for effective communication between the microservices.


