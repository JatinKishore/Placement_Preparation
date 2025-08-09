class LongestSubArray {

    public static int lengthOfLongestSubarray(int[] nums) {
        int n = nums.length;
        if (n < 3) return n;

        int maxLen = 0;
        int left = 0;
        int lastElement = -1;
        int secondLastElement = -1;
        int lastElementCount = 0;

        for (int right = 0; right < n; right++) {
            int current = nums[right];
          
            if (current == lastElement || current == secondLastElement) {
                lastElementCount++;
            } else {
                left = right - lastElementCount;
                secondLastElement = lastElement;
                lastElement = current;
                lastElementCount = 1;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};             
        System.out.println(lengthOfLongestSubarray(nums));
    }
}
