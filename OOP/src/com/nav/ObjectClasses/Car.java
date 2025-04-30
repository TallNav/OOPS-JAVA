package com.nav.ObjectClasses;

class CarDetails{
    String model;
    String year;
    String color;

    CarDetails(String model, String year, String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return "This is "+this.model+" in year : "+this.year+" its colored in : "+this.color;
    }
}
public class Car {
    public static void main(String[] args) {
        CarDetails c1 = new CarDetails("Porsche" , "1982" , "Red");
        System.out.println(c1);
    }

}
