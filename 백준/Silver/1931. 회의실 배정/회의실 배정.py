N = int(input())
meet_time = [list(map(int,input().split())) for _ in range(N)]

meet_time.sort()
meet_time.sort(key = lambda x:x[1])

max_cnt = 1
meet = 0
for i in range(1,N):
    if meet_time[meet][1] <= meet_time[i][0] :
        max_cnt +=1
        meet = i

print(max_cnt)