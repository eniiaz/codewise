package variables;

public class Cat {

    // Instance variable
    // The information or data that belongs or that describes the object
    // of this class
    String name;
    int age;
    String breed;
    String gender;
    boolean isVaccinated;
    String owner;
    static String hospitalAddress;

    public Cat(String name){
        this.name = name;
        // Because Java prefers the local first
    }

    public void info(){
        System.out.println("\n Cat Information");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Breed: " + this.breed);
        System.out.println("Owner:  " + this.owner);
        System.out.println("Vaccinated: " + this.isVaccinated);
        System.out.println("Gender: " + this.gender);
    }

}
