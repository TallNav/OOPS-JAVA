package com.nav.Revisions.Rev1;

class SmartLight extends SmartApp implements Controllable{


    SmartLight(String brand) {
        super(brand);
    }
    public int currentSetting = 0;

    public void status(){
        System.out.println("The current setting of the Light is "+currentSetting);
    }
    public void increaseSetting(){
        if(currentSetting < 5) currentSetting++;
        if (currentSetting == 5) System.out.println("Cannot increase the brightness further!");
        status();
    }

    public void decreaseSetting(){
        if(currentSetting > 0) currentSetting--;
        if (currentSetting == 0) System.out.println("Cannot decrease the brightness further!");
        status();
    }
//    void operate(){
//        if(currentSetting <= 3 && currentSetting!=0) {System.out.println("Light glows lightly");status();}
//
//        if(currentSetting > 3) {System.out.println("Light glows Brightly!");status();}
//        else System.out.println("Device is switched off");
//    }
}
