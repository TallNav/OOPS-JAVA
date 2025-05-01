package com.nav.Revisions.Rev1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartAppliance {
    static List<SmartApp> devices = new ArrayList<>();
    public static void main(String[] args) {


        SmartFan f1 = new SmartFan("Phillips");
        SmartLight l1 = new SmartLight("Newton");
        SmartAC a1 = new SmartAC("Daikin");

        devices.add(l1);
        devices.add(f1);
        devices.add(a1);
        Scanner sc = new Scanner(System.in);

        mainMenu(devices);

//        for(SmartApp sa : devices){
//            //sa.operate();
//            //this is needed as the compiler checks the reference type which is SmartApp
//            //But SmartApp doesn't have the methods increaseSetting and decreaseSetting
//            //thus this downcast is needed!
//            Controllable c = (Controllable) sa;
//            c.increaseSetting();
//            //sa.operate();
//
//        }
    }
    public static int mainMenu(List<SmartApp> devices){
        Scanner sc = new Scanner(System.in);
        int mainMenuChoice = -1;

        while (mainMenuChoice != 4) {
            System.out.println("##################################################");
            System.out.println("WELCOME ! WHICH APPLIANCE DO YOU WANT TO OPERATE ? ");
            System.out.println("1. SmartLight");
            System.out.println("2. SmartFan");
            System.out.println("3. SmartAC");
            System.out.println("4. Quit");
            System.out.println("##################################################");

            mainMenuChoice = sc.nextInt();

            if (mainMenuChoice >= 1 && mainMenuChoice <= 3) {
                subMenu(mainMenuChoice, devices);
            } else if (mainMenuChoice == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid Choice!");
            }
        }
        return 0;
    }

    public static int subMenu(int mainChoice, List<SmartApp> devices){

        Scanner sc = new Scanner(System.in);
        SmartApp selected = devices.get(mainChoice-1);
        Controllable c = (Controllable) selected;

        int subMenuChoice = -1;
        while (subMenuChoice != 3) {
            System.out.println("##################################################");
            System.out.println("Select an option");
            System.out.println("1. Increase Setting");
            System.out.println("2. Decrease Setting");
            System.out.println("3. Go Back to Main Menu");
            System.out.println("##################################################");

            subMenuChoice = sc.nextInt();

            if (subMenuChoice == 1) {
                c.increaseSetting();
            } else if (subMenuChoice == 2) {
                c.decreaseSetting();
            } else if (subMenuChoice == 3) {
                System.out.println("Returning to Main Menu...");
            } else {
                System.out.println("Invalid Choice!");
            }

            //c.status(); // display current status


        }
        return 0;
    }
}
