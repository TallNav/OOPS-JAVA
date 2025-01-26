package com.nav.packages;


/*
Assignment: Understanding Packages, Static Elements, and Static vs Non-Static

Objective:
- Understand how to use packages.
- Learn how static variables, static methods, and static blocks work.
- Explore the relationship between static and non-static members.
- Practice accessing static members from non-static methods and vice versa.

Instructions:
1. Create a new package named `com.assignment.staticexample`.

2. Create a `Calculator` class inside the package with the following:
   - Static Variable:
     static int objectCount = 0;
     (Keeps track of the number of `Calculator` objects created.)

   - Static Method:
     static int add(int a, int b);
     (Performs addition and returns the result.)

   - Non-Static Variables:
     int x, y;

   - Non-Static Method:
     void setNumbers(int a, int b);
     (Sets values for x and y.)

   - Non-Static Method Using Static Variable:
     void showObjectCount();
     (Displays the total number of objects created.)

   - Static Method Using Non-Static Members:
     Explain that static methods cannot directly access non-static members.

   - Constructor:
     Increment the static variable `objectCount` whenever an object is created.

   - Static Block:
     Print a message during the first class load.

3. This class should demonstrate the following:
--Access the static variable objectCount directly using the class name.
--Call the static method add() using the class name.
--Create two objects of the Calculator class and set values using the non-static method setNumbers().
--Display the values of the non-static variables x and y for each object.
--Call showObjectCount() to display the number of objects created.
--Demonstrate that you cannot directly access non-static variables from the static method cannotAccessInstanceVariables().

Expected Output:
Static block executed: Initial setup.
Static add method result: 30
Number of Calculator objects created: 2
Object 1: x = 10, y = 20
Object 2: x = 50, y = 100
Static methods cannot directly access non-static variables like x or y.
*/

public class staticExample {
    public static void main(String[] args) {
        System.out.println("Initial number of objects : "+Calculator.objectCount);
        System.out.println(Calculator.add(10,21));

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.setNumbers(8,7);
        c2.setNumbers(22,33);

        System.out.println("FOR C1 : "+c1.x+" "+c1.y);
        System.out.println("FOR C2 : "+c2.x+" "+c2.y);

        c1.showObjectCount();

        Calculator.cannotAccessInstanceVariables();

    }
}

class Calculator{
    static int objectCount = 0;
    static int add(int a , int b){
        return a+b;
    }

    int x,y;

    void setNumbers(int a, int b){
        this.x = a;
        this.y = b;
    }

    void showObjectCount(){
        System.out.println("Number of calculator objs : "+objectCount);
    }

    public Calculator(){
        objectCount++;
    }
    static void cannotAccessInstanceVariables() {
        System.out.println("Static methods cannot directly access non-static variables like x or y.");
    }

    static {
        System.out.println("Static block executed: Initial setup.");
    }



}


