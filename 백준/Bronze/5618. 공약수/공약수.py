n = int(input())
nums = list(map(int,input().split()))

for i in range(1,min(nums)+1):
    flag = 0
    for num in nums :
        if num%i == 0 :
            flag +=1
    if flag == n :
        print(i)