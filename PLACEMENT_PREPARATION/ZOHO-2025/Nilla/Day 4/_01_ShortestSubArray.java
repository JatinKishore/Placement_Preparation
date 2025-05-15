public class ShortestSubArray {
    public static int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int start = 0, sum = 0;
        for (int end = 0; end < n; end++) {
            sum += nums[end];
            while (sum >= k) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 11;
        System.out.println("Shortest subarray length: " + shortestSubarray(nums, k)); 
    }
}
