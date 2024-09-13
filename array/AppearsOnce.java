package DSA.array;

/*
Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
        Input:    arr[] = {2,2,1}
        Output:  1
*/

public class AppearsOnce {
    static int once(int[] arr) {

        int num = 0;

        for(int i : arr){
            for (int j : arr) {
                if (i != j) {
                    num = j;
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {

        System.out.println(once(new int[]{2,2,3,4,3,7,4}));

    }
}
