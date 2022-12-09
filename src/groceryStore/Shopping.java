package groceryStore;

public class Shopping {

    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.enterInfo("John Wick", 35, false, "whatever");

        buyer.display();
        buyer.updateResidency(true);
        buyer.display();

    }

}
