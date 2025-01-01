import java.util.Scanner;

public class LeapYear {


    public static int getLeapYear(int year){


        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0){

            System.out.println(year + " is Leap");

        }else {
            System.out.println(year + " is not leap");

        }
        
        return year;
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Year: ");

       int year =  scanner.nextInt();


       getLeapYear(year);



    }
}
