//Implement an algorithm to find the contiguous subarray with equal numbers of 0s and 1s.

public class ContiguousSubArray {
    public static int findMaxLength(int[] nums) {
        int n = nums.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += nums[end];
                if (sum == 0) {
                    int len = end - start + 1;
                    maxLength = Math.max(maxLength, len);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 1, 0, 0};
        int result = findMaxLength(nums);
        System.out.println("Longest contiguous subarray length with equal 0s and 1s: " + result);
    }
}
