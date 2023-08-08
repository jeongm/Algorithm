N = int(input())
consult = [list(map(int,input().split())) for _ in range(N)]

total=[]
def consulting(day):
    global maxCost
    if day >= N:
        return 
    for i in range(day,N):
        if i+consult[i][0] > N:
            continue
        total.append(consult[i][1])
        consulting(i+consult[i][0])
        maxCost = max(maxCost,sum(total))
        total.pop()

maxCost = 0
consulting(0)

print(maxCost)