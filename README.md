# Spring-PostgreSQL

-- A project to do on Spring Boot with PostgreSQL

Step 1 : Create a Spring Tool Suite Project either from Spring or Spring Initializr, by adding the Dependendencies like : 
	- PostgreSQL Driver (To connect the database with our project)
	- Spring Web (To build web application)
	- Spring Data JPA (To interact with Database)

Step 2 : Open STS, import the project into the workspace.

# We can check the dependencies in the pom.xml

Step 3 : Open the application.properties to configure and connect the database to the current project

Step 4 : Open PGAdmin 4, and create a database (namely "UserDatabase") with one table and give some tuples into it.

Step 5 : Come back to the application.properties and paste the configuration

--	spring.datasource.url = jdbc:postgresql://localhost:5432/UserDatabase
--	spring.datasource.username = postgres
--	spring.datasource.password = password

--	spring.jpa.hibernate.ddl-auto = none
--	spring.jpa.properties.hibernate.format_sql = true
--	spring.jpa.show-sql = true

Step 6 : Create the required files -

--	a Entity class (UserEntity.java)
		//Generate the getter setter, Constructor method, Zero-parameterized contructor, to string method
--	a controller class (UserController.java)

--	a UserService Interface
	-- a UserServieImpl

--	a UserRepository interface 
