class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        // Place each number in its correct index (i.e., nums[i] == i + 1)
        for (int i = 0; i < n; i++) {
            // Keep swapping until the current number is in its correct position,
            // or it is out of the desired range (1 to n)
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // swap nums[i] and nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        // Find the first index i such that nums[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        // If all values are in place, then the smallest missing is n + 1
        return n + 1;
    }
}
