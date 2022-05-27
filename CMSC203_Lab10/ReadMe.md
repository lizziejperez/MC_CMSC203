# Lab 10 - Graphing Functions
## Concepts Tested
- Inheritence
- Interfaces
- Polymorphism
- Abstract Classes
- Overriding Methods
- Graphing with JavaFX
## Task #0 - Study the UML Class Diagram and the code
Familiarize yourself with the code. Follow it from the class GraphDriverFX and its method “start()”, to MainPaneFX, to GraphPanelFX and GraphManager. Run it and observe its behavior. It will be incomplete when you first run it.
## Task #1 - Implement the Line-drawing
When you first run the application, the graph will not be plotted, although the prompts will appear and be handled. In the method drawGraph(double, double, GraphicsContext), add a call to gc.strokeLine(x0Draw, y1Draw, x1Draw, y0Draw) to plot each line segment of the graph.  
Experiment with all three functions provided, varying left and right extents. Notice the gray horizontal line that is plotted at y=0 for reference.
## Task #2 - Add another function
Note that function #3 is a complicated, fairly unpredictable function. Run it with several extents, and note the singularities, where the graph goes to “infinity”. Then notice that the denominator of function #3 is just a cubic polynomial.  
Implement the denominator of function #3 as function #4. Run function #4 to estimate where the function goes to zero, which will of course make function #3 undefined.  Include in your writeup an estimate of the point or points at which function #4 goes to zero.
## Task #3 - Add a fifth function
Very interesting behavior happens with the function f(x)=sin(1/x). Implement it, and run it with various extents. Include in your writeup what you think is happening with the function. At what value of x does the limit not exist?
## Lab Writeup
Task #2 Comment: I estimate that function #4 goes to zero at x values 1 and 3.

Task #3 Comment: As x approaches from the left of –1, the function slowly decreases from under and near 0 to -1. As x approaches from the right of 1, the function slowly increases from above and near 0 to 1. Between the x values –1 and 1, the limit of 0 no longer exists and the function acts like sin(x), onlythe x value for it is changing very rapidly. Also, at the x value 0, the function should not exist.
## Lab Grade
100/100
