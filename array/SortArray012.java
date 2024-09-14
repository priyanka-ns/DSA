package DSA.array;

/*
        Problem Statement: Given an array consisting of only 0s, 1s, and 2s.
        Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)

        Input:     nums = [2,0,2,1,1,0]
        Output            [0,0,1,1,2,2]
*/

public class SortArray012 {
    static void sortArray(int[] arr) {
        int counter0 = 0, counter1 = 0, counter2 = 0;

        for (int num : arr) {
            if (num == 0)
                counter0++;
            else if (num == 1)
                counter1++;
            else if (num == 2)
                counter2++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (counter0 > 0) {
                arr[i] = 0;
                counter0--;
            } else if (counter1 > 0) {
                arr[i] = 1;
                counter1--;
            } else {
                arr[i] = 2;
                counter2--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

