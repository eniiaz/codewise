package loops;

public class Desk {

    public static void main(String[] args) {

        String title = "OK Class. We done!";
        printEachLetter(title);

    }

    public static void printEachLetter(String word){
        if(word.isEmpty()){
            System.out.println("Invalid data. String cannot be empty");
        }else{
            for (int i = 0; i < word.length(); i++){
                // get each character from string
                char c = word.charAt(i);
                System.out.println(c);
            }
        }
    }


    // create public static method
    public static void checkEvenOrOdd(int number){
        if(number % 2 == 0){
            // even
            for (int i = 1; i <= 30; i++){
                System.out.println(i + ". Hi");
            }
        }
        else {
            // odd
            for (int i = 0; i < 30; i++){
                System.out.println((i+1) + ". Hello");
            }
        }
    }


    public static void printAllNumbers(int number){
        if (number > 0){
            // print numbers
            for (int i = 0; i <= number; i++){
                System.out.println(i);
            }
        }
        else {
            // number is negative
            System.out.println("Invalid number. Please try again");
        }
    }



}
