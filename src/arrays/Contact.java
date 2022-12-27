package arrays;

import mentoring.Student;

public class Contact {

    public static void main(String[] args) {
        // Create an array that can store all country codes
        // for examples: 1, 996, 7, 955, ....

        int [] countryCodes = new int[5];
        countryCodes[3] = 1;
        countryCodes[0] = 996;
        countryCodes[4] = 7;
        System.out.println(countryCodes[3]);

        String [] countries = new String[10];
        countries[2] = "Mexico";
        countries[9] = "France";


        Student [] students = new Student[8];
        Student student = new Student();
        student.fullName = "Sheker";
        students[0] = student;



    }

}
