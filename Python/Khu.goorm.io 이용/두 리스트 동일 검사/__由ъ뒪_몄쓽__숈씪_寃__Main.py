list1=[]
list2=[]
for a in range(0, 3):
	list1.append(int(input()))
for b in range(0, 3):	
	list2.append(int(input()))
if list1[0]==list2[0] and list1[1]==list2[1] and list1[2]==list2[2]:
	print(1)
else:
	print(-1)
