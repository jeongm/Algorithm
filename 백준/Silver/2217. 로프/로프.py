N = int(input())
ropes = [int(input()) for _ in range(N)]

ropes.sort(reverse=True)

weight = N*min(ropes)
for i in range(1,N+1):
    min_weight = ropes[i-1]
    if min_weight*i > weight:
        weight = min_weight*i

print(weight)