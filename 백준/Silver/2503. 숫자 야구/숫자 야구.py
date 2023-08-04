from itertools import permutations

N = int(input())
game = [list(map(int,input().split())) for _ in range(N)]

# game.sort(key=lambda x:x[1], reverse=True)

allPossibility = permutations(range(1,10),3)
possibility = 504

for item in allPossibility:
    for ask in game:
        num = list(map(int,str(ask[0])))
    # strike, ball
        s, b = 0,0
        for i in range(3):
            if num[i] == item[i]:
                s += 1
            elif num[i] in item:
                b +=1
        if s != ask[1] or b != ask[2]:
            possibility -= 1
            break
print(possibility)