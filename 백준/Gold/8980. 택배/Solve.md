### 알고리즘
- 유형 : 그리디, 정렬
### 풀이
- 가장 빨리 도착하는 마을을 기준으로 정렬한다.
- 마을의 개수 크기의 배열을 만들어 택배의 최대 용량을 저장한다.
- 마을을 지나칠 때마다 담을 수 있는 택배의 무게를 뺀다.


```python
N ,C= map(int,input().split())
M = int(input())
box = [list(map(int,input().split())) for _ in range(M)]

box.sort(key= lambda x:(x[1]))

delivery = [C] * N
max_delivery = 0
for i in range(M):
    min_weight = min(delivery[box[i][0]-1:box[i][1]])
    min_weight = min(min_weight,box[i][2])
    if 0 not in delivery[box[i][0]-1:box[i][1]] :
        max_delivery += min_weight
        for j in range(box[i][0],box[i][1]):
            delivery[j-1] -= min_weight
print(max_delivery)

![8980](https://github.com/jeongm/baekjoon/assets/57540375/4870e3d2-f22e-41ce-9bf4-c1e1159e5d71)
