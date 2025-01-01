package LeetCodeChallenge;

public class PalindromeNumber {


    public static boolean getPalindrome(int num){

        int temp=num;
        int rev= 0;

        while (temp != 0 ){
            int reminder = temp %10;
            rev = rev * 10 + reminder;
            temp = temp /10;



        }

        if (rev == num){

            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {

        System.out.println(getPalindrome(121));
    }
}
