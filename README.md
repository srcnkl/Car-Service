# Car Service
Car Service is a Spring Boot Application that produce car with given car type. 

Application run on the port 8080. 

After starting the project you can test endpoint with postman or swagger-ui

http://localhost:8080/swagger-ui.html#/car-controller

http://localhost:8080/car/sedan

Also there are unit tests for CarFactory and ControllerValidation . All cases can be tested. 

# Cars

| Route | HTTP Verb	 | POST body	 | Description	 |
| --- | --- | --- | --- |
| /car/sedan| `GET` | Empty | Sedan Car has produced |
| /car/cabrio| `GET` | Empty | Cabrio Car has produced |
| /car/hatchback| `GET` | Empty | Hatchback Car has produced |

When car type is null or empty response will be "Car type is not valid".

When car type has white space or car type length less than 2 character response will be "Car type is not valid".

When car not found with given type , response will be "Car cannot be found with given type".
