"""

packing_charge=lambda x:x+50
ankit_price=200
final_price=packing_charge(ankit_price)

print ("ankit price on sale available (all use compatible): ",final_price)


n=int(input())
r=lambda n:n*2
print(r(n))

"""

sq=lambda x:x**2
is_even=lambda x:x%2==0
largest=lambda a,b: a if a>b else b
print(sq(4))
print(is_even((9)))
print(largest(12,7))