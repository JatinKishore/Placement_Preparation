/*
LeetCode - 560. Subarray Sum Equals K

Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
Input: nums = [1,2,3], k = 3
Output: 2
Input: nums = [1,2,3,-3,1,1,1,4,2,-3], k = 3
Output: 8
 */
import java.util.HashMap;
import java.util.Scanner;

public class _04_SubarraySumEqualsK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        int k = in.nextInt();
        System.out.println(getNoofSubarray(arr, n, k));
    }

    private static int getNoofSubarray(int[] arr, int n, int k) {
        int count = 0;
        int preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i=0; i<n; i++) {
            preSum += arr[i];
            int rem = preSum - k;
            count += map.getOrDefault(rem, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}
