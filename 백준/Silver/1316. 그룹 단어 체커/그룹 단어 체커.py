N = int(input())

count = 0
for _ in range(N):
    alpa  = [False] *26
    flag = 0
    word = input()
    chr = ''
    for i in range(0,len(word)):
        if chr != word[i]:
            if alpa[ord(word[i])-97] == True:
                break
            else :
                alpa[ord(word[i])-97] = True
        chr = word[i]
        flag+=1
    if flag == len(word) :
        count +=1

print(count)