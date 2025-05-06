package Day2;


import java.util.Arrays;

/*
 * @author Abhinandan
 * Problem Statement 1.Implement an algorithm to rotate an NxN matrix by 90 degrees. (clockwise)
 * 1 2 3     7 4 1
 * 4 5 6  -> 8 5 2
 * 7 8 9     9 6 3
 * Counter Clockwise
 * 1 2 3     3 6 9
 * 4 5 6  -> 2 5 8
 * 7 8 9     1 4 7
 */
public class One {
    public static void main(String[] args) {
        int n = 3;
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //rotateBy90Clockwise(arr, n);
        rotateBy90CounterClockwise(arr, n);
        System.out.println(Arrays.deepToString(arr));
        /*
         * Time Complexity: O(n^2) , Space Complexity: O(1)
         * */
    }

    private static void rotateBy90CounterClockwise(int[][] arr, int n) {
        reverseRows(arr, n);
        transposeArray(arr, n);
    }

    private static void reverseRows(int[][] arr, int n) {
        for (int row = 0; row < n; row++) {
            reverseRowArray(arr, row, n);
        }
    }

    private static void reverseRowArray(int[][] arr, int row, int n) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int temp = arr[row][left];
            arr[row][left] = arr[row][right];
            arr[row][right] = temp;
            left++;
            right--;
        }
    }

    private static void rotateBy90Clockwise(int[][] arr, int n) {
        reverseColumns(arr, n);
        transposeArray(arr, n);
    }

    private static void reverseColumns(int[][] arr, int n) {
        for (int col = 0; col < n; col++) {
            reverseColumnsArray(arr, col, n);
        }
    }

    private static void reverseColumnsArray(int[][] arr, int col, int n) {
        int top = 0;
        int bottom = n - 1;
        while (top <= bottom) {
            int temp = arr[top][col];
            arr[top][col] = arr[bottom][col];
            arr[bottom][col] = temp;
            top++;
            bottom--;
        }
    }

    private static void transposeArray(int[][] arr, int n) {
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
    }
}
