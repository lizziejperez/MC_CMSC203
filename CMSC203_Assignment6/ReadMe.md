# Assignment Description - Movie Ticket Manager
The XYZ Theater has four types of tickets Adult, Child, Employees, MoviePass. The price of the tickets are determined as follows:
| Ticket Type | Before 6pm | 6pm and after | IMAX | 3D | Tax |
| - | -| - | - | - | - |
| Adult | $10.50 | $13.50 | +$3.00 | +$2.50 | +9.6% |
| Child | $5.75 | $10.75 | +$2.00 | +$1.50 | +9.6% |

A child can only attend G or PG movies

Employees – The first two movies are free and all additional movies are half of the pre-tax Adult price + 9.6% tax.

MoviePass – The first movie is $9.99 (includes tax) and all additional movies are free if:
1.	Attend only one movie per day
2.	Movie cannot have been seen before
3.	Movie cannot be IMAX or 3D.

If any of the 3 rules have not been met, they will be charged at the Adult price.


The Management of the XYZ Theater also wants to print reports of the following:
1.	All tickets
2.	3D tickets
3.	MoviePass tickets
4.	Monthly Sales Report

Create an application that calculates ticket prices and prints out reports needed by the management.
## Concepts Tested
- Reading from a file
- ArrayList<>
  - Searching an Arraylist
  - Sorting an Arraylist
- Enumeration
- Inheritance
- Interface
- Polymorphism
  - Abstract classes
  - Overriding methods
  - super()
## Classes
- Data Elements: Ticket.java, Adult.java, Child.java, Employee.java, MoviePass.java
- Enumerated Type: Format.java
- Data Manager: MovieTicketManager.java, (provided) MovieTicketManagerInterface.java
- GUI Driver (provided): FXMainPane.java, FXMovieDriver.java
- JUnit Tests: MovieTicketManagerSTUDENT_Test.java
- JUnit Tests (provided): ChildTest.java, EmployeeTest.java, MovieTicketManagerTest.java
## Assignment Grade
- Assignment 6 Implementation (100/100)
