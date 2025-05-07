/*
LeetCode - 1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class _02_TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++) {
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                return new int[] {map.get(num), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return  new int[]{-1, -1};
    }
}
