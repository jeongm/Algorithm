import sys

N = int(sys.stdin.readline())

words = []
for i in range(N):
    words.append(sys.stdin.readline().strip())

words = list(set(words))

words.sort()
words.sort(key= len)
for word in words:
    print(word)

