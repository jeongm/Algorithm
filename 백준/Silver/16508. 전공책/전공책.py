import itertools

T = input()
N = int(input())
books=[]
price=[]
for _ in range(N):
    p,b = input().split()
    books.append(b)
    price.append(int(p))

bookCombi=[]
for i in range(1,N+1):
    bookCombi = bookCombi+list(itertools.combinations(range(N),i))

flag = 0
minPrice = sum(price)
for sb in bookCombi:
    book = [ books[i] for i in sb]
    selectPrice = 0
    pointer = -1
    for t in T:
        for i in range(len(book)):
            if t in book[i]:
                book[i] = book[i].replace(t,'',1)
                pointer +=1
                break
    if pointer == len(T)-1:
        flag = 1
        for i in sb:
            selectPrice += price[i]
        minPrice = min(selectPrice, minPrice)

if flag == 0:
    print(-1)
else:
    print(minPrice)