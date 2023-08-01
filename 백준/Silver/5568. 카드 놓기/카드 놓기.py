N = int(input())
K = int(input())
cards = [input() for _ in range(N)]

nums = set()
visit=[0] * N

def dfs(depth):
    if depth >= K:
        nums.add("".join(select))
        return
    for i in range(N):
        if visit[i] == 1:
            continue
        visit[i] = 1
        select.append(cards[i])
        dfs(depth+1)
        visit[i] = 0
        select.pop()
    
select=[]

dfs(0)

print(len(nums))