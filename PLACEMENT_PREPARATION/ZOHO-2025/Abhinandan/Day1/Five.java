package Day1;

/*
 * @author: Abhinandan
 * Problem Statement: Implement an algorithm to find the contiguous subarray with the largest sum
 * [1,2-3,4,3,-5,7,9] ans->7+9=16
 * */
public class Five {
    public static void main(String[] args) {
        int[] nums = {1, 2 - 3, 4, 3, -5, 7, 9};
        int ans = maxSubarraySum(nums);
        System.out.println(ans);
        //TC: O(n) and SC: O(1)
    }

    private static int maxSubarraySum(int[] nums) {
        int maxi = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxi = Math.max(maxi, sum);
            if (sum < 0) sum = 0;
        }
        return maxi;
    }
}
