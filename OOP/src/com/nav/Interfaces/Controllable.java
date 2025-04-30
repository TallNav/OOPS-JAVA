/*Great! Here’s a simple **interface practice exercise** to solidify your understanding:

---

### 💼 Exercise: *"Appliance Control System"*

#### 🧠 Objective:
Simulate basic operations of electrical appliances using an interface.

---

### 📋 Requirements:

1. **Create an interface** called `Controllable` with the following methods:
   - `void turnOn();`
   - `void turnOff();`

2. **Create two classes** `Fan` and `Light` that implement `Controllable`.
   - Each class should:
     - Print a message when the device is turned ON or OFF.
     - Maintain a `boolean isOn` field to track the current state.

3. **Create a test class** (like `Main`) that:
   - Creates a `Fan` and a `Light`.
   - Turns them on and off.
   - Prints their status accordingly.

---

### 🎯 Bonus Challenge:
Make a list of `Controllable` devices and call `turnOn()` and `turnOff()` on each using a loop — this will show **polymorphism with interfaces**.

---

🚀 Exercise: Smart Home Controller
You're building a basic smart home system. Each device (like a fan, light, speaker, etc.) can be turned on or off, so all of them implement the Controllable interface.

🧩 Your Task:
Keep your Controllable interface as it is.

Create 3 classes: Fan, Light, and Speaker, each implementing Controllable.

In your main() method:

Create one object for each of the 3 classes.

Store them in a Controllable[] array.

Loop over the array and:

Call turnOn() on each.

Then call turnOff() on each.

Add a SmartHomeController class that can turn all devices on or off using a method like controlAll(boolean on).*/

package com.nav.Interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Controllable {
    void turnOn();
    void turnOff();
    void status();
}
class Fan implements Controllable{

    boolean status = false;

    Fan(){}

    public void turnOn(){
        System.out.println("The fan is turned on!");
        status = true;
    }

    public void turnOff(){
        System.out.print("The fan is turned off!\n");
        status = false;

    }
    public void status(){
        System.out.println(status);
    }


}

class Light implements Controllable{
    boolean status = false;

    Light(){}

    public void turnOn(){
        System.out.println("The light is turned on!");
        status = true;
    }

    public void turnOff(){
        System.out.print("The light is turned off!\n");
        status = false;

    }
    public void status(){
        System.out.println(status);
    }
}

class Speaker implements Controllable{
    boolean status = false;

    Speaker(){}

    public void turnOn(){
        System.out.println("The Speaker is turned on!");
        status = true;
    }

    public void turnOff(){
        System.out.print("The speaker is turned off!\n");
        status = false;

    }
    public void status(){
        System.out.println(status);
    }

}

class SmartHomeController{
    List<Controllable> deviceList = new ArrayList<>();

    public void addDevice(Controllable device){
        deviceList.add(device);
    }

    public void turnEverythingOn(){
        for(Controllable c : deviceList){
            c.turnOn();
        }
    }

    public void turnEverythingOff(){
        for(Controllable c : deviceList){
            c.turnOff();
        }
    }
}

class Main{
    public static void main(String[] args) {
        Fan f1 = new Fan();
        Light l1 = new Light();
        Speaker s1 = new Speaker();

        Controllable[] cArray = {f1,l1,s1};
        for(Controllable c : cArray){
            c.turnOn();
        }
        for(Controllable c : cArray){
            c.turnOff();
        }

        SmartHomeController s = new SmartHomeController();
        s.addDevice(f1);
        s.addDevice(l1);
        s.addDevice(s1);

        s.turnEverythingOff();
    }
}