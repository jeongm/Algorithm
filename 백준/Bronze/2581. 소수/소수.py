



if __name__ == "__main__" :

    M = int(input())
    N = int(input())

    num_arr = [0 for i in range(N+1)]
    num_arr[0] = 1
    num_arr[1] = 1
    min_so = num_arr[M]
    sum_so = 0

    for i in range(2,N+1) :
        for j in range(i*i, N+1, i) :
                num_arr[j] = 1

    sosu = []
    for i in range(M,N+1) :
        if num_arr[i] == 0:
            sosu.append(i)
    
    if len(sosu) == 0 :
         print(-1)
    else :
        print(sum(sosu))
        print(min(sosu))
