stress = 0
work = 0

A, B, C, M = map(int, input().split())

time = 24

if A <= M :
    while time > 0 :
        if stress+A > M :
            stress -= C
            if stress < 0 :
                stress = 0
        else :
            stress += A
            work += B
        time -=1

print(work)