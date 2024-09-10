package DSA.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
        Input:   N = 5, array[] = arr[1,1,2,2,2,3,3]
        Output:  arr[1,2,3,_,_,_,_]
*/

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> distinctList = new ArrayList<>();
        distinctList.add(arr[0]);

        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[i-1]){
                distinctList.add(arr[i]);
            }
        }

        System.out.println(Arrays.toString(distinctList.toArray()));

        /* Alternate approach
        int[] distinctArr = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(distinctArr));
        */
    }
}
