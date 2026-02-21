# %%
import sys

input = sys.stdin.readline
N, K = map(int, input().split())
A = list(map(int, input().split()))

def insertion_sort(arr, K):
    for i in range(1, len(arr)):
        val = arr[i]
        j = i
        while j >= 1 and arr[j - 1] > val:
            arr[j] = arr[j - 1]
            j -= 1
            K -= 1
            if K == 0:
                return False
        arr[j] = val
        if j != i:
            K -= 1
            if K == 0:
                return False
    else:
        return True


suc = insertion_sort(A, K)

print(-1 if suc else " ".join(map(str, A)))
