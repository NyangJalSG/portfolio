import math
x1=int(input())
x2=int(input())
y1=int(input())
y2=int(input())

distance= ( (x1-y1)**2 +(x2-y2)**2 )**0.5
print(math.ceil(distance))