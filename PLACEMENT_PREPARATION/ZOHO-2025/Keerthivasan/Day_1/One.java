package Zoho_Practice;

/*
1. Implement an algorithm to rotate an NxN matrix by 90 degrees.

Sample Input:
Enter matrix size: 3
Enter matrix elements:
1 2 3
4 5 6
7 8 9

Sample Output:
Rotated Matrix:
7 4 1
8 5 2
9 6 3
*/

import java.util.Scanner;

public class One {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left++] = matrix[i][right];
                matrix[i][right--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        rotate(matrix);

        System.out.println("Rotated Matrix:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        sc.close();
    }
}

//Name: Keerthivasan A

