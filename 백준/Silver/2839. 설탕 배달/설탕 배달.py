N = int(input())

result = N
for i in range(N//5+1):
    tmp = N-5*i

    if tmp%3 == 0 :
        result = min(i + tmp/3,result)

if result == N:
    print(-1)
else :
    print(int(result))