package mentoring;

import java.util.Scanner;

public class Teacher {

    private String fullName;
    private String username;
    private String password;
    private String title;

    public Teacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name: ");
        this.fullName = scanner.nextLine();
        System.out.println("Enter username: ");
        this.username = scanner.nextLine();
        System.out.println("Enter password: ");
        this.password = scanner.nextLine();
        System.out.println("Enter title: ");
        this.password = scanner.nextLine();
        System.out.println("mentoring.Teacher successfully created!");
        System.out.println("Login info\nusername: " + this.username + "\npassword: " + this.password);
    }
}
