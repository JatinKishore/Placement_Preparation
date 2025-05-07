/*
LeetCode - 53. Maximum Subarray

Given an integer array nums, find the subarray with the largest sum, and return its sum.

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */
import java.util.Scanner;

public class _05_MaximumSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = in.nextInt();
        }

        System.out.println(getMaxSum(nums));
    }

    private static int getMaxSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
