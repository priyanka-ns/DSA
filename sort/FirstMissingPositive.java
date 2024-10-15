package DSA.sort;

import java.util.Arrays;

public class FirstMissingPositive {

/*
Problem Statement:
    Given an unsorted array of integers, find the smallest missing positive integer.

Example:
    Input: [3, 4, -1, 1]
    Output: 2

Time complexity: O(n) because each element is processed at most twice.
Space complexity: O(1) as we do the sorting in-place without using extra mem
*/

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its correct position if it's in the range [1, n]
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        // Step 2: Find the first index where the number is not the correct one
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1; // The first missing positive integer
            }
        }

        // If all numbers are in their correct places, the missing number is `n + 1`
        return n + 1;
    }

    // Method to swap two elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println("Array: " + Arrays.toString(nums));
        int missing = firstMissingPositive(nums);
        System.out.println("First missing positive: " + missing);
    }
}
