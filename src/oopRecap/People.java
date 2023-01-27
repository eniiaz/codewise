package oopRecap;

import oop.Phone;

public class People {

    public static void main(String[] args) {
        Home h1 = new Apartment();
        SmartPhone.welcome();
        Phone.welcome();
        // The purpose of the line 6,
        // is to achieve abstraction in Java.
        // Abstraction in Java is hiding the impelemntation of
        // a certain method
        // Creating reference from Home h1 and creating Child
        // of Home in the object side, I am fully achieving
        // abstraction.
        h1.lock();
        h1.enter();

        WaterResistable wr = new IPhone();
        wr.takeUnderWater();
        wr.keepTheDeviceProtected();
    }

}
