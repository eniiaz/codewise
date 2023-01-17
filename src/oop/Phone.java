package oop;

public class Phone extends Object{

    public Phone(){
        super();
        System.out.println("This is Phone default constructor");
    }

    public  String brand;
    protected String color;
    public double price;

    public void call(){
        System.out.println("Phone is calling");
    }

    public void ring(){
        System.out.println("Phone is ringing");
    }

    public void receiveCall(){
        System.out.println("Receive a call");
    }

    public void hangUp(){
        System.out.println("Hang up phone");
    }

}
