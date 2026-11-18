'''

def greet(name):
    print('hello',name)

greet('Ayush')



def sum(a,b):   #FUNCTION WITH BOTH INPUT AND RETURN STATEMENT 
    return a+b
a=int(input())
b=int(input())

r=sum(a,b)
print(r)


def sum(a,b):   #FUNCTION WITH INPUT BUT WITHOT RETURN
    print(a+b)

a=int(input())
b=int(input())
sum(a,b)



def sum():   #FUNCTION WITH RETURN BUT WITHOT INPUT
    return()

r=sum()
print(r)



def sum():    #FUNCTION WITHOUT RETURN AND WITHOT INPUT
    print(4+5)

print(sum())



def students(name,age,roll_no):  # order of variable value passing matters because of un-paramertrized calling
    print("~",name,age,roll_no)

students('ayush',20,55)


def students(name,age,roll_no):    # order of variable value passing NOT matters because of paramertrized calling
    print("@",name,age,roll_no)

students(roll_no=55,age=20,name="ayush")



def welcome(name,message="welcome"):  # default value for message if user does not give it "welcome" will print otherwise it will override the value of message if user enters something
    print(name)
    print(message)

welcome("ayush","aur beta kaise ho")




def min_max(a,b):       # function to print greater of the two values given
    if a<b:
        return a,b
    return b,a
low,high=min_max(5,8)
print(low,high)





def double(n):   #function calling inside one another 
    return n*2
def add_five(n):
    return n+5

print(add_five(double(6)))


'''