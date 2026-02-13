import sys
input = sys.stdin.readline

l = []
while True:
    ip = input().rstrip()
    if ip == "0 0 0":
        break

    nums = sorted(list(map(int, ip.split())))
    
    l.append("right" if nums[0] ** 2 + nums[1] ** 2 == nums[2] ** 2 else "wrong")
print("\n".join(l))
