nums=[]
sum=0
while True:
	num=int(input())
	if num>=100:
		if len(nums)==0:
			print(0)
			break		
		else:
			for i in range(0,len(nums)):
				sum+=nums[i]			
			print(sum)
			print(round(sum/len(nums),2)) #둘쨰짜리 반올림
			break
	else:
		nums.append(num)	