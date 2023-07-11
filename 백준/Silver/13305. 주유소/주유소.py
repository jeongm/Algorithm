N = int(input())

road = list(map(int, input().split()))
city_oil = list(map(int, input().split()))

road_size=0 # 전체 도로 길이
mini_oil= city_oil[0] # 가장 저렴한 도시 오일 가격

for i in range(N-1):
    if mini_oil > city_oil[i]:
        mini_oil=city_oil[i]
    road_size+=road[i]
    
    mini_cost=0
for i in range(N):
    if mini_oil == city_oil[i]:
        mini_cost += city_oil[i]*road_size
        break
    else :
        mini_cost += city_oil[i]*road[i]
        road_size -= road[i]

print(mini_cost)