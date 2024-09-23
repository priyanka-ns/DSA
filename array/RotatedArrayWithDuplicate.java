package DSA.array;

/*
Problem Statement: search in rotated sorted array with duplicates.
        Input:    array[] = {2, 5, 6, 0, 0, 1, 2}, int k = 0
        Output:   3
*/

public class RotatedArrayWithDuplicate {
    public static void main(String[] args) {
        int[] num = {2, 5, 6, 0, 0, 1, 2};
        int target = 0;

        System.out.println(searchInRotatedArray(num, target));
    }

    static int searchInRotatedArray(int[] arr, int target) {

        int pivot = findPivotWithDuplicates(arr);

        // array is not rotated if no pivot found
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // If pivot found
        if (arr[pivot] == target) {
            return pivot;
        }

        // Search left side of pivot if target >= arr[0]
        if (target >= arr[0]){
            return binarySearch(arr, target, 0, pivot);
        }
        // else search right side of pivot
        else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int binarySearch(int[] arr, int k, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == k) {
                return middle;
            }
            if (arr[middle] < k) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1; // no element found
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;

            if (middle < end && arr[middle] > arr[middle + 1]) {
                return middle;
            }
            if (middle > start && arr[middle] < arr[middle - 1]) {
                return middle - 1;
            }

            if (arr[start] == arr[middle] && arr[end] == arr[middle]) {
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            else if (arr[start] <= arr[middle]) {
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
