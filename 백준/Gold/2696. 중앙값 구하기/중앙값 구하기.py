import math

T = int(input())
for t in range(T):
    M = int(input())
    sequences = []
    for _ in range(math.ceil(M / 10)):
        sequences += list(map(int, input().split()))

    median_num = []
    for i in range(0, len(sequences),2):
        median = sequences[:i+1]
        median.sort()
        median_num.append(median[(len(median) // 2)])

    print(math.ceil(len(sequences)/2))
    for i in range(len(median_num)):
        print(median_num[i],end=' ')
        if (i+1)%10 == 0:
            print()
    if t != T-1:
        print()