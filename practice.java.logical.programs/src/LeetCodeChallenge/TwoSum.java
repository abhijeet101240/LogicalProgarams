package LeetCodeChallenge;

import java.util.Arrays;

public class TwoSum {

    public static String getSum(int num[] , int target){


        int ans[] = new int[2];

        for (int i = 0 ; i< num.length;i++){
            for (int j = i + 1 ; j < num.length;j++){

                if (num[i]+ num[j]==target){
                    ans[0] = i;
                    ans [1] = j;
                    break;
                }
            }
        }

        return Arrays.toString(ans);
    }


    public static void main(String[] args) {
        int num[] = {2,7,11,15};
        int target = 9;

        System.out.println(getSum(num,target));


    }
}
