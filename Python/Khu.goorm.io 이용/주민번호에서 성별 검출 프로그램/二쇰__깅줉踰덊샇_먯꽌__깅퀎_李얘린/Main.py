jumin = input()
disting = int(jumin[7:14])
if (int(disting/1000000) == 1 or int(disting/1000000) == 3):
	print("남성")
elif (int(disting/1000000) == 2 or int(disting/1000000) == 4):
	print("여성")