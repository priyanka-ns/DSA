package DSA.array;

import java.util.Arrays;

public class LeftRotate {

    static String rotate(int n, int[] arr) {

        int temp = arr[0];
        for (int i = 0; i < n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;

        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println(rotate(n,arr1));
    }
}
