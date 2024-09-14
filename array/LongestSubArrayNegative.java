package DSA.array;

/*
Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k(positive and negative).
        Input:    k = 1, array[] = {-1, 1, 1}
        Output:  3
*/

import java.util.HashMap;

public class LongestSubArrayNegative {
    static int subarrayLength(int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (len == k) {
                len = i + 1;
            }

            if (map.containsKey(len - k)) {
                len = Math.max(len, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return len;
    }

    public static void main(String[] args) {
        System.out.println(subarrayLength(1, new int[]{-1, 1, 1}));
    }
}
