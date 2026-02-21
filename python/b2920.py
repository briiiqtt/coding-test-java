import sys

input = sys.stdin.readline

l = input().split()
ascending = l[0] < l[1]
for i in range(1, len(l) - 1):
    if ascending and l[i] > l[i + 1]:
        print("mixed")
        break
    elif not ascending and l[i] < l[i + 1]:
        print("mixed")
        break
else:
    print("ascending" if ascending else "descending")
