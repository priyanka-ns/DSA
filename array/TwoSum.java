package DSA.array;

/*
        Two Sum : Check if a pair with given sum exists in Array
        Problem Statement: Given an array of integers arr[] and an integer target.
        1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
        2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.
*/

import java.util.Arrays;

public class TwoSum {
    static void twoSum(int k, int[] arr) {

        String ans = "NO";
        int[] index = {-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==k){
                    ans = "YES";
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }

        System.out.println(ans + " " + Arrays.toString(index));

    }

    public static void main(String[] args) {
        twoSum(14, new int[]{2,6,5,8,11});
        twoSum(15, new int[]{2,6,5,8,11});
    }
}
