# Maximize profit by cutting a rod and selling the pieces based on given prices.
def cut_rod(price, n):
    dp = [0] * (n + 1)
    for i in range(1, n + 1):
        for j in range(i):
            dp[i] = max(dp[i], price[j] + dp[i - j - 1])
    return dp[n]
# Mariyappan
