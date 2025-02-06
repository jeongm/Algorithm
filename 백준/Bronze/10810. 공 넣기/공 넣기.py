N, M = map(int,input().split(" "))

lst = [0]*(N+1)

for i in range(M):
    start,end,ballNum = map(int,input().split())
    lst[start:end+1] = [ballNum]*(end-start+1)
for i in range(1,N+1):
    print(lst[i],end=" ")