import sys
ip = sys.stdin.readline().rstrip()

sum = 0
for i in ip:
    sum += int(i) ** 5 

print(sum)
