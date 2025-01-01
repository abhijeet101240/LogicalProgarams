package LeetCodeChallenge;

public class PowerOfTwo {


   public static boolean getPowerOfTwo(int num){

       if ( num < 1 ){

           return false;
       } else if (num == 1) {

           return true;

       }else {

           while( num % 2 == 0){

               num = num / 2;
           }if ( num == 1){

               return  true;
           }else {
              return false;
           }
       }
   }

    public static void main(String[] args) {

        System.out.println(getPowerOfTwo(16));
    }
}
