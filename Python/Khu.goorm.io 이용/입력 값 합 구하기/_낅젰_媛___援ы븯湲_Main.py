def sumlst(lst):
	sum=0
	for i in range(0,len(lst)):
		sum+=lst[i]
	return sum
lst=[]
for i in range(0,10):
	n=int(input())
	if n==-1:
		break;
	elif n<1 or n>10 :
		continue
	else :
		lst.append(n)		
		
print(sumlst(lst))

		