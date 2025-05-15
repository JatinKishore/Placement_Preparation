package Zoho_Practice.Day_2;

// Problem 10: Implement an algorithm to find the longest increasing subsequence in an array.
// Sample Input: 10 9 2 5 3 7 101 18
// Sample Output: Length of LIS = 4

import java.util.*;

public class Ten {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;

        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) i = -(i + 1);
            dp[i] = num;
            if (i == len) len++;
        }

        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = lengthOfLIS(arr);
        System.out.println("Length of Longest Increasing Subsequence: " + result);

        sc.close();
    }
}

// Author: Keerthivasan A

