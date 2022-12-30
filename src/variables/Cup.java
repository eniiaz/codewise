package variables;

public class Cup {

    public static void main(String[] args) {

        Cat.hospitalAddress = "123 main st";

        Cat tom = new Cat("Tom");
        tom.isVaccinated = true;
        tom.breed = "Hawaiian";
        tom.gender = "Boy";
        tom.info();
        Cat cat1 = new Cat("Katy");
        cat1.gender = "girl";
        cat1.age = 4;
        cat1.owner = "Jane Adams";
        cat1.info();
        tom.owner = "John";

        System.out.println(tom.hospitalAddress);
        System.out.println(cat1.hospitalAddress);
        tom.hospitalAddress = "55 wall st";
        tom.age = 1;
        System.out.println(cat1.age);
        System.out.println(cat1.hospitalAddress);
    }






    public static void sayHello() {
        String name = "James", email, address = "main st";
        int age = 55;

        // 1. initialize during the variable declaration
        // 2. assign value after declaration
        name = "James";
        System.out.println("Hello!");
    }

}
