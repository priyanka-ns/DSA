package DSA.array;

import java.util.Scanner;

/*
        Input:   arr[] = {2,5,1,3,0};
        Output:    5
*/

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");

        int[] arr = new int[n];
        int max;
        for(max = 0; max < n; ++max) {
            arr[max] = sc.nextInt();
        }

        max = arr[0];
        for(int i = 0; i < n; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest number is : " + max);
    }
}
