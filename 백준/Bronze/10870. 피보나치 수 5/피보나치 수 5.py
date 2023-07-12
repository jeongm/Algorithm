n = int(input())

f_pre = 0
f_post = 1

for i in range(n+1):
        tmp = f_pre
        f_pre +=f_post
        f_post = tmp
print(f_post)