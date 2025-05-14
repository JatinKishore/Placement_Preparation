public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(String s) {
        int[] dp = new int[s.length()];
        return helper(s, 0, dp);
    }

    private static int helper(String s, int index, int[] dp) {
        if (index >= s.length()) return 0;
        if (dp[index] != 0) return dp[index];

        int maxHere = 0;
        int count = 0;

        for (int i = index; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                maxHere = Math.max(maxHere, count);
            } else {
                count = 0;
            }
        }

        dp[index] = maxHere;
        return dp[index];
    }

    public static void main(String[] args) {
        String s = "11011101111";
        System.out.println("Max Consecutive Ones: " + findMaxConsecutiveOnes(s));
    }
}
