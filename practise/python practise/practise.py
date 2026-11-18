"""

n = int(input())


for i in range(n+1): # even number from 1 to n
    if(i==0):
        continue
    elif(i%2==0):
         print(i," : even number")

for i in range(n+1):   #mutiple of 4
    if(i%4==0):
        print(i,": mutiple of 4")


for i in range(n, 0, -1): # number in reverse order from n to 1
    print(i, end=" ")


s = ""
for i in range(n + 1):
    if i % 4 == 0:
        s = str(i)+ " " + s
print(s)
    



n=int(input())

for i in range(n+1):
    print("*",end="")

for i in range(n):
    print("*",end=" ")

c=1
for i in range(n+1):
    if(i%2==0):
        print("*",end=" ")
    else:
        print(c,end=" ")
        c += 1

b=65
for i in range(n+1):
    print(chr(b),end=" ")
    b=b+1

for i in range(ord('a'),ord('f')):
    print(chr(i),end=" ")

    """


message1="hello1"
def show():
    message="hello"
    print(message)

show()
print(message1)
