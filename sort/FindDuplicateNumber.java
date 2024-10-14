package DSA.sort;

import java.util.Arrays;

public class FindDuplicateNumber {
    /*
    Problem Statement:
    Given an array of integers of size n + 1 containing numbers from the range 1 to n.
    The array has exactly one duplicate number.
    Write a program to find the duplicate number using Cycle Sort.

    Example:
    Input: nums = {3, 1, 3, 4, 2}
    Output: 3

    */

    public static int findDuplicate(int[] arr) {
        int n = arr.length;

        int i = 0;
        while (i < n) {
            // The correct index for arr[i] is arr[i] - 1 (since the array contains values from 1 to n)
            int correctIndex = arr[i] - 1;

            // If the element is not at the correct position and the target position does not already have the same value
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                // If the element is already in the correct index but not the correct value, it's the duplicate
                if (i != correctIndex) {
                    return arr[i]; // Duplicate found
                } else {
                    i++;
                }
            }
        }

        // In case no duplicate is found (although the problem states there will always be one)
        return -1;
    }

    // Method to swap the numbers
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Duplicate number is: " + findDuplicate(arr));
    }
}