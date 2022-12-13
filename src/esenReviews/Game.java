package esenReviews;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Random random = new Random();
        int someRandom = random.nextInt(11);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please guess the number");
        int guess = scanner.nextInt();

        if (guess > someRandom){
            System.out.println("Your guess is too high");
        }
        else if(guess < someRandom){
            System.out.println("Your guess iis too low");
        }
        else {
            System.out.println("Congratulations!");
        }
        System.out.println("Random number was: " + someRandom);
    }
}
