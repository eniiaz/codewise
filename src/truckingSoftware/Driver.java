package truckingSoftware;

public class Driver{

    String name;
    int age;
    boolean isNew;

    public void printInfo(){
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is driver new: " + isNew);
    }

    // Create a method called reportAccident
    // Method should take the location from driver and print following format message
    // "%driverName got in accident in %givenLocation"

    public void reportAccident(String location){
        System.out.println("\n"+name + " got it accident in " + location);
    }

    // This method should print out "%name is driving"
    public void drive(){
        System.out.println("\n" + name + " is driving");
    }

    // Create method called sendLocation
    // This method should send the location back to who is calling.
    // Location is "LA"
    public String sendLocation(){
        // here anything you want
        // huge block of code that can figure out your location
        return "LA";
    }

    // Create a method sendTotalLoads
    // return today's number of loads
    public int sendTotalLoads(){
        int totalLoads = 5;
        return totalLoads;
    }







}
