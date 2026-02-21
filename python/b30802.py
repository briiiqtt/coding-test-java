import math
import sys

input = sys.stdin.readline

N = int(input())
l = [int(i) for i in input().split()]
T, P = map(int, input().split())

print(sum(math.ceil(i / T) for i in l))
print(N // P, N % P)
