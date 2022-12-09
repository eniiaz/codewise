package groceryStore;

public class Buyer {
    String fullName;
    int age;
    boolean isResident;
    String address;
    public void enterInfo(String name, int age1, boolean resident, String address1){
        fullName = name;
        age = age1;
        isResident = resident;
        address = address1;
    }
    // dispay
    public void display(){
        System.out.println("Buyer's display");
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Resident: " + isResident);
        System.out.println("Address: " + address);
    }

    // create a method that updates the residency of the user
    // Pseudo code
    // list of instrcutions we want to follow when coding
    // updateResidency

    public void updateResidency( boolean newResidency ){
        isResident = newResidency;
    }




}
