public class Solution {
	public static int cutRod(int price[], int n) {
		// dp[i] will store the maximum price obtainable for a rod of length i
		int[] dp = new int[n + 1];
		dp[0] = 0; // Base case: no rod means no cost

		// Build the dp array from 1 to n
		for (int i = 1; i <= n; i++) {
			int maxVal = 0;
			for (int j = 0; j < i; j++) {
				maxVal = Math.max(maxVal, price[j] + dp[i - j - 1]);
			}
			dp[i] = maxVal;
		}

		return dp[n];
	}
}
