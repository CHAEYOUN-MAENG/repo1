a = [1, 1.2, 'word', True]
print(a)

print(a[1])
# print(a[10]) 범위를 벗어나는 경우 오류 발생
print(a[-2]) # 음수는 뒤에서부터 몇번째인지 

a[3] = False
a[-1] = False

print('abcd'[0]) # 문자열도 배열로 취급한다
print(a[2][1])

# 초기화 할수도 있다
a = []
a = list()

# range
# range(시작 index, 종료 index, step)
# 시작 index부터 종료 index 바로 앞까지 step만큼 증가
# 시작 index 기본값 : 0
# step 기본값 : 1
a = range(10) # 전달인자 하나인 경우 종료 index로 인식
print(a)
print(list(a))
print(list(range(4, 10, 2))) # 4부터 10바로 앞까지 2씩 증가
print(list(range(10, 0))) # 종료 index가 시작보다 적으면 비어있음
print(list(range(10, 0, -1))) # step도 음수가 될 수 있음

