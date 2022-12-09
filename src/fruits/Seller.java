package fruits;

public class Seller {

    String phoneNumber; // camel case
    String storeName; //
    int numberOfEmployees;
    boolean isHalal;

    public void display(){
        System.out.println("\nSeller's display");
        System.out.println("Full name: " + storeName);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Halal: " + isHalal);
        System.out.println("Number of employees: " + numberOfEmployees);
    }


}
