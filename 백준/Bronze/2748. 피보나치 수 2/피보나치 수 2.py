def fibonacci(n) :
	if dp[n] != 0 :
		return dp[n]
	dp[n] = fibonacci(n-1) + fibonacci(n-2)
	return dp[n]

dp = [0]*100
dp[0] = dp[1] = 1

N = int(input())
fibonacci(N-1)
print(dp[N-1])