searchlist = []
index=-1
for i in range(0,5):
	searchlist.append(int(input()))
key=int(input())
for i in range(0,len(searchlist)):
	if key == searchlist[i]:
		index = i
		break
print(index)
	
										
