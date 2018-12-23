dic=input()
start=0
yearlst=[]
word=""
old=""
sum=0
for i in range (0, len(dic)):
	if ord(dic[i]) >=48 and  ord(dic[i]) <=57:
		old+=dic[i]		
	else:
		if old!="":
			if int(old)>=20 and int(old)<=30:
				yearlst.append(old)
				old=""
			else:
				old=""
#마지막꺼추가
yearlst.append(old)
for i in range (0,len(yearlst)):
	yearlst[i]=int(yearlst[i])
for i in range (0,len(yearlst)):
	sum+=yearlst[i]
print(sum)
		
		
		