package daily;

import java.util.Arrays;

public class Keys {

    public static void main(String[] args) {
        String names = "James, John, Ronaldo";
        names.split(",");
        String books = "Book 1: Book2: Book2: Book4";
        String [] booksArray = books.split(":");
        System.out.println(Arrays.toString(booksArray));
        System.out.println(booksArray.length);
    }

}
