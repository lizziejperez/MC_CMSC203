# Lab 3 - Create Driver for DataElement
## Objectives
- Write a Java program from pseudo-code
-	Write a driver program to test a separate class
-	Create an object from a class’s constructor
-	Write a loop to repeat a task
## Task #0: Review the Movie Class
1. Create a project in Eclipse and import Movie.java.
2. Open Movie.java and observe the three data fields (attributes). Notice that the fields are declared as private, so they are accessed via public methods defined within the class Movie. There is also a method in Movie called toString(), which prints out the information for a movie.
## Task #1: Writing a Driver Class
1. Create a new class called MovieDriver.
2. Open the file MovieDriver.java in Eclipse.

   Write Java code to implement the following pseudocode:

       Create a new object of type Scanner that reads from the keyboard
       Create a new movie object
       Prompt the user to enter the title of a movie 
       Read in the line that the user types
       Set the title in the movie object
       Prompt the user to enter the movie’s rating
       Read in the line that the user types
       Set the rating in the movie object
       Prompt the user to enter the number of tickets sold at a (unnamed) theater
       Read in the integer that the user types
       Set the number of tickets sold in the movie object
       Print out the information using the movie’s toString method
3.	Run your driver class to be sure it prints out the information you type in.
## Task #2: Writing a Loop
1. Add to your driver class a loop that reads input for multiple movies. Your code does **not** need to save each movie as you enter the next one.
2. Ask the user if they want to continue, and continue the loop if the user types the correct response.
3. Run the new driver to ensure that it reads and prints multiple movies.
## Lab Grade
100/100
