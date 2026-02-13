T = int(input())
ans = []
for i in range(T):
    H, W, N = map(int, input().split())
    y = (N - 1) % H + 1
    x = (N - 1) // H + 1
    ans.append(f"{y}{x:02}")

print("\n".join(ans))
