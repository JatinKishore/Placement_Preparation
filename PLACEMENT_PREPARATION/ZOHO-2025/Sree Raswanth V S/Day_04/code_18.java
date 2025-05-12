class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare mid with its next element
            if (nums[mid] > nums[mid + 1]) {
                // Peak is in the left half (including mid)
                right = mid;
            } else {
                // Peak is in the right half (excluding mid)
                left = mid + 1;
            }
        }

        // At the end of the loop, left == right and pointing to a peak element
        return left;
    }
}
