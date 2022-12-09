package mentoring;

import java.util.Scanner;

public class Student {

    private String fullName;
    private String username;
    private String email;
    private String password;

    public Student(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name: ");
        this.fullName = scanner.nextLine();
        System.out.println("Enter username: ");
        this.username = scanner.nextLine();
        System.out.println("Enter email: ");
        this.email = scanner.nextLine();
        System.out.println("mentoring.Student created successfully!");
        System.out.println("Please check your email to complete registration");
    }


}
