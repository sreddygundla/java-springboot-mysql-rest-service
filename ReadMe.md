# Java-Springboot-MySql-Rest-Service


## Build the code
`mvn clean install`

## Run the code
`java -jar target/employee-rest-service-0.0.1.jar`

## API Endpoints
### addEmployee
POST http://localhost:8080/addEmployee with JSON Body
```
{
    "name":"sgundla"
    "email":"sgundla@dummy.com"
    "experience":20
    "domain":"DevOps"
}
```
### getAllEmployees
GET http://localhost:8080/getAllEmployees
### findEmployee
GET http://localhost:8080/findEmployee/{empEmailId}
### deleteEmployee
GET http://localhost:8080/deleteEmployee/{empId}