package DSA.array;

import java.util.ArrayList;

/*
        Input:   arr1[] = {1,2,3,4,5}
                 arr2[] = {2,3,4,4,5}
        Output:  {1,2,3,4,5}
*/

public class Union {
    static void union(int[] arr1, int[] arr2) {

        ArrayList arr = new ArrayList<>() ;

        for (int i : arr1) {
            if (!arr.contains(i)) { // Remove duplicates from arr1
                arr.add(i);
            }
        }

        for (int j : arr2) {
            if (!arr.contains(j)) {
                arr.add(j);
            }
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};

        union(arr1,arr2);

    }
}
