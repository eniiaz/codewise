package fruits;

public class GroceryShopping {

    public static void main(String[] args) {

        Seller marianos = new Seller();
        marianos.display();

        marianos.storeName = "\nMariano's";
        marianos.isHalal = true;
        marianos.numberOfEmployees = 34;
        marianos.phoneNumber = "9489238923";

        marianos.display();

        Seller costco = new Seller();
        costco.storeName = "Costco";
        costco.phoneNumber = "248403240";
        costco.numberOfEmployees = 1200;
        costco.isHalal = false;

        costco.display();

        // instance => object
        // instantiate Water => create an object from Water
        Water water = new Water();
        water.brandName = "Good & gather";
        water.isPurified = true;
        water.price = 1;
        water.size = 16;



    }

}

