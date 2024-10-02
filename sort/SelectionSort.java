package DSA.sort;

/**
 * Problem Statement:
 * Implement the Selection Sort algorithm to sort an array of integers in ascending order.
 * The algorithm divides the array into a sorted and unsorted part, repeatedly finding the minimum element
 * from the unsorted part and swapping it with the first unsorted element. The sorted part grows one element at a time.
 *
 * Input:
 * - An unsorted array of integers.
 *
 * Output:
 * - A sorted array of integers in ascending order.
 *
 * Example:
 *
 * Original array: 64 25 12 22 11
 *
 * Sorted array: 11 12 22 25 64
 *
 * Constraints:
 * - The array may contain duplicate elements.
 * - The array should be sorted in-place (without using additional arrays).
 */
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Outer loop to go through each element of the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current element is the minimum
            int minIndex = i;

            // Inner loop to find the actual minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the current element
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr);

        System.out.println("\n\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
