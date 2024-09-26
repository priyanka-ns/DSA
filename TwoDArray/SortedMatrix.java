package DSA.TwoDArray;

import java.util.Arrays;

/*
        18    19    20
        36    41    91
        140   330   416
        Search: 91
        Output: [1][2]
*/

public class SortedMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {18, 19, 20},
                {36, 41, 91},
                {140, 330, 416}
        };

        // Searching for the number 91
        int target = 91;
        int[] result = search2D(arr, target);

        // Output the result as a formatted array
        System.out.println(Arrays.toString(result));  // Expected Output: [1, 2]
    }

    /*
      This method searches for a target value in a row-wise and column-wise sorted 2D matrix.
      It first finds the correct row by performing binary search on the last column of the matrix,
      then performs a binary search within the selected row.
     */
    private static int[] search2D(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Binary search on the last column to narrow down the row
        int rowLow = 0, rowHigh = rows - 1;

        // Binary search to find the appropriate row
        while (rowLow < rowHigh) {
            int midRow = rowLow + (rowHigh - rowLow) / 2;

            // Check if target is in the current row or further down
            if (arr[midRow][cols - 1] < target) {
                rowLow = midRow + 1;
            } else {
                rowHigh = midRow; // Move the upper bound to midRow
            }
        }

        // Now, rowLow is the row that may contain the target, search within that row using binary search
        int colIndex = binarySearch(arr[rowLow], target);

        // If the element is found, return the row and column index
        if (colIndex != -1) {
            return new int[]{rowLow, colIndex};
        }

        // If not found, return [-1, -1] to indicate the target is not in the matrix
        return new int[]{-1, -1};
    }

    /*
      Binary search method for searching within a single row.
      Returns the index of the target if found, otherwise returns -1.
     */
    private static int binarySearch(int[] row, int target) {
        int start = 0;
        int end = row.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (row[mid] == target) {
                return mid;  // Target found at mid-index
            } else if (row[mid] < target) {
                start = mid + 1;  // Target is in the right half
            } else {
                end = mid - 1;  // Target is in the left half
            }
        }

        return -1; // Target not found
    }
}
