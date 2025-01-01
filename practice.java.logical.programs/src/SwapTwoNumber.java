public class SwapTwoNumber {


   public static int swap2Number(int num1 , int num2){

    System.out.println("Before Swapping : " +  " Number 1 : " + num1 +  " Number 2 : " + num2);
    
    num1 = num1 + num2;

    num2 = num1 - num2;

    num1 = num1 - num2;

    System.out.println( );

    System.out.println("After Swapping : " +  " Number 1 : " + num1 + " Number 2 : " + num2);

    return num1;



    }
     
    public static void main(String[] args) {


     swap2Number(1, 2);


        
    }
}