#Author: astridchavarria253087@correo.itm.edu.co


Feature: Flight reserve
As end user
She wants to book a flight
to test using the programming Cucumber and Gherkin


    @tag1
 Scenario Outline:  Successful search for a flight from the main Despegar website
     Given  that Actor wants to look for a one way flight 
      When  Actor insert "<originCity>" , "<destinationCity>" , "<departureDate>" and "<returnDate>" of the flight
      And Actor insert your "<name>" , "<lastname>" , "<identification>" , "<department>" , "<city>" , "<adress>", "<dayBorn>", "<monthBorn>","<yearBorn>"  
      Then Actor should see your "<name>" and "<lastname>" on screen

			

Examples:
      | originCity   | destinationCity | departureDate |returnDate  |  name         | lastname          |identification | department |city    |adress               |dayBorn  |monthBorn|yearBorn|
      | Medellin     |     Bogota      | 			1        |		8       |  Astrid       |   Chavarria       | 1017269278		|Antioquia  |Medellin |  CR 70 A N 12-32    |      04 |04       |1999    |
       
