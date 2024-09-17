package DSA.array;

/*
Problem Statement: Find max sum in 2 d array.
        Input:    array[] = {1, 5, 6, 2, 4}, int k =6
        Output:  true
*/

public class OrderAgnosticBinarySearch {
    static int agbs(int[] arr, int k) {

        int start = arr[0];
        int end = arr.length - 1;
        boolean asc = arr[0] < arr[arr.length - 1];

        while (start <= end) {
            int middle = (start + end) / 2;

            if(k == arr[middle]) {
                return middle;
            }

            if(asc){
                if (k < arr[middle]){
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else {
                if (k > arr[middle]){
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {

        System.out.println(agbs(new int[]{1, 5, 6, 2, 4}, 5));
    }
}
