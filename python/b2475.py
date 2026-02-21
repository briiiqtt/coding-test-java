import sys

input = sys.stdin.readline

l = [int(i) ** 2 for i in input().split()]
print(sum(l) % 10)
