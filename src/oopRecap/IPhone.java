package oopRecap;

public class IPhone extends SmartPhone implements WaterResistable{


    @Override
    public void takeUnderWater() {
        System.out.println("Iphone taking it to underwater");
    }

    @Override
    public void keepTheDeviceProtected() {
        System.out.println("We keeping it clean");
    }


}
