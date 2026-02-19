# %%
N = int(input())

board = [list(map(int, input().split())) for _ in range(N)]


def check(board, x, y, scale, counts):
    first = board[x][y]
    for line in range(x, x + scale):
        for cell in range(y, y + scale):
            if board[line][cell] != first:
                scale = scale // 2
                check(board, x, y, scale, counts)
                check(board, x + scale, y, scale, counts)
                check(board, x, y + scale, scale, counts)
                check(board, x + scale, y + scale, scale, counts)
                return
    if first == 0:
        counts[0] += 1
    else:
        counts[1] += 1


counts = [0, 0]
check(board, 0, 0, N, counts)
print("\n".join(map(str, counts)))
