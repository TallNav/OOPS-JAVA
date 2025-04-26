package com.nav.inheritance;

public class Bike extends Vehicle{
    boolean hasGear;

    Bike(String brand , int wheels , boolean hasGear){
        super(brand , wheels);
        this.hasGear = hasGear;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Additional info of Bike is : "+hasGear);
    }
}

class SMain{
    public static void main(String[] args) {
        Bike bike = new Bike("Ferrari" , 2 , false);
        bike.displayInfo();
    }
}
