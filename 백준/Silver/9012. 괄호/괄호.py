T = int(input())

result = ''

for _ in range(T):
    ps = input()
    left =0; right =0
    for p in ps:
        if p == '(' :
            left +=1
        else :
            right +=1

        if right > left :
            break
    if left == right:
        result = 'YES'
    else :
        result = 'NO' 
    print(result)
