package oopRecap;

import oop.Phone;

public class School extends Object{

    String name;
    String address;

    public School(){
        super();
    }

    protected Phone getPhone(){
        Phone phone = new Phone();
        return phone;
    }

    void teach(){
        System.out.println("Teaching");
    }

    public void studentEnroll(){
        System.out.println("enrollment in process");
    }



}
