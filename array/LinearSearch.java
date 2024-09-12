package DSA.array;

/*
        Input:   arr[]= 1 2 3 4 5, num = 3
        Output:  2
*/

public class LinearSearch {
    static int search(int[] arr, int num) {

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8};

        System.out.println(search(arr,8));

    }
}
