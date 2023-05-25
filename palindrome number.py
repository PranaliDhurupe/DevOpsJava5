#program to check wether the given number is palindrome or not
#we use string slicing
#we can also use (rev)
n = input("Enter the number to be checked: ")
n1 = n[::-1]
if(n==n1):
    print('Yes')
else:
    print("No")