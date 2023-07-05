import heapq

N = int(input())

table =[]
for _ in range(N):
    for num in list(map(int,input().split())):
        heapq.heappush(table,num)
    table = heapq.nlargest(N,table)
print(table[-1])