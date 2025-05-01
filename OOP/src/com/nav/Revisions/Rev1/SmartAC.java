package com.nav.Revisions.Rev1;

class SmartAC extends SmartApp implements Controllable{

    SmartAC(String brand) {
        super(brand);
    }
    public int currentSetting = 0;
    public void status(){
        System.out.println("The current setting of the AC is "+currentSetting);
    }
    public void increaseSetting(){
        if(currentSetting < 5) currentSetting++;
        if (currentSetting == 5) System.out.println("Cannot increase the temperature further!");
        status();
    }

    public void decreaseSetting(){
        if(currentSetting > 0) currentSetting--;
        if (currentSetting == 0) System.out.println("Cannot decrease the temperature further!");
        status();
    }
//    void operate(){
//        if(currentSetting <= 3 && currentSetting!=0) {System.out.println("AC is not that cold"); status();}
//
//        if(currentSetting > 3) {System.out.println("AC makes the room like arctic!"); status();}
//
//        else System.out.println("Device is switched off");
//    }
}