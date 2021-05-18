# springboot-eurekaserver-microservices

Microservices in Spring with a Eurekaserver and two client microservices.

Steps to run the Eureka Server:

1. Navigate into the EurekaServer folder and start the application with ```mvn spring-boot:run```
2. Open up the browser and check if the EurekaServer has started at ```localhost:8761```
3. Start up the remaining clientservices similarly with ```mvn spring-boot:run```
4. Reload the EurekaServer and check whether both the clientservices have registered with the server. </br></br>
  ![EurekaServer](https://imgur.com/0jCezbX.jpg) </br></br>
6. Open up postman and test the apis created in client. </br></br>
  ![Postman](https://imgur.com/QIqBDLw.jpg) </br></br>
