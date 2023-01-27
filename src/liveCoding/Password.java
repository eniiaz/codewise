package liveCoding;

import java.util.ArrayList;

public class Password {

    public static ArrayList<String> passwords = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println(hasNumber("434532345"));
        savePassword("James2023");
        savePassword("Codewise");
        System.out.println(passwords);
        int age;
    }

    public static void savePassword(String password){
        if (password.length() >= 6 && hasNumber(password)){
            passwords.add(password);
        }
    }

    public static boolean hasNumber(String password){
        boolean hasNumber = false;
        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if(Character.isDigit(c)){
                hasNumber = true;
                break;
            }
        }
        return hasNumber;
    }
}
