package esenReviews;

public class Practice {

    public static void main(String[] args) {

        String city = "  Chicago ";
        System.out.println(city.length());
        city = city.trim(); // remove whitespace if it has. ONLY in the beginning and in the end
        System.out.println(city.length());

        String state = "Washington";
        state = state.substring(3); // it starts cutting from given index
        System.out.println(state);
        String s = state.substring(3,7); // it cuts the string between given 2 index. First one is inclusive, second index exclusive

        String myCity = "Chicago";
        String ss = myCity.substring(4); // => ago
        System.out.println(ss);
        String s2 = myCity.substring(2,5); // => ica
        System.out.println(s2);

        String course = "I really love Programming";
        boolean starts = course.startsWith("Prog");

        String empty = " ";
        boolean check = empty.isEmpty();
        System.out.println(check);

        int ind = course.indexOf('a');
        System.out.println(ind);
        // Cut the course "Prog" and store it into new String variable and print it out
        int endIndex = course.indexOf("ramming");
        System.out.println(endIndex);
        String newCourse = course.substring(0,endIndex);
        System.out.println(newCourse);

    }

}
