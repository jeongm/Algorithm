N = int(input())
honey = list(map(int,input().split()))

prefix_sum = [honey[0]]
for i in range(1,N):
    prefix_sum.append(honey[i]+prefix_sum[i-1])

max_honey = 0
bee_total = 0
for i in range(1,N): # 오른쪽
    bee_total = prefix_sum[i-1] - prefix_sum[0] + (prefix_sum[-1] - prefix_sum[i])*2
    max_honey = max(bee_total, max_honey)

for i in range(1,N-1): # 가운데
    bee_total = prefix_sum[i]-prefix_sum[0] + prefix_sum[-2] - prefix_sum[i-1]
    max_honey = max(bee_total, max_honey)

for i in range(N-2,0,-1): # 왼쪽
    bee_total = prefix_sum[-2] - prefix_sum[i] + prefix_sum[i-1]*2
    max_honey = max(bee_total, max_honey)

print(max_honey)