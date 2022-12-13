package esenReviews;

public class Even {

    public static void main(String[] args) {
        int age = 3456;
        // how do we find if the number is even
        // if we divide by 2 and remainder is 0 that means the number is even
        // otherwise it is odd
        if(age % 2 == 0){ // modulus or remainder
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
