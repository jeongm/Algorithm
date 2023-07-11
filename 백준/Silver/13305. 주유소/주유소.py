N = int(input())
roads = list(map(int,input().split()))
oils = list(map(int,input().split()))

oil = oils[0]
total = 0

for i in range(1,N):
    total += roads[i-1] * oil
    if oil > oils[i]:
        oil = oils[i]
print(total)