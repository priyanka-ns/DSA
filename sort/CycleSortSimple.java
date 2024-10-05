package DSA.sort;

import java.util.Arrays;

/**
 * Problem Statement:
 * Implement the Cyclic Sort algorithm to sort an array of integers in ascending order.
 * The idea is to treat the array as a set of cycles.
 * The elements are placed in their correct positions, and once an element is positioned, the next element is moved into its place, and the cycle continues.
 * When array is given in range of 1....n, then always perform cyclic sort,
 *
 * Example:
 *
 * Original array: {3, 5, 2, 1, 4}
 *
 * Sorted array: {1, 2, 3, 4, 5}
 */
public class CycleSortSimple {

    public static void cycleSort(int[] arr) {
        int i = 0;

        while (i < arr.length){
            int index = arr[i] - 1;
            if(arr[i] != arr[index]){
                swap(arr, i, index);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println("Array before cyclic sort:");
        System.out.print(Arrays.toString(arr));
        cycleSort(arr);
        System.out.println("\nArray after cyclic sort:");
        System.out.print(Arrays.toString(arr));
    }
}
