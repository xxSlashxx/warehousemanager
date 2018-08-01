### Warehousemanager

#### Technologies used in the project

* Maven
* Spring Boot stack
    * Spring Data JPA (for persistence)
    * Spring MVC (for REST endpoints)
* Swagger UI (for API testing)

#### Getting started

To start this web application just follow these steps:

1. Build the project via Maven:

    <code>$ mvn clean install</code>

2. Start the application:
    In your IDE invoke the class method <code>de.slash.warehousemanager.WarehousemanagerApplication#main</code> to start the server

3. Browse to the following URL for API documentation:

    [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

#### Information

* Spring boot automatically provides an embedded servlet container and a persistence layer based on Hibernate (as JPA provider).
* Data are automatically stored in an in-memory database. Changes are lost after restarting the application.
* All REST endpoints can be tested locally with the Swagger UI frontend:

    [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)