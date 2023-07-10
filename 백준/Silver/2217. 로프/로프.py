N = int(input())
ropes = [int(input()) for _ in range(N)]

ropes.sort(reverse=True)

weight = N*min(ropes)
for i in range(1,N+1):
    if ropes[i-1]*i > weight:
        weight = ropes[i-1]*i

print(weight)