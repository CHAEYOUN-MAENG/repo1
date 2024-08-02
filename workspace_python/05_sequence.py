# 시퀀스 객체란?
# 리스트, 튜플, 문자열, range 등 반복할 수 있는 객체
a = [0, 10, 20, 30, 40, 50, 60, 70, 80, 90]
print(30 in a) # in : 시퀀스에 특정 값이 있는지 조사

print(100 not in a)
print('o' in 'hello')
print(3 in range(0, 10, 2))

# 더하기 연산자가 시퀀스 객체를 붙여주는 용도로 사용
b = [1,2,3]
print(a+b)
print('hello'+'world')
# print('hello'+ 3) 3이 시퀀스 객체가 아니여서 에러남
# 파이썬에서는 문자열 + 문자열만 지원됨 (시퀀스 + 시퀀스)
print('hello' + str(3))
print(b * 4)
print("-"*50)

print(a)
del a[1]
print(a)

c = 'abcde'
print(c[0])
# c[0] = b index로 접근하는 경우, range, 튜플, 문자열은 읽기만 된다

# slice
# [index]로 접근할 수 있는 모든 것에 적용됨
# [시작index, 종료index, step]
# 시작index부터 종료index 바로 앞까지 step씩 증가하면서 읽기
# 종료index가 원본의 길이보다 커도 원본의 길이만큼만 읽는다
# 시작 index 기본값 : 0
# 종료 index  기본값 : len() 즉, length
# step 기본값 : 1
print(a[0:4]) # 0번지부터 2번지까지
print(a[:3]) # 처음부터
print(a[3:]) # 끝까지
print(a[:]) # a[::]와 같음
print(a[::2]) # 모두 출력인데 2개씩 건너띄면서
print(a[5:-1])

a[0] = 100;
a[2:4] = [1,2 ]
print(a)