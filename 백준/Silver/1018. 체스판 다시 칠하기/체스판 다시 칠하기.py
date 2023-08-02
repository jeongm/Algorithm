M, N  = map(int,input().split())
chessboard = [input() for _ in range(M)]

recnt = 32

def repaint(board,recnt):
    bstart = ['BWBWBWBW','WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBWBWBW','WBWBWBWB']
    wstart = ['WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBWBWBW','WBWBWBWB','BWBWBWBW']

    bcnt = wcnt = 0
    for i in range(8):
        for j in range(8):
            if board[i][j] != bstart[i][j]:
                bcnt +=1
            if board[i][j] != wstart[i][j]:
                wcnt +=1
    return min(recnt, bcnt, wcnt)

for i in range(M-7):
    for j in range(N-7):
        board = []
        for k in range(8):
            board.append(chessboard[i+k][j:j+8])
        recnt = repaint(board,recnt)    

print(recnt)
