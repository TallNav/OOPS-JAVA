package com.nav.OOPpillarsPractice;


import java.util.ArrayList;
import java.util.List;

abstract class Animal{
    private String name;
    private int age;

    Animal(){
        this.name = name;
        this.age = age;
        //System.out.println("We are looking at "+this.name+" who is "+this.age+" old.");
    }

    public String getter(){
        return "Animal is called : "+this.name+" is of age : "+this.age;
    }
    public void setter(String name , int age){
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();

}

class Dog extends Animal{

    @Override
    void makeSound(){
        System.out.println("WOOF WOOF!!");
    }
}

class Cat extends Animal{

    @Override
    void makeSound(){
        System.out.println("MEOW MEOW!!");
    }
}

public class AnimalSystem {

    public static void main(String[] args) {

        Cat bittu = new Cat();
        bittu.setter("Bittu",10);
        Dog pondy = new Dog();
        pondy.setter("Pondy",20);
        Cat kayan = new Cat();
        kayan.setter("Kayan",11);
        Cat michi = new Cat();
        michi.setter("Michi",21);
        Dog jimmy = new Dog();
        jimmy.setter("Jimmy",13);

        Animal[] zoo = {bittu,pondy , kayan, michi, jimmy};

        for(Animal obj : zoo){
            System.out.println(obj.getter());
            obj.makeSound();
        }


    }
}
