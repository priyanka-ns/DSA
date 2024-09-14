package DSA.array;

/*
        Problem Statement: Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array.
        You may consider that such an element always exists in the array.
        Input Format: N = 3, nums[] = {3,2,3}
        Result: 3
*/

public class MajorityElement {
    static int majority(int[] arr) {

        for (int i= 0; i < arr.length; i++) {
            int count = 0;
            int j = 0;

            while (j < arr.length) {
                if (arr[j] == arr[i]) {
                    count++;
                }
                j++;
            }

            if (count > arr.length / 2) {
                return arr[i];
            }
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int result = majority(arr);
        System.out.println(result);
    }
}
