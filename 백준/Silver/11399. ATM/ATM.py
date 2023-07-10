N = int(input())
person = list(map(int,input().split()))

person.sort()

time=[]

time.append(person[0])
for i in range(1,N):
    time.append(time[i-1] + person[i])
print(sum(time))