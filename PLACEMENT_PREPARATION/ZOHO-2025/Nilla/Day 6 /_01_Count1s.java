public class Count1s {
    public static int countNoConsecutiveOnes(int n) {
        int[][] dp = new int[n+1][2];
        dp[1][0] = 1;  
        dp[1][1] = 1;  

        for (int i = 2; i <= n; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }

        return dp[n][0] + dp[n][1];
    }

    public static int countWithConsecutiveOnes(int n) {
        int total = (int) Math.pow(2, n);
        return total - countNoConsecutiveOnes(n);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Strings of length " + n + " with consecutive 1’s: " + countWithConsecutiveOnes(n));
    }
}
