package esenReviews;

public class Paper {

    public static void main(String[] args) {
        String str = "Published on 2022 Feb 12";
        // trim(); => removes the white spaces in the beginning and end
        str = str.trim();
        String year = str.substring(str.length()-4);
        System.out.println(year);
    }
}
