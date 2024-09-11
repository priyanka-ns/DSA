package DSA.array;

import java.util.Arrays;
public class RotateD {

    static String rotate(int[] arr, int k, String pos) {

        if (pos.equals("right")) {
            for (int i = 0; i < k; i++) {       //iterate k times
                int temp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];        //shift array one position to the right in each iteration
                }
                arr[0] = temp;
            }
        } else if (pos.equals("left")){
            for (int i = 0; i < k; i++) {       //iterate k times
                int temp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];        //shift array one position to the left in each iteration
                }
                arr[arr.length - 1] = temp;
            }
        }

        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 7, 6};

        System.out.println(rotate(arr, 1, "right"));

    }
}