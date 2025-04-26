package com.nav.inheritance;

public class Car extends Vehicle{
    int doors = 0;

    Car(String brand , int wheels , int doors){
        super(brand , wheels);
        this.doors = doors;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("Additional info of Car is : "+doors);
    }
}

class Main{
    public static void main(String[] args) {
        Car car = new Car("Toyota" , 10 , 3);
        car.displayInfo();
    }
}