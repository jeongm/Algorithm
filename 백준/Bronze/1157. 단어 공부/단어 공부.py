word = input()

same = False  # 같은게 없음

alphabet = [0 for i in range(26)]

for i in range(len(word)):
    if ord(word[i]) - 65 > 26:
        alphabet[ord(word[i]) - 97] += 1
    else:
        alphabet[ord(word[i]) - 65] += 1

maxVal = -1
for i in range(len(alphabet)):
    if maxVal < alphabet[i]:
        maxVal = alphabet[i]
        al_max = i

cnt = 0
for i in range(len(alphabet)):
    if maxVal == alphabet[i]:
        cnt += 1
        if cnt == 2:
            same = True
            break

if not same:
    print(chr(al_max + 65))
else:
    print('?')
