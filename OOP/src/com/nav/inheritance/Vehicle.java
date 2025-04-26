package com.nav.inheritance;

public class Vehicle {
    String brand = "Hotwheels";
    int wheels = 0;

    void displayInfo(){
        System.out.println(brand + " "+ wheels);
    }

    public Vehicle(String brand , int wheels){
        this.brand = brand;
        this.wheels = wheels;
    }

}





