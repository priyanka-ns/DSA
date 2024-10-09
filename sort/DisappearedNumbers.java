package DSA.sort;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    /*
    Problem Statement:
    You are given an array of integers where the integers are in the range 1 to n,
    where n is the length of the array. Some numbers appear more than once and some
    numbers are missing. Your task is to find all the numbers that are missing from
    the array.

    Example:
    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [5,6]

    */

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;

        // Cycle sort logic to place each number at its correct index
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // After sorting, find the missing numbers
        List<Integer> result = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                result.add(i + 1);
            }
        }

        return result;
    }

    // Function to swap elements in the array
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
