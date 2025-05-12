class Solution {
    public int findMaxLength(int[] nums) {
        int maxLength = 0;
        // Use a map to store the first occurrence of a cumulative count
        // Since we can't import a library, we'll simulate the map using an array
        // Count can range from -n to n, so offset it by nums.length
        int[] map = new int[2 * nums.length + 1];
        for (int i = 0; i < map.length; i++) {
            map[i] = -2; // mark as unvisited, -2 since index can be -1
        }

        int count = 0;
        map[nums.length] = -1; // base case: count 0 at index -1

        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1) ? 1 : -1;
            int index = count + nums.length;
            if (map[index] >= -1) {
                int length = i - map[index];
                if (length > maxLength) {
                    maxLength = length;
                }
            } else {
                map[index] = i;
            }
        }

        return maxLength;
    }
}
