from collections import deque

N, M = map(int,input().split())
elements = [*map(int,input().split())]

dque = deque([i+1 for i in range(N)],maxlen=N)

cnt = 0
target_idx = 0
while target_idx != M:
    target_idx_dque = dque.index(elements[target_idx])
    if target_idx_dque == 0 :
        dque.popleft()
        target_idx +=1
    elif target_idx_dque <= len(dque)//2:
        dque.rotate(-1)
        cnt +=1
    else :
        dque.rotate(1)
        cnt +=1
        
print(cnt)