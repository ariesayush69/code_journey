
""" n = int(input())
for i in range(n+1):
    for j in range(n+1):
        print("*",end=" ")
    print() 



n = int(input())
c=n+1;
for i in range(n+1):
    for j in range(c):
        print("*",end=" ")
    c-=1
    print()

   

n=int(input())
for i in range(n):
    
    for j in range(i):
        print(" ", end="")
    for j in range(n - i):
        print("*", end="")
    print()



n=int(input())
for i in range(n):
    
    for j in range(n - i):
        print(" ", end="")
    for j in range(i):
        print("*", end="")
    print()

     """