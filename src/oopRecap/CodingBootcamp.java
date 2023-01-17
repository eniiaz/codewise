package oopRecap;

import oop.Phone;

public class CodingBootcamp extends School{

    public void teachCoding(){
        System.out.println("Coding");
    }

    @Override
    public IPhone getPhone(){
        return null;
    }

    @Override
     void teach(){
        System.out.println("Teaching in Bootcamp style");
    }


    @Override
    public void studentEnroll(){
        System.out.println("Enrollment in Coding Bootcamp");
    }
}
