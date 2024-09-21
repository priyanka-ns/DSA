package DSA.array;

/*
Problem Statement: find peak index in a mountain array.
        Input:    array[] = {1,2,3,5,6,4,3,2}
        Output:   4
*/

public class PeakMountain {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 4, 3, 2};

        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] > arr[middle + 1]) {
                end =  middle;
            } else {
                start = middle + 1;
            }
        }
        return  end;
    }
}
