package mentoring;

public class Space {

    public static void main(String[] args) {

        int t = add(3,5); // what does this statement represent

        // average number
        // overage number of 3 and 5 = 4
        // average number of 4 and 10 and 4 = 6
        // what is the formula? add numbers and divide by quantity of numbers
    }
    // Method modification/change!
    // instead of printing the sum, return it back to user
    public static int add(int number1, int number2){
        // What do I do with those number1 and number2 variables?
        // method parameters can be used ONLY inside this method
        int sum = number1 + number2;
        return sum;
    }

    public static void multiply(int number1, int number2){
        // What do I do with those number1 and number2 variables?
        // method parameters can be used ONLY inside this method
        int result = number1 * number2;
        System.out.println("Result: " + result);
    }


    // I want to tell this method my name and it should add my name when it is welcoming me
    // When I pass "James" it should print "Hey James, Welcome to my program!"
    // Method parameters

    // Method modification/change
    // Method should take the age too
    // Instead of keep printing 45 it should print out whatever I pass
    public static void welcome(String name, int age){
        System.out.println("Hey " + name + ", Welcome to my program!");
        System.out.println("Age: " + age);
    }

}
