/*
LeeetCode - 48. Rotate Image

You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
 */

public class _01_RotateImage {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9} };

        rotate(matrix);

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i=0; i<n; i++) {
            reverseArray(matrix[i], 0, n-1);
        }
    }

    private static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
