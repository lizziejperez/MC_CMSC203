# Lab 7 - 2D Arrays
## Objectives
- Be able to declare two-dimensional arrays
- Be able to pass two-dimensional arrays to methods
- Be able to return a two-dimensional array from methods
- Be able to process a two-dimensional array in a Java Method
- Be able to work with individual rows and columns in a two-dimensional array 
## Introduction
In this Lab, you will work with a 4-row, 20-column, two-dimensional array of integers. You will write methods that perform the following operations:
1. Fill the 2-D array with random numbers between 50 and 80.
2. Print the array.
3. Set every array element of a given row to a specified value. The value is a parameter of a method.
4. Find the minimum value in a given column of the array. The column is a parameter of a method.
5. Count the number of elements of the array having a specified value. The value is a parameter of a method.

To visualize how the two-dimensional array is working, your result will animate a bar graph. The  
Code for the bar graph is provided to you as BarChart.java. So, the framework for this lab will animate your algorithm, which will support you in checking the accuracy of your Java program.
## Task #1 - Print Array to Console
1. For printing array to console, please make a complete implementation of the method: public void printArray()
2. For console printing, elements are separated by a space. The instance variable named intArray is the integer array to be printed.
3. To animate the algorithm, put this method call as the last element in your inner for loop animate( row, column );. Here row is the index of the array's current row, and column is the index of the array's current column.
## Task #2 - Set All Elements in a Row to a Specified Value
1. Please, implement the setValues( int value, int row ) method that sets all the elements in the specified row to a specified value.
2. The instance variable named intArray is the integer array.
3. To animate the algorithm, put this method call as the last element in your for loop animate( row, column );. Here row is the index of the array's current row and column is the index of the array's current column.
## Task #3 - Find Minimum Value in the Specified Column
1. Implement the method public int findMinimum( int column ) that finds the minimum value in the specified column.
2. Again, the instance variable named intArray is the integer array.
3. To animate the algorithm, put this method call as the last element in your for loop animate( row, column );. Here row is the index of the array's current row and column is the index of the array's current column.
4. Notice that a dummy return statement (return 0) is provided at the end of public int findMinimum( int column ) method so that the source code will compile in its present state. In this way, you can write and test each method separately, which is known as the step-wise refinement. When you are ready to write the public int findMinimum( int column ) method, just replace the dummy return statement with the appropriate return statement for the method.
## Task #4 - Find Frequency of a Given Value in the Array
1. Implement the method public int countFound( int value ) that counts the number of times a given value is found in the array.
2. The instance variable named intArray is the integer array.
3. To animate the algorithm, put this method call as the last element in your for loop animate( row, column );. Here row is the index of the array's current row and column is the index of the array's current column
4. Notice that a dummy return statement (return 0) is provided at the end of public int countFound( int value ) method so that the source code will compile in its present state. In this way, you can write and test each method separately using the step-wise refinement. When you are ready to write the public int countFound( int value ) method, just replace the dummy return statement with the appropriate return statement for the method.
## Lab Grade
100/100
