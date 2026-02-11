from sys import stdin

ip = stdin.readline()

H, I, A, R, C = map(int, ip.split())

print((H * I) - (A * R * C))
