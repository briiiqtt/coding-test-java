import sys

input = sys.stdin.readline


class Stack:
    def __init__(self):
        self.top = None
        self.size = 0

    def push(self, data):
        node = Node(data, self.top)
        self.top = node
        self.size += 1

    def pop(self):
        if self.size == 0:
            return -1
        else:
            data = self.top.data
            self.top = self.top.next
            self.size -= 1
            return data

    def getSize(self):
        return self.size

    def empty(self):
        return 0 if self.size > 0 else 1

    def getTop(self):
        if self.size != 0:
            return self.top.data
        else:
            return -1


class Node:
    def __init__(self, data, next):
        self.data = data
        self.next = next


N = int(input())
stack = Stack()
ans = []
for i in range(0, N):
    l = input().split()
    if len(l) > 1:
        stack.push(l[1])
    else:
        if l[0] == "pop":
            ans.append(stack.pop())
        elif l[0] == "size":
            ans.append(stack.getSize())
        elif l[0] == "empty":
            ans.append(stack.empty())
        elif l[0] == "top":
            ans.append(stack.getTop())

print("\n".join([str(w) for w in ans]))
