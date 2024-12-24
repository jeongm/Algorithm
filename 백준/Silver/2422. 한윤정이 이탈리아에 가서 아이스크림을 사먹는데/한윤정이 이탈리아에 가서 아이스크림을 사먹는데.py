N,M= map(int, input().split())

no_com=[list(map(int, input().split())) for i in range(M)] # 맛없는 조합

hate_com=[[] for i in range(N)] # 각 번호가 싫어하는 조합
for i in range(M):
    hate_com[no_com[i][0]-1].append(no_com[i][1])
    hate_com[no_com[i][1]-1].append(no_com[i][0])
    
com=[]
com_len=0
for i in range(N-2):
    for j in range(i+1,N):
        for r in range(j+1,N):
            com.append([])
            com[com_len].append(i+1)
            if j+1 in com[com_len]or j+1 in hate_com[i]:
                del com[com_len]
                continue
            else: 
                com[com_len].append(j+1)
            if r+1 in com[com_len]or r+1 in hate_com[i] or r+1 in hate_com[j]:
                del com[com_len]
                continue
            else:
                com[com_len].append(r+1)
                com_len+=1
            
print(com_len) 