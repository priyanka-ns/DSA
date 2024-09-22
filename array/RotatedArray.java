package DSA.array;

/*
Problem Statement: search in rotated sorted array.
        Input:    array[] = {4, 5, 6, 7, 0, 1, 2}, int k = 0
        Output:   4
*/

public class RotatedArray {
    public static void main(String[] args) {
        int[] num = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(rotatedArr(num, target));
    }

    static int rotatedArr(int[] arr, int target) {

        int pivot = pivot(arr);

        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if (arr[pivot] == target) {
            return pivot;
        }

        if (target > arr[0]){
            return binarySearch(arr, target, 0, pivot);
        } else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }

    }

    static int binarySearch(int[] arr, int k, int start, int end) {

        while (start <= end) {
            int middle = (start + end) / 2;
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

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) {
            return -1;
        }

        while (start < end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] > arr[middle + 1]) {
                end =  middle;
            } else {
                start = middle + 1;
            }
        }
        return end;
    }
}
