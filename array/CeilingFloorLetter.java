package DSA.array;

/*
Problem Statement: Find element greater than or equal to target.
        Input:    array[] = {a,b,c,e,f,j,k}, int k = g
        Output:  true
*/

public class CeilingFloorLetter {
    static char ceilingFloor(char[] arr, int k, String order) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int middle = start + (end - start) / 2;

            if (arr[middle] == k) {
                return arr[middle]; // Found exact match
            }

            if (arr[middle] < k) {
                start = middle + 1; // Search in the right half
            } else {
                end = middle - 1; // Search in the left half
            }
        }

        if (order.equals("ceiling")) {
            return start < arr.length ? arr[start] : arr[0]; // Wrap around for ceiling
        } else {
            return end >= 0 ? arr[end] : arr[arr.length - 1]; // Wrap around for floor
        }
    }

    public static void main(String[] args) {

        System.out.println(ceilingFloor(new char[]{'a','c','d','g','h','i','j','k','m'}, 'z',"ceiling"));
        System.out.println(ceilingFloor(new char[]{'a','b','c','e','f','g','i','j','k'}, 'h',"floor"));
    }
}
