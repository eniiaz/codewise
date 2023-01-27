package oopRecap;

import oop.Phone;

public class SmartPhone extends Phone {

    public SmartPhone(String str){
        super();
        this.color = str;
    }
    // this => it is a instance representation of the current class
    public SmartPhone(){
        super();
        System.out.println("Hey this is SmartPhone default constructor");
    }

    public void takePicture(){
        this.color = "red";
        System.out.println("Smartphone is taking a picture");
    }


    public static void welcome(){
        System.out.println("Welcome in Smartphone");
    }

    // Static method cannot be overriden.
    // However, child class can create its own version for inherited static method.
    // This is called method hiding. The original inherited static method is now hidden
    // in child class.
    // We don't use any annotation for this. And @override doesn't work for this.

}
