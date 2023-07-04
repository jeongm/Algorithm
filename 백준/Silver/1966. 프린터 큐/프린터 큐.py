N = int(input())

for _ in range(N):
    doc_num, doc = map(int, input().split())
    docs = map(int,input().split())
    docs=list(docs)

    point = 0
    result = 0
    while len(docs) != 0:
        point = point%len(docs)
        if max(docs) == docs[point]:
            result +=1
            docs[point]=0
            if point == doc:
                break
        point +=1
    print(result)