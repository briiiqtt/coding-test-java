import sys

input = sys.stdin.readline


class Queue:
    def __init__(self):
        self.size = 0
        self.front = None
        self.back = None

    def push(self, data):
        node = Node(data)
        if self.size == 0:
            self.front = node
            self.back = node

        else:
            self.back.next = node
            self.back = node

        self.size += 1

    def pop(self):
        if self.size == 0:
            return -1

        node = self.front
        self.front = self.front.next

        self.size -= 1
        return node.data

    def getSize(self):
        return self.size

    def empty(self):
        return 1 if self.size == 0 else 0

    def getFront(self):
        if self.size == 0:
            return -1
        return self.front.data

    def getBack(self):
        if self.size == 0:
            return -1
        return self.back.data


class Node:
    def __init__(self, data):
        self.next = None
        self.data = data


ans = []
queue = Queue()
N = int(input())
for i in range(0, N):
    l = input().split()
    if len(l) == 1:
        if l[0] == "pop":
            ans.append(queue.pop())
        elif l[0] == "size":
            ans.append(queue.getSize())
        elif l[0] == "empty":
            ans.append(queue.empty())
        elif l[0] == "front":
            ans.append(queue.getFront())
        elif l[0] == "back":
            ans.append(queue.getBack())
    else:
        queue.push(l[1])

print("\n".join([str(i) for i in ans]))
