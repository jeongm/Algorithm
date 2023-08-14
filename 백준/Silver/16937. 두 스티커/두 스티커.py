import itertools

paper = list(map(int,input().split()))
N = int(input())
stickers = [list(map(int,input().split())) for _ in range(N)]


max_area = 0
stickerCombi = list(itertools.combinations(stickers,2))

for st in stickerCombi:
    # 회전 없음
    if (st[0][0] + st[1][0] <= paper[0] and max(st[0][1],st[1][1]) <= paper[1]) or (st[0][0] + st[1][0] <= paper[1] and max(st[0][1],st[1][1]) <= paper[0]):
        max_area = max(max_area, st[0][0]*st[0][1] + st[1][0]*st[1][1])
    # 둘 다 회전
    if (st[0][1] + st[1][1] <= paper[0] and max(st[0][0],st[1][0]) <= paper[1]) or (st[0][1] + st[1][1] <= paper[1] and max(st[0][0],st[1][0]) <= paper[0]):
        max_area = max(max_area, st[0][0]*st[0][1] + st[1][0]*st[1][1])
    # 0번 회전
    if (st[0][1] + st[1][0] <= paper[0] and max(st[0][0],st[1][1]) <= paper[1]) or (st[0][1] + st[1][0] <= paper[1] and max(st[0][0],st[1][1]) <= paper[0]):
        max_area = max(max_area, st[0][0]*st[0][1] + st[1][0]*st[1][1])
    # 1번 회전
    if (st[0][0] + st[1][1] <= paper[0] and max(st[0][1],st[1][0]) <= paper[1]) or (st[0][0] + st[1][1] <= paper[1] and max(st[0][1],st[1][0]) <= paper[0]):
        max_area = max(max_area, st[0][0]*st[0][1] + st[1][0]*st[1][1])
print(max_area)