/*
LeetCode  - 300. Longest Increasing Subsequence

Given an integer array nums, return the length of the longest strictly increasing subsequence.

Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 */
import java.util.Scanner;

public class _05_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(getlengthofLIS(arr, n));
    }

    private static int getlengthofLIS(int[] arr, int n) {
        int length = 1;
        int[] dp = new int[n];
        for(int i=0 ;i<n; i++) {
            dp[i] = 1;
            for (int j=0; j<i; j++) {
                if (arr[j] < arr[i] && (1 + dp[j]) > dp[i]) {
                    dp[i] = 1 + dp[j];
                }
            }
            if (dp[i] > length) {
                length = dp[i];
            }
        }
        return length;
    }
}
