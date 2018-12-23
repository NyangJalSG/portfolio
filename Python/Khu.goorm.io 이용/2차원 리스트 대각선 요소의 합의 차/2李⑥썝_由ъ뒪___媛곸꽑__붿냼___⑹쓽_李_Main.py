list2 = [ [12,23,2,10,3] , [16,8,12,2,1] , [23,4,52,33,2] , [12,11,6,2,84] , [1,2,3,4,5] ]
left=0
right=0
for i in range(0,len(list2)):
	for j in range(0,len(list2[i])):
		if i==j:
			left+=list2[i][j]
		if i+j==4:
			right+=list2[i][j]
print(left-right)