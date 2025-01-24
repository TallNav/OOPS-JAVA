package com.nav.introduction;

/*
Objective
Create an Employee class with the following attributes:

name (String)
age (int)
employeeId (String)
salary (double)
Implement methods in the Employee class:

displayDetails(): Print the employee's details.
updateSalary(double newSalary): Update the employee's salary.
In the Main class:

Create at least 3 Employee objects using the constructor.
        Call displayDetails() for each employee.
Update the salary of one employee using updateSalary().
Display the updated details of the employee.*/


//We are creating a class with the following attributes --
class EmployeeDet {
    String name;
    int age;
    int eid;
    double salary;

    //Constructor called EmployeeDet is created with the same args
    //'this' keyword used to bind and attribute to an object / access the attribute to the current object ref
    EmployeeDet(String name, int age, int eid, double salary) {
        this.name = name;
        this.age = age;
        this.eid = eid;
        this.salary = salary;
    }

    //At times when just EmplyeeDet() constructor is used without the args ,
    // these deafult vals are taken
    EmployeeDet(){
        this.name = "Default";
        this.age = 0;
        this.eid = 0;
        this.salary = 0.00;
    }

    //can also pass another constructor+object as an arg.
    //useful when an object needs to contact/use another object's attributes
    EmployeeDet(EmployeeDet other){
        this.name = other.name;
        this.age = other.age;
    }
    void displayDetails() {
        System.out.println(this.name + " " + this.age + " " + this.eid + " " + this.salary);
    }

    void updateSalary(double newSal) {
        this.salary = newSal;
    }

}

public class Main {
    public static void main(String[] args) {
        EmployeeDet e1 = new EmployeeDet("Ram", 23, 1, 50000);
        EmployeeDet e2 = new EmployeeDet();
        EmployeeDet e3 = new EmployeeDet("Raj", 25, 3, 70000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        //prints out the name of e1 as misc = e1
        EmployeeDet misc = new EmployeeDet(e1);
        System.out.println(misc.age);

        e3.updateSalary(20000.00);

        e3.displayDetails();
    }
}