N = int(input())

town= []
total_people = 0
for i in range(N):
    town.append(list(map(int,input().split())))
    total_people += town[i][1]

town.sort()

people = 0
for i in range(N):
    people += town[i][1]
    if people >= total_people/2 :
        print(town[i][0])
        break