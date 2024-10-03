package DSA.sort;

/**
 * Problem Statement:
 * Implement the Insertion Sort algorithm to sort an array of integers in ascending order.
 * Values from the unsorted part are picked and placed at the correct position in the sorted part.
 *
 * Example:
 *
 * Original array: 12, 11, 13, 5, 6
 *
 * Sorted array: 5, 6, 11, 12, 13
 */
public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // compare second element with the element before it
        for (int i = 1; i < n; ++i) {
            int element = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Place the index at its correct position
            arr[j + 1] = element;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        insertionSort(arr);

        System.out.println("\nSorted Array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
