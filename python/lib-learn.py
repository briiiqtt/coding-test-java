##sys.stdin.readline()
## rstrip(): 줄바꿈기호 제거

# import sys

# line = sys.stdin.readline().rstrip()
# print(line)

# %%
arr = [1, 2, 3, 4, 5]
print(sum(arr))
print(min(arr))
print(max(arr))

# %%
print(eval("1+1"))


# %%
arr = [7, 2, 9]
print(sorted(arr))
print(sorted(arr, reverse=True))

# %% 순열과 조합
from itertools import permutations, combinations

arr = [84, 61, 246]

print(list(permutations(arr, 3)))
print(list(combinations(arr, 2)))

# 중복 허용 순열
from itertools import product, combinations_with_replacement as cwr

print(list(product(arr, repeat=2)))  # 중복을 허용하고 2개를 뽑는 순열
print(list(cwr(arr, repeat=2)))  # 중복을 허용하고 2개를 뽑는 조합


# %% 카운터

from collections import Counter

arr = [1, 1, 2, 2, 3, 3, 3, 4, 5, 6, 7, 8, 98, 9, 8, 8, 2, 7, 76, 4, 4, 3]
counter = Counter(arr)
print(counter[1])
print(counter[8])
print(dict(counter))

# %% 최대공약수, 최소공배수

from math import gcd, lcm

print(gcd(21, 14))
print(lcm(21, 14))
