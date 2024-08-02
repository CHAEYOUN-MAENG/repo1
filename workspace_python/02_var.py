a = 10
naver = 1
nvaer = 2 # 변수에 오타 주의

# alt + ctrl + n 실행단축키

b = a // 3 # 내림
print(b)
print(-a // 3)
print(a % 3)

print (2 ** 10) # 거듭제곱 2의 10승

# int 자료형으로 형변환
a = int(-3.3) # 실수일경우 버림
print(a)
print(int('100') + 1)

# 어떤 타입인지 알고 싶다면 type()
a = 10
print(type(a))
a = "abc"
print(type(a))
print(type(print))

# 정밀도
a = 0.12345678901234567890
print(a) # 소수점 14자리까지 정밀

a, b, c = 10, 20, 30
print(a,b,c)

# boolean은 대문자로
a = True
b = False
c = None # null 대신 None
# 파이썬에서 False로 인식되는 경우 : False, None
# True 는 False가 아닌 것

# scanner에 해당되는 것
# a = input()
# print(a)

print('abc' == 'abc') # 문자도 == 으로 비교한다

a = 3 > 5
b = 7 > 5
print(a and b)
print(a or b)
print(not (a  or b))

id = '아이디'
html = '''
<div>
    <strong>아이디</strong>
'''
print(html)

html = f'''
<div>
    <strong>{id}</strong>
'''
print(html)

print("쌍따옴표 기호는 \" 입니다")