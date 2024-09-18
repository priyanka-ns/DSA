package DSA.array;

/*
Problem Statement: Find element less than or equal to target.
        Input:    array[] = {2,3,5,9,14,16,18}, int k =10
        Output:  true
*/

public class Floor {
    static int floor(int[] arr, int k) {

        int start = 0;
        int end = arr.length - 1;

        if (k > arr[end]) {
            return -1;
        }

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == k) {
                return arr[middle]; // Found exact match
            }

            if (arr[middle] < k) {
                start = middle + 1; // Search in the right half
            } else {
                end = middle - 1; // Search in the left half
            }
        }

        return arr[end];
    }

    public static void main(String[] args) {

        System.out.println(floor(new int[]{2,3,5,9,14,16,18}, 14));
    }
}
