my_key = ('one', 'two', 'three', 'four', 'five')
my_value = ('일', '이', '삼', '사', '오')

a= input()
if a in my_key:
	print(my_value[my_key.index(a)])
else :
	print("NULL")
