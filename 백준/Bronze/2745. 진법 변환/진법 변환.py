num, jin = map(str,input().split())
jin = int(jin)

arr = ['0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
answer = 0
for i in range(len(num)) :
    answer += arr.index(num[i])*(jin**(len(num)-i-1))

print(answer)