# spring-core
  
  
  
 ## Flight Project

Problem Statement

Background: This problem statement provides the high level design of the project that has to be implemented as part of hands-on assessment in order to complete the course Spring Basics.

InfyGo is an airline booking application that provides services to its customers to search flight details. InfyGo wants a light weight, loosely coupled application to be implemented using Spring.

Let us start with basic implementation using Spring core concepts for the following functionalities

Add Flight

Search Flight

As part of Spring Basics course, let us develop the business tier of this application.

Implement the application using following classes:

Domain class Flight with below details

public class Flight
{
        private String flightId;
        private String airlines;
        private String source;
        private String destination;
        private Double fare;
        private Date journeyDate;
        private Integer seatCount;
        
        //Getter & Setter Methods
}
 

Implement required repository using map collection

FlightRepository interface

FlightRepositoryImpl class

Implement Service layer of application

FlightService interface

FlightServiceImpl class

Implement client code to access bean of FlightServiceImpl class and perform below tasks in a menu based approach.

Add Flight : Add flight details by auto generating FlightId starting from 1001 and accepting other flight details from the user

Search Flight : User can Search flights based on source, destination and journey date

Before displaying search details to the user, if the provided journey date is during festival season(Dec to Jan) then increase the flight fare by 20% for all search results.

Note: Assume as of now the application is accessible to the user who can perform all the above functionalities.

Implement Spring application with following features:

Use Spring Java code based configuration

Use Autowiring through annotations for bean dependencies

Implement LoggingAspect class for logging details whenever the new flight details are added

Advice should log Joinpoint signature, current date and time stamp on console

Client code has to provide below menu based functionalities

Add Flight

Search Flight
