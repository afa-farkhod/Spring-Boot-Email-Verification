# Spring-Boot-Email-Verification
Spring Boot Login and Registration to PostgreSQL Database with Email Verification Api

- Scenario: following is the complete backend application for user login and registration using Spring Boot which also includes email verification link. So person comes to register with the firstname, lastname, email and password. Which are then saved on Database. In fact, user gets authorization token back from the server as the proof of registration. Then there goes email verification link to the user's email with the expiration period of 15 minute.

![image](https://github.com/af4092/Spring-Boot-Email-Verification/assets/24220136/253f466c-ed3f-40ff-b523-b41333aef16d)

## [Implementation]()

- First we create new Spring project with `Spring Initializer` by using the `IntelliJ IDEA` as following:
  
<p align="center">
  <img src="https://github.com/af4092/Spring-Boot-Email-Verification/assets/24220136/2e57de2c-4dd1-49f8-91d6-f2f30a6d26da.png" alt="Image">
</p>

- After that, we set required dependencies and Spring Boot version:

<p align="center">
  <img src="https://github.com/af4092/Spring-Boot-Email-Verification/assets/24220136/1655cc5f-01a0-4c35-9c68-f5d976fc7ce6.png" alt="Image">
</p>

- We run the Spring application first:
  
![image](https://github.com/af4092/Spring-Boot-Email-Verification/assets/24220136/c9ca4eb6-beb2-43f9-8325-bf7490bdd91f)

- Then with the `Postman` client we send new user registration request as following:

  ![image](https://github.com/af4092/Spring-Boot-Email-Verification/assets/24220136/af9101c7-870b-4d57-ad15-39b65ca80fbb)

- After successful registration, we can check the Database:

![image](https://github.com/af4092/Spring-Boot-Email-Verification/assets/24220136/26666031-afe9-494d-a125-897627611ce2)

- And on Postman we get `token` from the server as the meaning of successful registration:

![image](https://github.com/af4092/Spring-Boot-Email-Verification/assets/24220136/eeeaa07a-fcef-4901-9ab9-d21a568e761e)

- To simulate the email verification part, we use [maildev](https://github.com/maildev/maildev) which is the simple way to test project's generated email during development, with an easy to use web interface that runs on local machine built on top of Node.js:

```
# first clone the GitHub repository
$ git clone https://github.com/maildev/maildev.git
# then run the following command
$ npm install -g maildev
```

- Then we can check successful installation by running `maildev`:

![image](https://github.com/af4092/Spring-Boot-Email-Verification/assets/24220136/181fc2a7-c5a5-4698-ad79-81cc608b8578)


  

