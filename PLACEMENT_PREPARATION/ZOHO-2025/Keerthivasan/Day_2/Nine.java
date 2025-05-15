package Zoho_Practice.Day_2;

// Problem 9: Implement an algorithm to find the majority element in an array.
// Majority element appears more than n/2 times.
// Sample Input: 3 3 4 2 4 4 2 4 4
// Sample Output: 4

import java.util.*;

public class Nine {
    public static int findMajorityElement(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int result = findMajorityElement(arr);
        System.out.println("Majority Element: " + result);

        sc.close();
    }
}

// Author: Keerthivasan A

