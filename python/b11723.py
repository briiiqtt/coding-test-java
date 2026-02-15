import sys
input = sys.stdin.readline

M = int(input())
S = set()
for _ in range(M):
    l = input().split()
    if len(l) == 1:
        if l[0] == "all":
            S = {'1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20'}
        elif l[0] == "empty":
            S.clear()
    else:
        num = l[1]
        if l[0] == "add":
            S.add(num)
        elif l[0] == "remove":
            S.discard(num)
        elif l[0] == "check":
            print('1' if num in S else '0')
        elif l[0] == "toggle":
            if num in S:
                S.remove(num)
            else:
                S.add(num)