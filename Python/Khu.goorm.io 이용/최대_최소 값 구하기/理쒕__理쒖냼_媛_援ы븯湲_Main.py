a=int(input())
b=int(input())
c=int(input())

#a<b<c
if (a>b):
	temp =a
	a= b
	b= temp
if (a>c):
	temp =a
	a= c
	c= temp
if (b>c):
	temp =b
	b= c
	c= temp		
		

	
	
max=c
min=a
print(max)
print(min)