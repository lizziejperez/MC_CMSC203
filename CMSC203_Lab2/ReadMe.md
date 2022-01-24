# Lab 2 - Java Fundamentals
## Objectives
- Use command-line and IDE compilation and running
- Write arithmetic expressions to accomplish a task 
- Use casting to convert between primitive types
- Use a value-returning library method and a library constant
- Use string methods to manipulate string data
- Communicate with the user by using the Scanner class and dialog boxes
- Create a program from scratch by translating a pseudocode algorithm
- Be able to document a program
## Task 1: Correcting Syntax and Run-time Error in Formulas
Try running the provided NumericTypes.java file. Correct the syntax (compile-time) error, recompile, and run the program. Notice there is a run-time error. Fix that error, recompile and re-run the program.
## Task 2: Correcting Logic Errors in Formulas
With the partially-corrected NumericTypes.java file, correct the logic errors.
## Task 3: Using the Scanner Class for User Input
1. Add an import statement above the class declaration to make the Scanner class available to your program. 
2. In the main method, create a Scanner object and connect it to the System.in object. Reuse this Scanner object to read in each of the following entries. 
3. Prompt the user to enter the first score. 
4. Read the first score from the keyboard using the nextInt() method, and store it into the variable called score1 (comment out the line that originally defined score1). 
5. Prompt the user to enter the second score. 
6. Read the second score from the keyboard using the nextInt() method, and store it into the variable called score2 (comment out the line that originally defined score2). 
7. Prompt the user to enter another temperature in Fahrenheit after the original temperature conversion is printed out. 
8. Read the temperature and print out the result in Celsius. 
9. Compile, debug, and run, using other score values as test data
## Task 4: Create a program from scratch using predefined Math Functions
In this task you will create a new program that calculates the result of a mathematical formula. You will use string expressions, assignment statements, input and output statements to communicate with the user. 
1. Create a new file called SphereVolume.java in your IDE or text editor.
2. Translate the algorithm below into Java, using the hints in 4 through 7 below. 

   Pseudo-code for SphereVolume.java:

       Print the purpose of the program
       Print a prompt asking for the diameter of a sphere
       Read the diameter
       Calculate the radius as diameter divided by 2
       Calculate volume of the sphere using the formula (V = (4/3)*pi*(r^3))
       Print the volume 

3. Using the Scanner class, print a prompt to the user asking for the diameter of a sphere. 
4. Read in diameter which you will store in a variable called diam. Declare it as a double. There are two ways to read in the value.
   - First option is to use in.next(), which returns the user input is returned as a String. Then you will need to use the method Double.parseDouble(<user input>) to change the String user input into a double.
   - Second option is to use in.nextDouble(), which returns a double directly. Either choice will cause an exception if the user enters something that does not parse into a double, but do not do any error-checking for now.
5. The diameter is twice as long as the radius, so calculate and store the radius in an appropriately named variable. 
6. Calculate volume of the sphere. Use the built-in Java math methods Math.PI for p and Math.pow to cube the radius. 
7. Print the volume with appropriate labels.
8. Compile the program and debug, repeating until it compiles successfully.
## Lab Grade
100/100
