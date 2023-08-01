N, K = map(int,input().split())
chickens = [list(map(int,input().split())) for _ in range(N)]

max_like = 0
visit=[0] * K

select=[]

def dfs(depth):
    global max_like
    if depth > 2:
        people_like = [0] * N
        for i in range(K):
            if visit[i] == 1:   
                for j in range(N):
                    people_like[j] = max(people_like[j],chickens[j][i])
        max_like = max(max_like,sum(people_like))
        return
    for i in range(K):
        if visit[i] == 1:
            continue
        visit[i] = 1
        dfs(depth+1)
        visit[i] = 0

dfs(0)

print(max_like)