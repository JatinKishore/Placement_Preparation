//Implement an algorithm to count the number of subarrays with a given sum.

public class CountSubArray {
    public static int subarraySum(int[] nums, int k) {
        int start = 0, end = 0, count = 0, curSum = 0;
        int n = nums.length;

        while (end < n) {
            curSum += nums[end];
            while (start <= end && curSum > k) {
                curSum -= nums[start];
                start++;
            }
            if (curSum == k) {
                count++;
            }
            end++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 1};
        int k = 3;
        System.out.println("Number of subarrays with sum " + k + ": " + subarraySum(nums, k));
    }
}
