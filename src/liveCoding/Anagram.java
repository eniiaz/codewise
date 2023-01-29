package liveCoding;

import java.util.Locale;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(anagram("a gentleman", "elegant man"));

        // aaabbc
        // ccbbaa
    }

    private static boolean anagram(String word1, String word2) {

        word1 = word1.toLowerCase().replace(" ", "");
        word2 = word2.toLowerCase().replace(" ", "");

        if(word1.length() != word2.length()){
            System.out.println("Not anagram");
            return false;
        }

        // return; => terminates method execution no matter where you are
        for (int i = 0; i < word1.length(); i++){

            char eachLetter = word1.charAt(i);
            int firstWordLetter = findOccurence(word1, eachLetter);
            int secondWordLetter = findOccurence(word2, eachLetter);

            if(firstWordLetter != secondWordLetter){
                System.out.println("Not anagram");
                return false;
            }
        }
        return true;

    }

    // create a method that finds the amount of letters in the given String and returns

    public static int findOccurence(String word, char c){
        int occurence = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == c){
                occurence++;
            }
        }
        return occurence;
    }
}
