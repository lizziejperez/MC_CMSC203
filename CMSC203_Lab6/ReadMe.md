# Lab 6 - JUnit Lab
Objective: Create a JUnit Test Class for Gradebook.java.

Gradebook has two attributes: an array of int called scores to hold scores and scoreSize that indicates how many scores are currently held in the array. This field is initially set to 0.
## Task #1
1. Add a getScoreSize() method to the Gradebook class which returns scoresSize.
2. Add a toString() method to the Gradebook class that returns a string with each score in scores field of the Gradebook separated by a space.
## Task #2
Create the Test Class GradebookTester by right clicking on the GradeBook.java, select New, Junit Test Case.

Using the wizard:
1. Select the setUp and tearDown method check boxes and click Next.
2. Select all of the methods of Gradebook, except for the constructor to create tests for. Then click finish.
## Task #3
1.	In the setUp method of GradebookTester, create at least two objects of Gradebook to hold 5 scores.  Then call the addScore method for each of the Gradebook objects at least twice (but no more than 5 times) to add some random scores of your choice to the GradeBook objects
2.	In the teardown method of GradebookTester, set the two objects of Gradebook to null.
## Task #4
Create test for the methods of Gradebook:
1. addScore

   Use the toString method to compare the contents of what is in the scores array vs. what is expected to be in the scores array assertTrue(...)
   Compare the scoreSize to the expected number of scores entered, using assertEquals(...)
2. sum

   Compare what is returned by sum() to the expected sum of the scored entered.
3. minimum

   Compare what is returned by minimum() to the expected minimum of the scored entered.
4. finalScore

   Compare what is returned by finalScore() to the expected finalScore of the scores entered. The finalScore is the sum of the scores, with the lowest score dropped if there are at least two scores, or 0 if there are no scores.
## Lab Grade
100/100
