package DSA.sort;

/**
 * Problem Statement:
 * Implement the Bubble Sort algorithm to sort an array of integers in ascending order.
 * The algorithm repeatedly compares adjacent elements and swaps them if they are in the wrong order.
 * The process is repeated for every element in the array until no swaps are needed, indicating the array is sorted.
 * The optimization involves stopping early if no swaps are made in a pass, meaning the array is already sorted.
 *
 * Input:
 * - An unsorted array of integers.
 *
 * Output:
 * - A sorted array of integers in ascending order.
 *
 * Example:
 *
 * Original array: 2 1 5 4 2
 *
 * Sorted array: 1 2 2 4 5
 *
 * Constraints:
 * - The array may contain duplicate elements.
 * - The array should be sorted in-place (without using additional arrays).
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop to go through the entire array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop to compare adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 2};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        bubbleSort(arr);

        System.out.println("\n\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
