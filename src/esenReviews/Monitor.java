package esenReviews;

import javafx.scene.effect.MotionBlur;

public class Monitor {


    public static void main(String[] args) {
        int number1; // variable declaration
        int number2;
        number1 = 45; // assignment
        number2 = 11;
        add(100, 150, 11);
        String city = "Chicago";
        welcome(city);

        double afterTax = calculateSalesTax(150);
        int fee = 10; // for personal fee for each sales
        double totalAmountToPay = afterTax + fee;
        double finalResult = discount20(totalAmountToPay);
        System.out.println("Your total amount to pay: " + finalResult + "$");

    }

    // a. Method signature: return type double,
    // discount20, method parameters -> double type
    // b. declare result for final result
    // c. create variable for discount and calculate
    // d. subtract the discount from total price
    // e. return the final result
    public static double discount20(double totalPrice){
        double result;
        double discount = totalPrice * 0.2;
        result = totalPrice - discount;
        return result;
    }

    public static void welcome(String someCity){
        System.out.println("Welcome to " + someCity);
    }

    // create add method to add two number and print sum
    public static void add(int a, int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
    }

    //  a. Method signature: return type double,
    // calculateSalesTax, method parameters double
    // b. create a variable for total result
    // c. calculate the sales tax and store in double variable
    // d. Add original price and calculated sales tax and store in result
//    e. return result
    public static double calculateSalesTax(double price){
        double result;
        double salesTax = price * 0.06;
        result = price + salesTax;
        return result;
    }







}
