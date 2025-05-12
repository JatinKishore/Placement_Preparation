 class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] prefixSums = new long[n + 1];

        // Compute prefix sums
        for (int i = 0; i < n; i++) {
            prefixSums[i + 1] = prefixSums[i] + nums[i];
        }

        // Deque implemented using array
        int[] deque = new int[n + 1];
        int front = 0, back = 0;

        int minLen = n + 1;

        for (int i = 0; i <= n; i++) {
            // Try to shrink the window from the front
            while (front < back && prefixSums[i] - prefixSums[deque[front]] >= k) {
                minLen = Math.min(minLen, i - deque[front]);
                front++;
            }

            // Maintain monotonicity of prefix sums in the deque
            while (front < back && prefixSums[i] <= prefixSums[deque[back - 1]]) {
                back--;
            }

            deque[back++] = i;
        }

        return minLen <= n ? minLen : -1;
    }
}
