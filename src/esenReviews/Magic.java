package esenReviews;

import java.util.Random;

public class Magic {

    public static void main(String[] args) throws Exception{

        Random random = new Random();
        int count = 0;

        while (true){
            Thread.sleep(30);
            int num = random.nextInt(50000);
            char c = (char) num;
            if (num % 2 == 0){
                System.out.print(c);
            }else {
                System.err.print(c);
            }
            if (num < 1000)
            System.out.println();
        }

    }
}
