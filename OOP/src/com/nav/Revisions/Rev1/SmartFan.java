package com.nav.Revisions.Rev1;

class SmartFan extends SmartApp implements Controllable{

    SmartFan(String brand) {
        super(brand);
    }
    public int currentSetting = 0;
    public void status(){
        System.out.println("The current setting of the Fan is "+currentSetting);
    }
    public void increaseSetting(){
        if(currentSetting < 5) currentSetting++;
        if (currentSetting == 5) System.out.println("Cannot increase the speed further!");
        status();
    }

    public void decreaseSetting(){
        if(currentSetting > 0) currentSetting--;
        if (currentSetting == 0) System.out.println("Cannot decrease the speed further!");
        status();


    }
//    void operate(){
//        if(currentSetting <= 3 && currentSetting!=0) {System.out.println("Fan spins lightly");status();}
//
//        if(currentSetting > 3) {System.out.println("Fan spins Heavily!");status();}
//
//        else System.out.println("Device is switched off");
//    }
}