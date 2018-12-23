nums=[]
while True:
	num=int(input())
	if num>=100:
		if len(nums)==0:
			print(0)
			break		
		else:
			print(max(nums)+min(nums))
			break			
	else:
		nums.append(num)
		
	 

	