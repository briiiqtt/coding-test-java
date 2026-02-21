cnt = input()
link_cnt = int(input())
infected = {"1"}
links = [input().split() for i in range(link_cnt)]
i = 0
while i < len(links):
    a, b = links[i]
    if a in infected and b not in infected:
        infected.add(b)
        i = 0
    elif b in infected and a not in infected:
        infected.add(a)
        i = 0
    i += 1
print(len(infected) - 1)
