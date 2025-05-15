/*
Given a rod of length ‘N’ units. The rod can be cut into different sizes and each size has a cost associated with it.
Determine the maximum cost obtained by cutting the rod and selling its pieces.

Input: [2 5 7 8 10]
Output: 12
 */

import java.util.Scanner;
import java.util.Arrays;

public class _01_RodCuttingProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] price = new int[n];
        for (int i=0; i<n; i++) {
            price[i] = in.nextInt();
        }
        int[][] dp = new int[n][n+1];
        for (int i=0; i<n; i++) {
            Arrays.fill(dp[i], -1);
        }
        System.out.println(getMaximumAmount(n-1, n, price, dp));
    }

    private static int getMaximumAmount(int index, int N, int[] price, int[][] dp) {
        if (index == 0) {
            return N * price[0];
        }
        if (dp[index][N] != -1) return dp[index][N];
        int notPick = getMaximumAmount(index - 1, N, price, dp);
        int Pick = Integer.MIN_VALUE;
        int rodLength = index + 1;
        if (rodLength <= N) {
            Pick = price[index] + getMaximumAmount(index, N-rodLength, price, dp);
        }
        return dp[index][N] = Math.max(notPick, Pick);
    }
}
