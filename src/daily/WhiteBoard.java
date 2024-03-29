package daily;

public class WhiteBoard {

    public static void main(String[] args) {
        String result = getSumOfDigits("Today January 17. Happy new 2023!");
        System.out.println(result);
    }

    public int[] getReversed(int [] numbers){
        int [] newNumbers = new int[numbers.length];
        int i = newNumbers.length - 1;

        for(int num: numbers){
             newNumbers[i] = num;
             i--;
        }
        return newNumbers;
    }





    public static String getSumOfDigits(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(Character.isDigit(temp)){

                sum += Integer.parseInt(temp + "");
            }
        }
        // integer to string
        String resultInString = sum + "";
        return resultInString;
    }

}
