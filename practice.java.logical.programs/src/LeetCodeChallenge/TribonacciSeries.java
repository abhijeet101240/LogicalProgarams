package LeetCodeChallenge;

public class TribonacciSeries {


    public static int getTribonacciSeries(int n){

        int a = 0,  b = 1 , c = 1;



        for (int i = 1 ; i <= n ; i++){



            int temp = a+ b + c;


            a = b;
            b = c;
            c= temp;

            System.out.print(" " + a);


        }

        return  a;
    }

    public static void main(String[] args) {

        System.out.println(getTribonacciSeries(10));
    }
}
