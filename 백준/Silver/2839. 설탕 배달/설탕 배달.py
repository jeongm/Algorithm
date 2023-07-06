N = int(input())
suger = -1

for i in range(N//5,-1,-1):
    n = N
    n -= 5*i
    n -= n//3*3
    if n == 0:
        suger = i + (N-5*i)//3
        break
    
print(suger)