import sys


def readline():
    return sys.stdin.readline().rstrip()

results = []
while True:
    n = int(readline())
    if n == 0:
        break
    results.append(sorted([readline() for _ in range(n)], key=str.lower)[0])

print("\n".join(results))