package mentoring;

public class Admin {

    private String fullName;
    private String email;
    private String password;

    public Admin(String fullName, String email){
        this.fullName = fullName;
        this.email = email;
        this.createPassword();
    }

    private void createPassword() {
        System.out.println("email: " + this.email);
        System.out.println("Email sent to " + this.email + "\nPlease check your email and create password");
    }

    public Teacher addTeacher(){
        Teacher t = new Teacher();
        return t;
    }

    public void addStudent(){

    }

}
