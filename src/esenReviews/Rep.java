package esenReviews;

public class Rep {

    public static void main(String[] args) {

        String sentence = "I love playing";


        System.out.println(sentence);
        // replace 'i' with 'a' => we use method called replaceAll
        String s = sentence.replace('i','a');
        System.out.println(s);
        // Remove all whitespaces in the sentence
        String ss = sentence.replace(" ", "");
        String s3 = sentence.replaceAll("i", "a");

        System.out.println(s3);

        // charAt => takes integer and returns char
        // indexOf => takes char and return integer

    }
}
