N, K = map(int,input().split())

person = [i+1 for i in range(N)]
result = []

josephus = 0 
while len(result) != N:
    josephus = (josephus+K-1)%len(person)
    result.append(person.pop(josephus))

print("<"+", ".join(map(str,result))+">")