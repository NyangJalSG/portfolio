a=1234
b=0
print("첫번째 자리수")
b=a//1000
print(b)
print("두번째 자리수")
b=a//100%10
print(b)
print("세번째 자리수")
b=a//10%10
print(b)
print("네번째 자리수")
b=a%10
print(b)