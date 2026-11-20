""" 
n = 5
for i in range(n):
    print(" " * i + "*" * 4) 
    """

"""  
     
       *       
      ***      
     *****     
    *******    
   *********   
  *********** 
  
 


n=int(input())       
c=n-1
p=1
for i in range(n):
    print(" "*c+"*"*p+" "*c)
    c-=1
    p+=2


 """


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

    


n =int(input())
for i in range(n+1):
    if(i==0 or i==n):
        print(" " * i + "*" * n)
    else:
        for j in range(n+1):
            if(j==1 or j==n):
                print("*",end="")
            else:
               print(" ",end="")
    print()


     



    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *




n = int(input())       
c = n - 1
p = 1
for i in range(n):
    print(" " * c + "*" * p)
    c -= 1
    p += 2

row = 1
star = 2 * n - 3
for j in range(n - 1):
    print(" " * row + "*" * star)
    star -= 2
    row += 1    
    





    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

n = int(input())


for i in range(n):
    if i == 0:
        print(" " * (n - 1) + "*")
    else:
        print(" " * (n - 1 - i) + "*" + " " * (2 * i - 1) + "*")


for i in range(n - 2, -1, -1):
    if i == 0:
        print(" " * (n - 1) + "*")
    else:
        print(" " * (n - 1 - i) + "*" + " " * (2 * i - 1) + "*")


        """


