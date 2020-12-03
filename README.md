# RST-API

In this RST web services APIs for CRUD operations on a MySQL database. The CRUD operations include Create, Retrieve, Update and Delete.
By completing this tutorial, you will be able to build a Spring Boot-based web application that exposes RESTful CRUD APIs to clients. The following technologies will be used:
•	Spring Boot: greatly simplifies Java enterprise application and RESTful APIs development by providing default configuration and best practices.
•	Spring Data JPA: simplifies programming for the data access layer by implementing most common persistence operations following best practices.
•	Hibernate: is the default Object/Relational Mapping framework integrated with Spring Data JPA.
To follow this tutorial, you must have the following software programs installed on your computer:
•	Java Development Kit (JDK 1.8 or newer)
•	MySQL Database server (including MySQL Workbench and MySQL Command Line Client to manage database)
•	A Java IDE (Eclipse IDE, NetBeans or IntelliJ IDEA)
•	curl (to test RESTful APIs)

1.Insert MySQL Database to xamp or wamp.It is attached the this file (database    name=coffee_shop)
2. Now we can run the Application class and test. With Eclipse, you can see the Spring Boot logo appears in the Console view.
3. We’ve started Tomcat server on localhost with its default port 8080. Let’s check it out in our browser:   http://localhost:8080
You can change the port using application.properties is set server.port=8181 
4. We can show the list of coffee items,
	http://localhost:8080/products/
5. We can search the products by using id
http://localhost:8080/products/{id}

6.We can order the product by using postman select by POST
http://localhost:8080/orders/add
we have to enter body tab form data or else

7. We can update the order by using postman select by PUT
http://localhost:8080/orders/update/{id}

8. We can update the order by using postman select by PUT
http://localhost:8080/orders/delete/{id}





