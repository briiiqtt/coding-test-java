import sys

input = sys.stdin.readline

N, M = list(map(int, input().split()))
pws = dict()
for i in range(N):
    k, v = input().split()
    pws[k] = v

for i in range(M):
    k = input().rstrip()
    print(pws[k])