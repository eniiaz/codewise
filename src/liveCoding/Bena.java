package liveCoding;

public class Bena {

    public static void main(String[] args) {

        // finding missing numbers
        // [4,2,9,5]
        // Create a method that accept an integer array and integer
        // return true if the given number contains in that array
        int [] ages = {2, 4, 8, 9};
        System.out.println(checkArray(ages, 28));

        // Finding the biggest number in the array and return it
        System.out.println(maxElement(ages));

        // find the missing number is the array without sorting it
        // create a method that prints out all the missing numbers from array up to the maximum value

        findMissing(ages);

    }

    public static void findMissing(int [] numbers){
        int max = maxElement(numbers);
        System.out.println("{");
        for(int i = 0; i < max; i++){
            if(checkArray(numbers, i)){
                continue;
            }
            System.out.print(i + ", ");
        }
    }


    public static int maxElement(int [] numbers){
        int maxValue = 0;
        for(int i: numbers){
            if(i > maxValue){
                maxValue = i;
            }
        }
        return maxValue;
    }



    // Create method that checks if certain number is in the given array

    public static boolean checkArray(int [] numbers, int target){
        boolean found = false;
        for(int i: numbers){
            if(i == target){
                found = true;
                break;
            }
        }
        return found;
    }



}
