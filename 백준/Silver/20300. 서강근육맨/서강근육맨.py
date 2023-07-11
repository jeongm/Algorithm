N = int(input())
muscle_loss = list(map(int,input().split()))

muscle_loss.sort()
M = 0 if len(muscle_loss)%2 == 0 else muscle_loss.pop()

for i in range(len(muscle_loss)//2):
    M = max(M, muscle_loss[i]+muscle_loss[-i-1])
print(M)