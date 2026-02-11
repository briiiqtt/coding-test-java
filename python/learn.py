# %% e로 10의 지수 표현 가능
a = 1e9
print(a)

a = 3.75e2
print(a)

# %%
print(7 / 3)
print(7 // 3)
print(int(7 / 3))


# %% 리스트
a = [1, 2, 3, 4, 5]

# 리스트 Slicing [start:stop:step]
print(a[3:6])
print(a[2:])
print(a[::2])

# 리스트 뒤집기
print(a[::-1])

# 리스트 반복 (리스트 내 요소를 반복해서 새 리스트를 만듦)
a = [1, 2]
print(a * 3)

# 리스트 갖고 놀기
print("-------------------------------------------------")
a = [1, 2]

print(len(a))

a[1] = 1
print(a)

a.append(3)  # O(1)
print(a)

a.insert(1, 2)  # O(N)
print(a)

a.reverse()  # O(N)
print(a)

a.sort()  # O(NlogN)
print(a)

a.sort(reverse=True)
print(a)

print(a.count(1))  # O(N)

a.remove(1)  # O(N)
print(a)

# 리스트에서 필터하기
print("-------------------------------------------------")

a = [1, 2, 3]
data = {1}
a = [i for i in a if i not in data]
print(a)

print(2 in a)
print(1 in a)

# 리스트 컴프리헨션
print("-------------------------------------------------")
a = [i for i in range(10)]
print(a)

a = [i for i in range(10) if i % 2 == 1]
print(a)

a = [i * i for i in range(10)]
print(a)

# n * m의 2차원 배열 만들기
n = 3
m = 3
a = [[0] * m for _ in range(n)]
# `a = [[0] * m] * n`를 그렇게 쓸 수 없는 이유: 반복하는 대상이 객체가 되면 얕은 복사가 됨
print(a)


# list.map
print("-------------------------------------------------")
a = [1, 2, 3]
b = list(map(lambda x: x + 1, a))
print(b)


def f(n):
    return n * 3 + 8 / 1


c = list(map(f, a))
print(c)


# %% 문자열
a = "hello"
a = a[:4]
a += " yeah"
print(a * 2)


# %% 튜플
a = (1, 2, 3, 4, 5)
print(a[0])
print(a[2:5])

a[3] = 1  # TypeError: 'tuple' object does not support item assignment

# %% 사전 (key-val) key는 변경불가능한(immutable) 자료형이어야함
a = dict()

a[0] = "배고파"
print(a[0])

a["변경불가능한상수인문자열"] = 0
print(a["변경불가능한상수인문자열"])

a = {0: "hi", 1: "bye", "zz": 3}

print(0 in a)

print(a.keys())
print(a.values())

keys = list(a.keys())

for b in keys:
    print("a.keys", b)


# %% 집합

a = {1, 1, 2}
print(a)

a.add(3)
print(a)

b = set([3, 4, 4])
print(b)

b.update([5, 5])
print(b)

b.remove(5)
print(b)

print(a | b)  # 합집합
print(a & b)  # 교집합
print(a - b)  # 차집합

print(3 in a & b)  # O(N)

# %% I/O

# input()  # 문자열 한 줄 입력 받음

a = "1 2 3"
a = a.split()
a = list(map(int, a))
print(a)

b, c = map(int, "4 5".split())
print(b + c)

# b, c = map(int, "4 5 6".split()) << ValueError: too many values to unpack
print(b + c)

a = list(map(int, input().split()))
print(a)

for i in a:
    print(i, end=" ")  # end 옵션으로 줄바꿈 대체 가능

print()
answer = 8784
print(f"정답: {answer}")


# %% 조건문
def compareWith2(x):
    if x > 2:
        print("larger")
    elif x == 2:
        print("equals")
    else:
        print("smaller")


compareWith2(1)
compareWith2(2)
compareWith2(3)

print(True and False)
print(False or True)
print(not True)

# in, not in

print(1 in [1, 2])
print(0 not in [1])

print("a" in "asdf")
print("b" not in "asdf")

# 조건부 표현식
print("true~" if False else "false~")

# 부등식 중첩 가능
x = 3
tf = 0 < x < 4
print(tf)


# %% 반복문
# 3부터 5까지의 자연수 더하기
sum = 0
for i in range(3, 6):
    sum += i
print(sum)

# 그냥 5번 반복하기
for _ in range(5):
    print("hi")

# 거꾸로 순회
for i in range(5, 0, -1):
    print(i)


# %% 구구단

for i in range(2, 10):
    for j in range(2, 10):
        print(f"{i}x{j}={i*j}")

# %% 함수


def f(a, b=3):
    return a + b


print(f(3, 3))
print(f(a=1, b=2))

# global 키워드
a = 1


def ff():
    # a += 1 # UnboundLocalError: cannot access local variable 'a' where it is not associated with a value
    global a  # 이 스코프에서 a는 전역변수인 a를 쓰겠다고 선언
    a += 1


print(a)
ff()
print(a)

# 근데 이건 됨
p = [1, 2, 3]


def fff():
    p.append(4)


print(p)  # [1,2,3]
fff()
print(p)  # [1,2,3,4]

# 이건 안됨
p = [1, 2, 3]


def fff():
    p = [1, 2, 3]
    p.append(4)


print(p)  # [1,2,3]
fff()
print(p)  # [1,2,3] 4는 fff()안의 p에나 붙어있을 뿐~


# 여러 개 리턴 가능
def ffff():
    return 1, 2, 3, 4


a, b, c, d = ffff()
print(a, b, c, d)


# 람다
result = (lambda a, b: a + b)(3, 7)
print(result)


# 이 과정을
def get_age(x):
    return x[1]


arr = [("김", 30), ("이", 23), ("장", 40)]
print(sorted(arr, key=get_age))

# 이렇게 줄일 수 있다
print(sorted(arr, key=lambda x: x[1]))

# map에서
arr1 = [1, 2, 3]
arr2 = [3, 2, 1]
arr3 = [1, 1, 1]
m = map((lambda a, b, c: a + b + c), arr1, arr2, arr3)
print(list(m))
