
# Car rental service

Project of a car rental service site made in Java using Spring, Thymeleaf and MySQL.
## Description
A fun project of a car renting website. The plan was to made a rental service that can be used by
 any interested company with little to no changes. It has three role access mode - client, 
 employee and admin, all with different clearance levels. 
 ## How does this work?
Client makes a reservation request by picking a timeframe, a car of choice and picking the starting and ending branch. 
Employee or Admin can either deny or accept the request converting it into a reservation. Given it's accepted, when client 
comes to pick up the car, Employee or Admin converts the reservation into a rent, which is used to make a return at the end of 
period of use. When a return is created, system checks whether there are any additional costs, and the invoice is being added
to the accounting branch, which calculates both income and costs of revenue. 
## Used tools
Database made using AWS RDS, template made with Thymeleaf
