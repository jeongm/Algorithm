
N ,C= map(int,input().split())
M = int(input())
box = [list(map(int,input().split())) for _ in range(M)]

box.sort(key= lambda x:(x[1]))

delivery = [C] * N
max_delivery = 0
for i in range(M):
    min_weight = min(delivery[box[i][0]-1:box[i][1]])
    min_weight = min(min_weight,box[i][2])
    if 0 not in delivery[box[i][0]-1:box[i][1]] :
        max_delivery += min_weight
        for j in range(box[i][0],box[i][1]):
            delivery[j-1] -= min_weight
print(max_delivery)