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

}
