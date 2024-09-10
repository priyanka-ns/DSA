package DSA.array;

import java.util.Arrays;
import java.util.Scanner;

/*
        Input:  [1,2,4,7,7,5]
        Output:
                Second Smallest : 2
                Second Largest : 5
*/

public class SecondLargestAndSmallest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = in.nextInt();
        System.out.println("Enter elements of array: ");

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] distinctArr = Arrays.stream(arr).distinct().toArray();
        Arrays.sort(distinctArr);

        if (distinctArr.length < 2) {
            // Since Array does not have enough distinct elements for second smallest or second largest, print -1
            System.out.println("Second smallest : -1");
            System.out.println("Second largest : -1");
        } else {
            System.out.println("Second smallest: " + distinctArr[1]);
            System.out.println("Second largest: " + distinctArr[distinctArr.length - 2]);
        }

        /* Alternate solution
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int secondmax = arr[0];
        int secondmin = arr[0];
        for(int i = 0; i < n; i++) {
            if (arr[i] < max && arr[i] > secondmax) {
                secondmax = arr[i];
            }
            if (arr[i] > min && arr[i] < secondmin) {
                secondmin = arr[i];
            }
        }
        System.out.println("Second Largest : " + secondmax);
        System.out.println("Second Smallest : " + secondmin);

         */
    }
}
