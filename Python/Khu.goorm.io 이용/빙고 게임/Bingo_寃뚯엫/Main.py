bingolist=[ [1,2,3,4,5], [6,7,8,9,10], [11,12,13,14,15] , [16,17,18,19,20], [21,22,23,24,25] ]
numlist=[]
while True:
	num=int(input())
	if num<1 or num>25 :
		print("1~25 수로 다시 입력바랍니다")
		continue
	elif num in numlist:
		print("중복되셨습니다")
		continue
	else:
		numlist.append(num)
#가로
		if 1 in numlist and 2 in numlist and 3 in numlist and 4 in numlist and 5 in numlist:
			break
		if 6 in numlist and 7 in numlist and 8 in numlist and 9 in numlist and 10 in numlist:
			break
		if 11 in numlist and 12 in numlist and 13 in numlist and 14 in numlist and 15 in numlist:
			break
		if 16 in numlist and 17 in numlist and 18 in numlist and 19 in numlist and 20 in numlist:
			break
		if 21 in numlist and 22 in numlist and 23 in numlist and 24 in numlist and 25 in numlist:
			break
#세로
		if 1 in numlist and 6 in numlist and 11 in numlist and 16 in numlist and 21 in numlist:
			break
		if 2 in numlist and 7 in numlist and 12 in numlist and 17 in numlist and 22 in numlist:
			break
		if 3 in numlist and 8 in numlist and 13 in numlist and 18 in numlist and 23 in numlist:
			break
		if 4 in numlist and 9 in numlist and 14 in numlist and 19 in numlist and 24 in numlist:
			break
		if 5 in numlist and 10 in numlist and 15 in numlist and 20 in numlist and 25 in numlist:
			break

#대각선
		if 1 in numlist and 7 in numlist and 13 in numlist and 19 in numlist and 25 in numlist:
			break
		if 5 in numlist and 9 in numlist and 13 in numlist and 17 in numlist and 21 in numlist:
			break
	


print("Bingo")