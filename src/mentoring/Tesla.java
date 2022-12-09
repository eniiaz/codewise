package mentoring;

public class Tesla {

    public static void main(String[] args) {
        signUp("James", "j4323", "james2022");

        String email = "CHICAGO2022@gmail.com";

        // toLowerCase() this is a method that is already pre built by Java to convert
        // any string to all lower case
        String newEmail = email.toLowerCase();
        System.out.println(newEmail);
//        +1 773 847 7273
//            773 546 3243
//            773-234-6546
        // I want just 10 digits, no space, no dash, no country code
        String phoneNumber = "773-847-7273";
        // 1. step: remove +
        // 2. step: remove spaces
        // 3. step: if it is 11 digits then remove the first character

        phoneNumber = phoneNumber.replaceAll(" ", "");
        phoneNumber = phoneNumber.replaceAll("-", "");
        phoneNumber = phoneNumber.replaceAll("\\+", "");

        System.out.println(phoneNumber);

    }

    // Create method signUp that takes 3 parameters for name, username, password
    // method doesn't return anything
    // check the password, if password is at least 6 characters success if not fail
    public static void signUp(String name, String username, String password){
        // String manipulation starts
        // I need to be able to manipulate, get some
        // infomation about strings, change things in string
        int l = password.length();
        System.out.println(l);
    }

}
