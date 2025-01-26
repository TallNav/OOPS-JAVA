package com.nav.packages.school;
import com.nav.packages.student.*;

/*
 * Assignment: Understanding Packages, Static Elements, and Access Modifiers
 *
 * Objective:
 * - Create a program to explore the use of packages, static variables, and static methods,
 *   along with access modifiers like public and default (package-private).
 *
 * Tasks:
 * 1. Create a package named `com.nav.packages.student`.
 * 2. Inside the package, define a class `StudentDetails` with:
 *    - Two instance variables: `name` (String) and `rollNo` (int).
 *    - A static variable `totalStudents` to keep track of the total number of students.
 *    - A constructor that initializes `name` and `rollNo` for a student.
 *    - A static method `incrementStudentCount` that increments the `totalStudents` variable.
 *    - A non-static method `getStudentDetails` that displays the student's name and roll number.
 *
 * 3. In the same package, create a public class `Student` containing the `main` method.
 *    - In the `main` method, create multiple `StudentDetails` objects.
 *    - Call the `incrementStudentCount` method whenever a new student object is created.
 *    - Display the details of each student using the `getStudentDetails` method.
 *
 * 4. Create another package named `com.nav.packages.school`.
 * 5. Inside this package, define a class `SchoolDetails` with:
 *    - A static method `getTotalStudents` that prints the value of `totalStudents` from the `StudentDetails` class.
 *
 * 6. Create a public class `School` in the same package as `SchoolDetails`.
 *    - In the `main` method of `School`, invoke the `getTotalStudents` method to display the total number of students.
 *
 * Expected Output:
 * - The program should display the details of all students and the total number of students created.
 *
 * Note:
 * - Ensure proper use of packages and access modifiers.
 * - Ensure the file names match the public class names.
 */


public class School {
    public static void main(String[] args) {
        Student s1 = new Student("Messi", 10);
        Student s2 = new Student("Pedri", 8);
        Student s3 = new Student("Yamal", 19);
        Student s4 = new Student("Cubarsi", 2);

        System.out.println("Total No of students : ");
        schoolDetails.getTotalStudents();
        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();
        s4.getStudentDetails();

    }

}

class schoolDetails{
    static void getTotalStudents(){
        System.out.println(Student.totalStudents);
    }
}
