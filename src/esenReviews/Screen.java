package esenReviews;

public class Screen {
    public static void main(String[] args) {
        int a = 50;
        int b = 55;
        int c = 5;

        // What would be the condition for "a" to be maximum?
        // a > b also a > c ==> a is the max
        if (a > b && a>c){
            System.out.println("Max is a: " + a);
        }
        else if(b > a && b > c){
            System.out.println("Max is b: " + b);
        }
        else if(c > a && c > b){
            System.out.println("Max is c: " + c);
        }
        else{
            System.out.println("They are all equal!");
        }

    }
}
