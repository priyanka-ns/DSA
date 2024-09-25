package DSA.TwoDArray;

import java.util.Arrays;

/*
        18 19 12
        36 -4 91
        44 33 16
        Search :91
        Output :[1][2]
*/
public class Searchin2D {

    public static void main(String[] args) {
        int arr[] [] = {{18, 19, 12},{36, -4, 91},{44, 33, 16}};

        System.out.println(Arrays.toString(Arrays.stream(search2D(arr, 91)).toArray()));
    }

    private static int[] search2D(int[][] arr, int k) {
        for(int i = 0; i < arr.length; ++i) {
            for(int j = 0; j < arr.length; ++j) {
                if(k == arr[i][j]){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }
}
