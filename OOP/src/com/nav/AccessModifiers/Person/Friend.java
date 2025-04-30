package com.nav.AccessModifiers.Person;

public class Friend {
    public static void main(String[] args) {
        Person p1 = new Person("Naruto" , 20, "Japanese");
        Person p2 = new Person("Itachi", 27 , "Japanese");

        p1.display();
        p2.display();
    }
}
