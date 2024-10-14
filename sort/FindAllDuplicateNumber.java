package DSA.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicateNumber {
    /*
    Problem Statement:
    Given an array of integers of size n + 1 containing numbers from the range 1 to n.
    there may be multiple duplicate numbers.
    Write a program to find all the duplicate numbers using Cycle Sort.

    Example:
    Input: nums = [4, 3, 2, 7, 8, 2, 3, 1]
    Output: [2, 3]
    */

    public static List<Integer> findAllDuplicates(int[] arr) {
        int n = arr.length;
        List<Integer> duplicates = new ArrayList<>();

        int i = 0;
        while (i < n) {
            // The correct index for arr[i] is arr[i] - 1
            int correctIndex = arr[i] - 1;

            // If the element is not at the correct position and the target position does not already have the same value
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                // If the element is already in the correct index but not the correct value
                if (i != correctIndex) {
                    if (!duplicates.contains(arr[i])) {
                        duplicates.add(arr[i]); // Add to duplicates list
                    }
                }
                i++; // Move forward
            }
        }

        return duplicates;
    }

    // Method to swap the numbers
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Duplicate numbers are: " + findAllDuplicates(arr));
    }
}