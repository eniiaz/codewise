package arrays;

public class Key {

    public static void main(String[] args) {
        String [] groceries = {"Aread", "ACucumber", "Apple", "Arange", "Cake"};
        int counter = 0;

        for (int i = 0; i < groceries.length; i++){
            String temp = groceries[i];

            if(temp.charAt(0) == 'A'){
                counter++;
                System.out.println(temp);
            }
        }
        System.out.println("Total words with A: " + counter);

    }
}
