import java.util.Scanner;

public class AddTwoVariables {


    public static int add2Variables(int a, int b){


        int sum = a + b;

        return sum;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();

        System.out.println("Your Result is: "+add2Variables(a, b));
    }
}
