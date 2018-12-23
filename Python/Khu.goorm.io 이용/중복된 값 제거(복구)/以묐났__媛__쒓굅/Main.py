num = input()
lst = num.split()
sum=0
for i in range (0,len(lst)):
	lst[i]=int(lst[i])
lst=set(lst)
lst=list(lst)
lst.sort()
for i in range (0,len(lst)):
	print(lst[i],end=" ")

		 


	