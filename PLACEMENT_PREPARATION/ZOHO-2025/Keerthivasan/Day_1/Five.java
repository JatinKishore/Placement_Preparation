package Zoho_Practice;

/*
5. Implement an algorithm to find the contiguous subarray with the largest sum (Kadane's algorithm).

Sample Input:
Enter array size: 8
Enter elements: -2 1 -3 4 -1 2 1 -5

Sample Output:
Maximum subarray sum is: 6
*/

import java.util.Scanner;

public class Five {
    public static int maxSubArraySum(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int maxSum = maxSubArraySum(nums);
        System.out.println("Maximum subarray sum is: " + maxSum);

        sc.close();
    }
}

//Name: Keerthivasan A

