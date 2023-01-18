package zelleTransferApp;

import java.util.ArrayList;

public class ZelleAccount {

    private String fullName;
    private String phoneNumber;
    private double balance;
    private String bankName;

    static int totalUsers;
    static double totalMoney;
    boolean isValidPhoneNumber;

    static ArrayList<ZelleAccount> userList = new ArrayList<>();
    static ArrayList<ZelleAccount> invalid = new ArrayList<>();

    public ZelleAccount(String fullName, String phoneNumber, String bankName){
        setPhoneNumber(phoneNumber);
        if(this.phoneNumber != null) {
            System.out.println("\nNew account was created.");
            this.fullName = fullName;
            setPhoneNumber(phoneNumber);
            this.bankName = bankName;
            info();
            userList.add(this);
            totalUsers++;
        }

    }

    public void setPhoneNumber(String phoneNumber){
        phoneNumber = phoneNumber.trim().replaceAll("[^0-9+]", "");
        if(phoneNumber.length() == 12) {
            this.phoneNumber = phoneNumber;
            System.out.println("Here: " + phoneNumber);
            isValidPhoneNumber = true;
        }else {
            isValidPhoneNumber = false;
            System.out.println("\nERROR! Invalid phone number provided in order to create account.");
            System.out.println("Phone number must be 12 digits including country code +1");
        }
    }




    public void depositMoney(double depositAmount){
        if(isValidPhoneNumber) {
            System.out.println("\n" + this.fullName + ". $" +  depositAmount + " was successfully deposited to your Zelle account.");
            this.balance += depositAmount;
            totalMoney += depositAmount;
        }else{
            System.out.println("\nCreate valid account in order to deposit money");
        }
    }


    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getFullName() {
        return this.fullName;
    }


    public void transferMoney(String phoneNumber, double transferAmount){
        phoneNumber = phoneNumber.trim().replaceAll("[^0-9+]", "");
        boolean isValidPhoneNumber = false;
        System.out.println("\nTransferring money to: " + phoneNumber);
        for(int i = 0; i < userList.size(); i++) {
            if(userList.get(i).getPhoneNumber() != null){
                if (userList.get(i).getPhoneNumber().equals(phoneNumber)) {
                    isValidPhoneNumber = true;
                    if (this.balance >= transferAmount) {
                        if(transferAmount <= 1000) {
                            System.out.println("User: " + userList.get(i).getFullName() + " is registered with Zelle.");
                            System.out.println("Amount: " + transferAmount + " was successfully transferred to " + phoneNumber);
                            this.balance -= transferAmount;
                            userList.get(i).balance += transferAmount;
                            break;
                        }else{
                            System.out.println("Transfer limit exceeded. Your limit is $1000 per day.");
                        }
                    } else {
                        System.out.println("Insufficient funds. Transfer failed.");
                    }
                }else{
                    isValidPhoneNumber = false;
                }
            }else {
                isValidPhoneNumber = false;
            }
        }
        if(!isValidPhoneNumber) {
            if(phoneNumber.length() == 12){
                System.out.println("User with: " + phoneNumber + " is not registered with Zelle.");
            }else{
                System.out.println("ERROR! Invalid phone number provided. Phone number must be 12 digits including country code +1");
            }
        }
    }


    public void info(){
        System.out.println("\nAccount details:");
        System.out.println("Name: " + this.fullName);
        System.out.println("Balance: " + this.balance);
        System.out.println("Bank: " + this.bankName);
        System.out.println("Phone number: " + this.phoneNumber);
    }

    public static void customerService(){
        System.out.println("\nCall 888-777-2323 for customer service");
    }

    public static void zelleInfo(){
        System.out.println("\nTotal Zelle users: "+ totalUsers);
        System.out.println("Total money on the platform: "+ totalMoney);
    }
}
