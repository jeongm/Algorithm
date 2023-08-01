from itertools import combinations

N,M= map(int,input().split()) # 회원 수, 치킨 종류 수
like = [list(map(int, input().split())) for _ in range(N)]

maxlike = 0
for p1,p2,p3 in combinations(range(M),3):
    sum=0
    for i in range(N):
        sum += max(like[i][p1],like[i][p2],like[i][p3])
    maxlike =  max(sum,maxlike)
print(maxlike)