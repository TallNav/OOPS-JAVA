package com.nav.playground;


abstract class ClassA {
    abstract void display();}

interface InterfaceA {
    void display();
}

class MyClass extends ClassA implements InterfaceA{
    @Override
    public void display() {
        System.out.println("Display from MyClass");
    }
}

class Testing{
    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        c1.display();
    }
}


