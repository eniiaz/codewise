package zelleTransferApp;

import java.util.Scanner;

public class ZelleApp {
    public static void main(String[] args) {

        ZelleAccount user1 = new ZelleAccount("Kate Johnson", "(630)-220-8228", "Chase");
        user1.depositMoney(2000);
        user1.setPhoneNumber("+17738825153");
        user1.depositMoney(2000);


        ZelleAccount user2 = new ZelleAccount("David Button", "+1550-720-6765", "PNC");
        user2.depositMoney(2000);

        ZelleAccount user3 = new ZelleAccount("Alex Davidson", "+1(777)330-2233", "US Bank");

        user2.transferMoney("+1(777)3-30-2233", 500);
        user2.info();
        user3.info();


        ZelleAccount.zelleInfo();
        ZelleAccount.customerService();


    }
}
