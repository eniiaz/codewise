package esenReviews;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the message:");
        String message = scanner.nextLine();

        if (!message.isEmpty() && message.endsWith(".")){
            // we want to continue and check for second condition
            System.out.println("The message is valid!");
        }
        else{
            System.out.println("The message is invalid");
        }

        // Nested If statement: when we use if statement inside the if statement
        // When do we use this?
        // - When we have multiple conditions to check
    }

}
