class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count = new int[1001]; // Since 0 <= nums[i] <= 1000
        int[] tempResult = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;
        // Count frequency of each number in nums1
        for (int i = 0; i < nums1.length; i++) {
            count[nums1[i]]++;
        }
        // For each number in nums2, check if it appears in nums1 (using count)
        for (int i = 0; i < nums2.length; i++) {
            if (count[nums2[i]] > 0) {
                tempResult[index++] = nums2[i];
                count[nums2[i]]--;
            }
        }
        // Copy the intersection elements to the result array
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = tempResult[i];
        }
        return result;
    }
}
