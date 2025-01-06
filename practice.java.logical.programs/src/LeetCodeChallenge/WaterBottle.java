package LeetCodeChallenge;

public class WaterBottle {

    public static int getDrinkedBottle(int totalBottle, int exchangedBottle){

        int  ans = totalBottle;

        while (totalBottle >= exchangedBottle){

            int newBottles = totalBottle / exchangedBottle;
            int remainingBottle = totalBottle % exchangedBottle;

            ans = ans +  newBottles ;

            totalBottle = newBottles + remainingBottle;
        }

    return  ans;
    }
    public static void main(String[] args) {

        System.out.println(getDrinkedBottle(9,3));
    }
}
