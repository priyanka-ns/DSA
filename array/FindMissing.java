package DSA.array;

import java.util.ArrayList;

/*
        Input:    N = 5, array[] = {1,2,4,5}
        Output:  3
*/

public class FindMissing {
    static int missing(int n, int[] arr) {

        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int i : arr) {
            arr1.add(i);
        }

        for (int i = 1; i <= n; i++) {
            if (!arr1.contains(i)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println(missing(5, new int[]{1, 2, 3, 5}));

    }
}
