public class ReverseNumber {


   public static int getReverseNumber(int revNum){


    int reminder= 0;
    int sum = 0;
    

    while (revNum != 0) {
        



        reminder = revNum % 10;

        sum = sum * 10 + reminder ;

        revNum = revNum / 10;
        
         
    }

    

    return sum;
    }

    public static void main(String[] args) {

    System.out.println(getReverseNumber(12345));
        
    
}
    
}
