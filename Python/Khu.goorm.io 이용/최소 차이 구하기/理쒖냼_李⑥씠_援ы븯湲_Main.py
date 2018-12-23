lst=[]
subnum=[]
for i in range(0,5):
	lst.append(int(input()))
for i in range(0,5):
	for j in range(i+1,5):
		subnum.append(abs(lst[i]-lst[j]))
print(min(subnum))
		

