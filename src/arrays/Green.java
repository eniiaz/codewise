package arrays;

import java.util.Arrays;

public class Green {

    public static void main(String[] args) {
        int age = 35;
        char letter = 'S';

        // Wrapper class
        // convert age and letter to Object type. Wrapper class
        // Autoboxing: converting from primitive to object
        Integer i = age;
        System.out.println(i);
        System.out.println(age);

        Character c = letter;
        // unbox both i and c into primitive data types. Create new ones
        char s = c;
        int w = i;
        Boolean b = true; // boolean b = true;
        boolean v = b;

//        Arrays.toString(arr); => print all values in that array
        // Utility method

        System.out.println(Integer.sum(6,4));
        System.out.println(Integer.max(45,23));
        System.out.println(Long.MAX_VALUE);

        char cc = 'l';
        System.out.println(Character.isDigit(cc));
        System.out.println("Password validation\n");
        System.out.println(validatePassword("James!0"));

        getDigits("H23el5l0o 202wed3!");
    }

    public static void getDigits(String word){
        String numbers = "";
        for (int i = 0; i < word.length(); i++){
            char letter = word.charAt(i);
            if (Character.isDigit(letter)){
                // "2" + "0" = "2023"
                numbers = numbers + letter;
            }
        }
        int result = Integer.parseInt(numbers);
        System.out.println("Numbers: " + (result > 10));
    }



    public static boolean validatePassword(String password){
// James2022!
        boolean found = false;
        for (int i = 0; i < password.length(); i++){
            char letter = password.charAt(i);
            if (Character.isDigit(letter)){
                found = true;
                break;
            }
        }
        return found;
    }

}
