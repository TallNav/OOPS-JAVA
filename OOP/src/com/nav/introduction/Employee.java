/**
 * Assignment:
 * 1. Create a class called `EmployeeDeet` to store employee details (name, id, and salary).
 * 2. Add a constructor to initialize these attributes.
 * 3. Include methods:
 *    - `displayDetails()` to display employee information.
 *    - `updateSalary(double newSal)` to update the salary of an employee.
 * 4. Create a `main` method in another class to:
 *    - Instantiate three employees.
 *    - Display their details.
 *    - Update the salary of one employee and display the updated details.
 */

package com.nav.introduction;

class employeeDeet {

    String name;
    int id;
    double salary;

    employeeDeet(String name , int id, double salary){
        this.name = name;
        this.id= id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Employee ID : " + this.id+"\n"+"Name : "+this.name+"\n"+"Salary : "+this.salary);
    }

    void updateSalary(double newSal){
        this.salary = newSal;
    }

}

public class Employee{
    public static void main(String args[]){
        employeeDeet e1 = new employeeDeet("Navneeth" , 10 , 20000);
        employeeDeet e2 = new employeeDeet("Mew" , 11 , 78000);
        employeeDeet e3 = new employeeDeet("Charmeleon" , 9  ,12000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        e2.updateSalary(50000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();



    }
}
