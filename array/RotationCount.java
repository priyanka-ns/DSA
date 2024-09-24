package DSA.array;

/*
Problem Statement: count the total number of rotations
        Input:    array[] = {4, 5, 6, 7, 0, 1, 2}
        Output:   3
*/

public class RotationCount {
    public static void main(String[] args) {
        int[] num = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(pivot(num) + 1);
    }

    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (middle < end && arr[middle] > arr[middle + 1]) {
                return middle;
            }

            if (middle > start && arr[middle] < arr[middle - 1]) {
                return middle - 1;
            }

            if (arr[middle] < arr[start]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return -1;
    }

    //if arr has duplicates use this
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
