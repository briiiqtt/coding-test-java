# %%
N = int(input())
cnt = 0
while N > 1:
    if N % 3 == 0:
        N /= 3
    elif (N - 1) % 3 == 0:
        N -= 1
    elif N % 2 == 0:
        N /= 2
    else:
        N -= 1
    cnt += 1
print(cnt)

# %%

a = 100_000
a -= 1
a /= 3
a /= 3
a -= 1
a /= 2
a -= 1
a /= 2
a -= 1
a /= 2
a /= 2
a /= 2
a
