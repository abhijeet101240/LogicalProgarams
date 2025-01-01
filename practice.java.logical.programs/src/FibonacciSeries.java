public class FibonacciSeries {

    public static int getFibonacciSeries(int range){

        int a = 0;
        int b = 1;
        int c = 0;


        for (int i = 0; i <= range; i ++){

            System.out.print( c + " ," );

            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {

        System.out.println(getFibonacciSeries(11));

    }

}
