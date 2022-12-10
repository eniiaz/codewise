package esenReviews;

public class Cupcake {

    public static void main(String[] args) {
        String text = "I really love programming";
        // cut the "prog" from this sentence using indexOf method and substring
        // when you use string in indexOf it returns the index of first letter
        // for example: text.indexOf("really") -> 2
        int start = text.indexOf("program");
        int end = text.indexOf("ram");
        String newString = text.substring(start, end);
        System.out.println(newString);
        // Please go to value of text and find if there is a text "program"
        // if there is a text "program" then please tell me the index of "p"
        System.out.println(start);
        int i = text.indexOf("ming");
        System.out.println(i);
        int a = text.indexOf("e", 5);
        System.out.println(a);



    }

}
