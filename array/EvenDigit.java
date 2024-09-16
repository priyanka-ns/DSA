package DSA.array;

/*
Problem Statement: Find numbers with even number of digits.
        Input:    array[] = {12,345,2,6,7896}
        Output:  2
*/

public class EvenDigit {
    static int evenDigit(int[] arr) {
        int n = arr.length;
        int digit = 0;

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if(num < 0){
                num = num * -1;
            }

            if(Integer.toString(num).length() % 2 == 0){
                digit++;
            }
        }

        return digit;
    }

    public static void main(String[] args) {

        System.out.println(evenDigit(new int[]{12,345,2,6,7896}));

    }
}
