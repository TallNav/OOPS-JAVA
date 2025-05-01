package com.nav.Revisions.Rev1;

abstract class SmartApp{
    protected String brand;
    private boolean isOn = false;
    public void togglePower(){
        System.out.println("The appliance "+this+" is turned on ");
        isOn = true;
    }
    //abstract void operate();

    SmartApp(String brand){
        this.brand = brand;
        System.out.println("Device of brand : "+this.brand+" is created!");
    }
}
