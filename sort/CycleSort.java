package DSA.sort;

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
public class CycleSort {

    public static void cycleSort(int[] arr) {
        int n = arr.length;

        // Traverse the array to find cycles
        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int item = arr[cycleStart];
            int pos = cycleStart;

            // Find the correct position for the current element
            for (int i = cycleStart + 1; i < n; i++) {
                if (arr[i] < item) pos++;
            }

            // Skip if already in the correct position
            if (pos == cycleStart) continue;

            // Place the item at its correct position
            while (item == arr[pos]) pos++; // Skip duplicates
            swap(arr, pos, cycleStart); // Swap the elements
            item = arr[cycleStart];

            // Rotate the rest of the cycle
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < n; i++) {
                    if (arr[i] < item) pos++;
                }
                while (item == arr[pos]) pos++; // Skip duplicates
                swap(arr, pos, cycleStart);
                item = arr[cycleStart];
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
        cycleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
