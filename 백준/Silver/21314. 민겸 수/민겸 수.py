mk_num = input()

max_val = ""
min_val = ""

m_cnt = 0
for mk in mk_num:
    if mk == "K":
        max_val += str(10**(m_cnt)*5) 
        if m_cnt > 0:
            min_val += str(10**(m_cnt-1))
        min_val += "5"
        m_cnt = 0
    if mk == "M":
        m_cnt +=1

if m_cnt != 0 :
    max_val += "1"*m_cnt
    min_val += str(10**(m_cnt-1)) 
print(max_val)
print(min_val)