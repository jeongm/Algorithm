str_exp = input()

start_idx = 0
result = 0
exp =[]
stack=[]

for i in range(1,len(str_exp)):
    if str_exp[i].isdigit() == False:
        exp.append(int(str_exp[start_idx:i]))
        exp.append(str_exp[i])
        start_idx = i+1
        
exp.append(int(str_exp[start_idx:]))

for i in range(len(exp)-1,-1,-1):
    if type(exp[i]) is int:
        stack.append(exp[i])

    if exp[i] == "-":
        result -= sum(stack)
        stack =[]

result += sum(stack)

print(result)
