package DSA.sort;

import java.util.Arrays;

public class SetMismatch {

/*
Given an array nums of size n containing numbers from the range 1 to n, one number appears twice and another is missing.
Write a program to find the duplicate and the missing number using Cycle Sort.

        Array: [1, 2, 2, 4]
        Duplicate: 2, Missing: 3

Time Complexity:
O(n) because we are processing each element only once.
Space Complexity:
O(1) as we are using constant space, except for the result array.
*/

    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;

        // Step 1: Perform Cycle Sort to place numbers at correct positions
        int i = 0;
        while (i < n) {
            int correctIndex = nums[i] - 1;

            // If nums[i] is not at its correct position, and it is not a duplicate
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Step 2: After sorting, find the duplicate and missing numbers
        int[] result = new int[2]; // result[0] is duplicate, result[1] is missing
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                result[0] = nums[i]; // The duplicate number
                result[1] = i + 1;   // The missing number
                break;
            }
        }

        return result;
    }

    // Method to swap two elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        System.out.println("Array: " + Arrays.toString(nums));
        int[] result = findErrorNums(nums);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}