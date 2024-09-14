package DSA.array;

/*
Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
        Input:    k = 10, array[] = {2,3,5,1,9}
        Output:  3
*/

public class LongestSubarray {
    static int subarrayLength(int k, int[] arr) {
        int n = arr.length;
        int len = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }

        return len;
    }

    public static void main(String[] args) {

        System.out.println(subarrayLength(10, new int[]{2,3,5,1,9}));

    }
}
