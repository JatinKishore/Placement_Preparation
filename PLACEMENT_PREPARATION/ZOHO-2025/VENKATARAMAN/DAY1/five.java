public class kandeeimpleementationn {
    public static int kadane(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar     = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[][] tests = {
            { -2, 1, -3, 4, -1, 2, 1, -5, 4 },
            { 1, 2, 3, 4 },
            { -1, -2, -3 },
            { 5, -2, 5, -1, 2, -3 }
        };

        for (int[] arr : tests) {
            System.out.printf("Array: %s → Max Sum: %d%n",
                java.util.Arrays.toString(arr),
                kadane(arr));
        }
    }
}

// venkataraman
