This project contains a Runner Class that runs the Java Springboot Application with its dependency on Gaming Console interface. 
Here we have 3 games Pacman, Mario game and SuperContra game. Hence I created 3 different classes for each game, and all these 3 Componenets make use of the GamingConsole interface 
to reduce Tight Coupling. This project is super helpful to understand the concepts of Spring Bean, Configuration, ComponentScan and Autowiring to manage classes and its object dependencies.

Also, in the same project, I implemented something that would help me understand the concept of Enterprise Applications on how they use the above concepts. 
1. Most enterprise applications need  a lot of classes, objects, jars, dependencies, frameworks and to wire them to one another is a complex task, hence we are using Spring and Maven
dependencies for ease of building applications.
2. I was able to understand the layers of Business's such as Web--Business--Data, to form a business logic we need DataService layer, and for the WebController to provide an output
it requires BusinessLayer so all in all each is dependent on the other component.
3. In order to make sure we FOCUS on the business logic, Spring makes it easier, where we just write our logic and use annotations like @Component and @Autowiring and ofcourse
the use of packages to seperate each layer to avoid confusion.

This was a fun learning, most of these topics are taught by MR. Ranga in a course (Master Java Web Services and REST API with Spring Boot) He explains it much better, but above 
is my understanding of all the concepts I learned and applied while creating this project. 

