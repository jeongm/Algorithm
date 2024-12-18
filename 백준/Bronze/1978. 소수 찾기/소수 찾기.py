N = int(input())
num = map(int,input().split())
sosu_arr = [0 for i in range(1001)]

sosu_arr[0] = 1
sosu_arr[1] = 1

for i in range(2,1001) :
    for j in range(i*i,1001,i) :
        if sosu_arr[j] == 0 :
            sosu_arr[j] = 1

answer = 0
for n in num :
    if sosu_arr[n] == 0 :
        answer +=1

print(answer)
