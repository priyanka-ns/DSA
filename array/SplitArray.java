package DSA.array;

/*
Problem Statement: Given an array `nums` and an integer `m`, split the array into `m` subarrays such that the largest sum among these subarrays is minimized.
        Input:    array[] = {7, 2, 5 , 19, 8}, m = 2
        Output:   18 (The array can be split into [7, 2, 5] and [8, 10] with sums 14 and 18, and the largest sum is 18)
*/

public class SplitArray {
    public static void main(String[] args) {
        int[] num = {7, 2, 5 , 8, 10};
        int m = 2;

        System.out.println(splitArray(num, m));
    }

    private static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        // Initialize `start` to the maximum single element and `end` to the sum of the entire array.
        // The smallest possible maximum sum in any subarray is the largest number in the array,
        // and the largest possible maximum sum is the sum of the entire array (no splits).
        for (int i=0; i < nums.length; i++){
            start = Math.max(start, nums[i]); // Maximum individual element
            end += nums[i]; // Sum of the array
        }

        // Binary search between the smallest possible largest sum (`start`) and the largest (`end`).
        while(start < end){
            int middle = start + (end - start) / 2;

            // Try to split the array such that no subarray has a sum greater than `middle`.
            int sum = 0;
            int split = 1;

            for(int num : nums){
                // If adding the current number exceeds the current `middle` guess, start a new subarray.
                if(sum + num > middle){
                    sum = num; // Start the new subarray with the current number
                    split++;
                } else{
                    sum += num; // Add the current number to the existing subarray
                }
            }

            // If the number of subarrays is greater than `m`, increase `start` to search for a larger valid `middle`.
            if(split > m){
                start = middle + 1;
            } else{
                // Otherwise, the current `middle` is a valid guess, but we try to find a smaller maximum sum.
                end = middle;
            }
        }

        return end;
    }

}
