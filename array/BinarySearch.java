package DSA.array;

/*
Problem Statement: Find element using binary search.
        Input:    array[] = {1, 5, 6, 2, 4}, int k =5
        Output:  true
*/

public class BinarySearch {
    static int binarySearch(int[] arr, int k) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end)/2;
            if (k < arr[middle]){
                end = middle - 1; // Search in the left half
            } else if (k > arr[middle]){
                start = middle + 1; // Search in the right half
            } else {
                return middle;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1, 5, 6, 2, 4}, 5));
    }
}
