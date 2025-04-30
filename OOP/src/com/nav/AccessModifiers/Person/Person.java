package com.nav.AccessModifiers.Person;

public class Person {
    public String name;
    private int age;
    protected String nationality;

    public Person(){
        name = "DEFAULT";
        age = 0;
        nationality = "Default";
    }

    public Person(String name , int age , String nationality){
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public void display(){
        System.out.println("The name is : "+this.name+" age is : "+this.age+" nationality is : "+this.nationality);
    }
}
