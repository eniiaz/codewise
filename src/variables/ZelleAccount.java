package variables;

public class ZelleAccount {

    String fullName;
    String phoneNumber;
    double balance;
    String address;
    String bankName;

    static int totalUsers;
    static double totalMoney;

    public ZelleAccount(String fullName, String phoneNumber, String bankName){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.bankName = bankName;
        totalUsers++;
    }

    public void depositMoney(double amount){
        System.out.println("\nMoney deposit successfully");
        this.balance += amount;
        totalMoney += amount;
    }

    public void transferMoney(String phoneNumber, double amount){
        if(this.balance >= amount){
            System.out.println("\n Transfer money to " + phoneNumber + " is successful");
            this.balance -= amount;
        }
        else{
            System.out.println("Insufficient funds! Transfer failed");
        }
    }

    public void info(){
        System.out.println("\nAccount details");
        System.out.println("Name: " + this.fullName);
        System.out.println("Balance: " + this.balance);
        System.out.println("Bank: " + this.bankName);
        System.out.println("Phone number: " + this.phoneNumber);
    }

    public static void customerService(){
        System.out.println("\nCall to 888-348-2323");
    }

    public static void zelleInfo(){

        System.out.println("\nUsers: " + totalUsers);
        System.out.println("Money: " + totalMoney);
    }

}
