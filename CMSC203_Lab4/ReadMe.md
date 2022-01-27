# Lab 4 - Classes adn Objects (TV)
## Objectives
Be able to ...
- Declare a new class 
- Write a constructor
- Write instance methods that return a value
- Write instance methods that take arguments
- Instantiate an object
- Use calls to instance methods to access and change the state of an object
## Television UML Diagram
| Television |
| - |
| -MANUFACTURER: String |
| -SCREEN_SIZE: int |
| -powerOn: boolean |
| -channel: int |
| -volume:int |
| -------------------------------------- |
| +Television(brand: String, size: int): |
| +setChannel(station: int): void |
| +power(): void |
| +increaseVolume(): void |
| +decreaseVolume(): void |
| +getChannel(): int |
| +getVolume(): int |
| +getManufacturer(): String |
| +getScreenSize(): int |
## Task #1: Creating a New Class
1. In a new file, create a class definition called Television.
2. Put a documentation string right before the class header 

       /**
       *The purpose of this class is to model a television
       *Your name and today’s date
       */
3. Declare the two constant fields listed in the UML diagram.
4. Declare the three remaining fields listed in the UML diagram.
5. Write a comment for each field indicating what it represents.
6. Save this file as Television.java.
7. Compile and debug. Do **not** run. 
## Task #2: Writing a Constructor
1. Create a constructor definition that has two parameters, a manufacturer’s brand and a screen size. These parameters will bring in information.
2. Inside the constructor, assign the values taken in from the parameters to the corresponding fields.
3. Initialize the powerOn field to false (power is off), the volume to 20, and the channel to 2.
4. Write comments describing the purpose of the constructor above the method header.
5. Compile and debug. Do **not** run. 
## Task #3: Methods
1. Define accessor methods called getVolume, getChannel, getManufacturer, and getScreenSize that return the value of the corresponding field.
2. Define a mutator method called setChannel accepts a value to be stored in the channel field. 
3. Define a mutator method called power that changes the state from true to false or from false to true.
4. Define two mutator methods to change the volume. One method should be called increaseVolume and will increase the volume by 1. The other method should be called decreaseVolume and will decrease the volume by 1.
5. Write javadoc comments above each method header.
6. Compile and debug. Do **not** run.  
## Task #4: Running the Application
1. You can only execute (run) a program that has a main method, so there is a driver program that is already written to test out your Television class. Copy the file TelevisionDemo.java in the same directory as Television.java.
2. Compile and run TelevisionDemo and follow the prompts. 
3. If your output matches the output below, Television.java is complete and correct. You will not need to modify it further for this lab.

   Output:

       A 55 inch Toshiba has been turned on.
       What channel do you want? 56
       Channel: 56 Volume: 21
       Too loud!! I am lowering the volume.
       Channel: 56 Volume: 15 
## Task #5: Creating another instance of a Television
1. Edit the TelevisionDemo.java file.
2. Declare another Television object called portable.
3. Instantiate portable to be a Sharp 19 inch television.
4. Use a call to the power method to turn the power on.
5. Use calls to the accessor methods to print what television was turned on.
6. Use calls to the mutator methods to change the channel to the user’s preference and decrease the volume by two.
7. Use calls to the accessor methods to print the changed state of the portable.
8. Compile and debug this class.
9. Run TelevisionDemo again.
10. The output for task #5 will appear after the output from above, since we added onto the bottom of the program. The output for task #5 is shown below.

   Output:

       A 19 inch Sharp has been turned on.
       What channel do you want? 7
       Channel: 7 Volume: 18 
## Lab Grade
100/100
