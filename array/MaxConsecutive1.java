package DSA.array;

/*
Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array
        Input:    prices = {1, 1, 0, 1, 1, 1}
        Output:  3
*/

public class MaxConsecutive1 {
    static int consecutive(int[] prices) {

        int count = 0;
        int maxCount = 0;

        for (int j : prices) {
            if (j == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;

    }

    public static void main(String[] args) {

        System.out.println(consecutive(new int[]{1, 1, 0, 1, 1, 1}));

    }
}
