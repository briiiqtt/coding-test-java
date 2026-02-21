import sys

inputs = sys.stdin.read().split()

l = [int(item[::-1]) for item in inputs[1:]]
l.sort()

print("\n".join(map(str, l)))


