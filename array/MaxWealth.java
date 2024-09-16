package DSA.array;

/*
Problem Statement: Find max sum in 2 d array.
        Input:    array[][] = [[1,5],[7,3],[3,5]]
        Output:  10
*/

public class MaxWealth {
    static int maxWealth(int[][] accounts) {

        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maxWealth(accounts));
    }
}
