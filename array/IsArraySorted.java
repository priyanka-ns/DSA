package DSA.array;

public class IsArraySorted {

    static boolean isArraySorted(int[] arr) {
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            }
        }

        return isAscending || isDescending;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {8, 2, 6, 1, 4};

        System.out.println(isArraySorted(arr1));  // true
        System.out.println(isArraySorted(arr2));  // true
        System.out.println(isArraySorted(arr3));  // false
    }
}
