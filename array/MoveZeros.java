package DSA.array;

import java.util.Arrays;

/*
        Input:   array[] = arr[ 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1]
        Output:  arr[ 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0]
*/

public class MoveZeros {
    static String moveZero(int[] arr) {

        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }

        return Arrays.toString(temp);
    }

    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};

        System.out.println(moveZero(arr));

    }
}
