package Inheritance.Single_Level;

class Appliance {
    void turnOn() {
        System.out.println("Appliance is now ON.");
    }

    void turnOff() {
        System.out.println("Appliance is now OFF.");
    }
}

// Child class
class WashingMachine extends Appliance {
    void washClothes() {
        System.out.println("Washing machine is washing clothes...");
    }
}

// Main class
public class program5 {
    public static void main(String[] args) {
        WashingMachine myWasher = new WashingMachine();  // Create an object of the WashingMachine class
        myWasher.turnOn();          // Call inherited method from Appliance class
        myWasher.washClothes();     // Call method specific to WashingMachine class
        myWasher.turnOff();         // Call inherited method from Appliance class
    }
}
