N, M = map(int,input().split())
nHear = set()
nLook = set()
for _ in range(N):
    nHear.add(input())
for _ in range(M):
    nLook.add(input())

result = sorted(list(nHear & nLook))

print(len(result))
for word in result:
    print(word)