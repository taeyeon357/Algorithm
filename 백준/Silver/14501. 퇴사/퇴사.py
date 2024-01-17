import sys
input = sys.stdin.readline

n = int(input())

cons = []
for _ in range(n):
    t, p = map(int, input().split())
    cons.append([t,p])

dp = [0 for _ in range(n+1)]

for i in range(n-1, -1, -1):
    if i + cons[i][0] > n:
        dp[i] = dp[i+1]
    else:
        dp[i] = max(cons[i][1]+dp[i+cons[i][0]], dp[i+1])

print(dp[0])
