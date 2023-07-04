N = int(input())

postfix = input()
postfix_value = {}

for k in postfix:
    if k.isalpha() and k not in postfix_value:
        postfix_value[k] = int(input())

stack =[]
for k in postfix:
    if k.isalpha() == False:
        p2 = stack.pop()
        p1 = stack.pop()
        if k == '+':
            stack.append(p1+p2)
        elif k == '-':
            stack.append(p1-p2)
        elif k == '*':
            stack.append(p1*p2)
        elif k == '/':
            stack.append(p1/p2)
    else:
        stack.append(postfix_value[k])
print(format(stack.pop(),".2f"))