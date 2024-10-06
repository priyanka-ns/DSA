package DSA.sort;

import java.util.Arrays;

/**
 * Problem Statement:
 * Given an array of integers of size n containing distinct numbers from the range 0 to n.
 * The array has one missing number.
 * Write a program to find the missing number using Cycle Sort.
 *
 * Example:
 *
 * Array: {3, 0, 1, 4, 6, 5}
 *
 * Output: 2
 */
public class MissingNumber {

    //move each element to its correct position, and the index that doesn't have the correct value will be the missing number
    public static int missingNumber(int[] arr) {
        int n = arr.length;

        // Cycle sort logic
        int i = 0;
        while (i < n) {
            int correctIndex = arr[i];
            // Only swap if the number is less than the array length and not at the correct position
            if (arr[i] < n && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // After sorting, find the missing number by checking which index has incorrect number
        for (i = 0; i < n; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        // If all indices are correct, the missing number is `n`
        return n;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 4, 6, 5};
        System.out.print(Arrays.toString(arr));
        System.out.println("\nMissing number is: "+missingNumber(arr));
    }
}
