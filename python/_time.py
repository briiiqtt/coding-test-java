# %%
from sys import stdin
import time

stt = time.time()

for i in range(100_000_000):
    continue

edt = time.time()
print("time:", round(edt - stt, 6))
