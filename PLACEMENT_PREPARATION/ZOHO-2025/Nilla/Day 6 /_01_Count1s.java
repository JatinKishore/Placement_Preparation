public class Count1s {
      public static int countStringsWithConsecutiveOnes(int n) {
        if (n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 2; 
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        int total = (int) Math.pow(2, n);
        return total - dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Count: " + countStringsWithConsecutiveOnes(n));
    }
}
