package liveCoding;

public class Projector {

    public static void main(String[] args) {
        for (int i = 0; i <=99; i++){
            if (i != 0 && i % 10 == 0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
        charAppears("I want a vacation!", 'a');
    }

    public static void charAppears(String str, char c){
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);

            if(temp == c){
                counter++;
            }
        }
        System.out.println("rEsult: " + counter);
    }
}
