# %%
inputSize = input()
ip = input()
ans = 0
x = 1234567891
for i in range(len(ip)):
    ans += (ord(ip[i]) - 96) * 31**i % x

print(ans % x)

# %%
input()
ip = input()
ans = 0
x = 1234567891
for i in range(len(ip)):
    t = ord(ip[i]) - 96
    for j in range(i):
        t *= 31 % x
    ans += t
print(ans % x)
