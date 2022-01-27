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
7. Compile and debug. Do not run. 
## Task #2: Writing a Constructor
## Task #3: Methods
## Task #4: Running the Application
## Task #5: Creating another instance of a Television
## Lab Grade
100/100
