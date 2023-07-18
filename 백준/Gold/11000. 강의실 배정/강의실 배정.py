from heapq import heappush, heappop

N = int(input())
lecture = [list(map(int,input().split())) for _ in range(N)]

lecture.sort()

hque = [lecture[0][1]]
for i in range(1,N):
    heappush(hque,lecture[i][1])
    if hque[0] <= lecture[i][0]:
        heappop(hque)
print(len(hque))