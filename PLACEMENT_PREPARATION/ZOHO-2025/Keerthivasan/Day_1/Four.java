package Zoho_Practice;


/*
4. Find the "celebrity" in a party using a given array of people.

Input: mat[][] = [[1, 1, 0], [0, 1, 0], [0, 1, 1]]
Output: 1

Input: mat[][] = [[1, 1], [1, 1]]
Output: -1

*/

import java.util.Scanner;

public class Four {

    public static int findCelebrity(int[][] mat, int n) {
        int candidate = 0;
        for (int i = 1; i < n; i++) {
            if (mat[candidate][i] == 1) {
                candidate = i;
            }
        }

        // Verify candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate && (mat[candidate][i] == 1 || mat[i][candidate] == 0)) {
                return -1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] mat = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int celebrity = findCelebrity(mat, n);
        System.out.println("Output: " + celebrity);

    }
}

//Name: Keerthivasan A
