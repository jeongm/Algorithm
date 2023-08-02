M, N  = map(int,input().split())
chessboard = [input() for _ in range(M)]

min_change = M*N//2

def chessdraw(x,y):
    global min_change
    if chessboard[0][0] == "W":
        start = "WB"
    else :
        start = "BW"

    change = 0
    for i in range(8):
        for j in range(8):
            if j%2 == 0 and chessboard[i+x][j+y] != start[0]:
                change+=1
            elif j%2 == 1 and chessboard[i+x][j+y] != start[1]:
                change +=1
        start = start[::-1]
    
    min_change = min(min_change,change,64-change)
    

for i in range(M-8+1):
    for j in range(N-8+1):
        chessdraw(i,j)

print(min_change)
