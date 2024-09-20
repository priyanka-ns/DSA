package DSA.array;

/*
Problem Statement: find first and last position of an array by binary search.
        Input:    array[] = {5, 7, 7, 8, 8, 10}, int k = 8
        Output:  3,4
*/

import java.util.Arrays;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    public static int findPosition(int[] arr, int target, boolean findFirst) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                result = middle;
                if (findFirst) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else if (arr[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return result;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        arr[0] = findPosition(nums, target, true); //first occurrence
        arr[1] = findPosition(nums, target, false); //last occurrence
        return arr;
    }
}
