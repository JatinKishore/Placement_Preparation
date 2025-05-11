class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Maximum possible value as per constraints
        boolean[] map = new boolean[1001];
        boolean[] seen = new boolean[1001];
        // Mark elements of nums1
        for (int i = 0; i < nums1.length; i++) {
            map[nums1[i]] = true;
        }
        // Count common elements without duplicates
        int count = 0;
        for (int i = 0; i < nums2.length; i++) {
            int val = nums2[i];
            if (map[val] && !seen[val]) {
                seen[val] = true;
                count++;
            }
        }
        // Create result array
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < 1001; i++) {
            if (seen[i]) {
                result[index++] = i;
            }
        }
        return result;
    }
}
