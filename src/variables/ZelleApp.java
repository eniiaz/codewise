package variables;

public class ZelleApp {

    public static void main(String[] args) {
        ZelleAccount user1 = new ZelleAccount("James Bond", "773-773-8888", "Chase");

        user1.depositMoney(2000);
        user1.info();
        user1.transferMoney("7739090900", 200);
        user1.info();

        ZelleAccount user2 = new ZelleAccount("Kate", "34802442", "BoA");
        user2.depositMoney(5000);
        user2.info();
        user1.depositMoney(4500);
        ZelleAccount.customerService();
        ZelleAccount.zelleInfo();
    }

}
