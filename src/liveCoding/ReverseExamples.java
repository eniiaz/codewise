package liveCoding;

import java.util.ArrayList;
import java.util.Random;

public class ReverseExamples {

    public static void main(String[] args) {
        int [] test = {4, 2, 10, 14};
        // System.out.println(Arrays.toString(getReversedArray(test)));
        //  System.out.println(Arrays.toString(getArray(test)));
        //System.out.println(getIntegerReversed(87342));
        getPasscodes();
    }

    public static ArrayList<Integer> getPasscodes(){
        ArrayList<Integer> passcodes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++){
            int temp = random.nextInt(10000);
            // 1000
            // 987, 45, 1,
            if (temp < 1000){
                temp += 1000;
            }
            passcodes.add(temp);
        }
        System.out.println(passcodes);
        return passcodes;
    }


    public static int getIntegerReversed(int number){
        String numberInString = number + "";
        String result = "";
        for(int i = numberInString.length() - 1; i >= 0; i--){
            result += numberInString.charAt(i);
        }
        return Integer.parseInt(result);
    }


    //Input: [4, 2, 10, 14]
    //
    //Output: [28, 20, 4, 8]

    public static int[] getReversedArray(int [] numbers){
        int [] newArray = new int[numbers.length];

        int index = numbers.length - 1; // 3
        for (int i = 0; i < numbers.length; i++){
            int temp = numbers[i] * 2;
            newArray[index] = temp;
            index--;
        }
        return newArray;
    }

    public static int[] getArray(int [] numbers){
        // print out each value using for each loop
        int [] newArray = new int[numbers.length];

        int index = numbers.length - 1;

        for(int item: numbers){
            int temp = item * 2;
            // [ num4, num3, num2, num1]
            newArray[index] = temp;
            index--;
        }
        return newArray;
    }
}
