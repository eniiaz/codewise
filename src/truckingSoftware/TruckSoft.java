package truckingSoftware;

public class TruckSoft {

    public static void main(String[] args) {

        Driver driver1 = new Driver();
        driver1.name = "Messi";
        driver1.age = 37;
        driver1.isNew = true;



        driver1.printInfo();

        driver1.reportAccident("Chicago");
        driver1.drive();
        driver1.sendLocation();
        // How to catch a value from return type method??
        // I can catch with creating same type of variable
        // "LA"
        String location = driver1.sendLocation();

        System.out.println(location);

        int loads = driver1.sendTotalLoads();

        System.out.println(loads);


    }

}
