T = int(input())

for i in range(T):
    vps = input()
    end = 0;left = 0;right=0
    for ps in vps:
        end+=1
        if ps == '(':
            left += 1
        else :
            right += 1
        if right > left :
            print('NO')
            break;
        elif end == len(vps):
            if left == right:
                print('YES')
            else :
                print('NO')
                