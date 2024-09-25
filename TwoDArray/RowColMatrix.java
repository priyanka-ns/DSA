package DSA.TwoDArray;

import java.util.Arrays;

/*
        18 19 12
        36 -4 91
        44 33 16
        Search :91
        Output :[1][2]
*/
public class RowColMatrix {

    public static void main(String[] args) {
        int arr[] [] = {{18, 19, 20},{36, 41, 91},{140, 330, 416}};

        System.out.println(Arrays.toString(Arrays.stream(search2D(arr, 36)).toArray()));
    }

    private static int[] search2D(int[][] arr, int k) {
        int row = 0;
        int col = arr.length - 1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == k){
                return new int[]{row,col};
            }
            if(arr[row][col] < k){
                row++;
            } else {
                col--;
            }

        }

        return new int[]{-1,-1};
    }
}
