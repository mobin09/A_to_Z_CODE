
print("Hello Mobin")
print("Welcome to Python")

print("Hello Mobin")
print("Welcome to Python")

print("Hello Mobin")
print("Welcome to Python")

print("\n")

def greet():
    print("Hello Mobin")
    print("Welcome to Python")


greet();
greet();
greet(); 


# def function_name():
#     #function body
#     #function statement

# example
def hello():
    print("Hello World")

hello()

print("\n")

def welcome():
    print("Welcome to AI Engineering")
    print('Let\'s learn Python first')

welcome()
print("*******************\n")

def greet(name):
    print(f"welcome {name}")

greet("Mobin")
greet("Mohit")

#output
#welcome Mobin
#welcome Mohit

print("**************\n")

def sum(a,b):
    print(a+b)

sum(6,7)
sum(8,5)

print("****************\n")

def sum(a,b):
    return a+b;

result = sum(5,6)
print(result)


def calculate(a,b):
    addition = a+b
    subtraction = a -b
    multiply = a * b

    return addition, subtraction, multiply

result = calculate(5,3)
print(result)

#ouput: (8, 2, 15)

add, sub, mul = calculate(5,3)
print(add)
print(sub)
print(mul)


print("*******************\n")

def greet(name = "Guest"):
    print(f"Hello {name}")

greet("Mobin")
greet()

#Output:
#Hello Mobin
#Hello Guest


print("****************\n")

def calculate_salary(basic_salary, bonous=5000):
    return basic_salary + bonous

print(calculate_salary(10000))
print(calculate_salary(10000, 10000))

#ouput:
15000
20000


print("*******************\n")

def employee(name, age = 28):
    print(name, age)


# def employee(age = 28, name):
#     print(name,age)


print("*******************\n")
#keyword arguement

def employee(name, age, role):
    print(name)
    print(age)
    print(role)

employee(
    role = "Software Development",
    name = "Mobin Arshad",
    age = 28
)

#output
# Mobin Arshad
# 28
# Software Development

print("******************\n")

def add(*args):
    print(args)

add(10,20,30)

#output: (10, 20, 30)


def add1(*nums):
    print(nums)

add1(7,8,6)
# output: (7, 8, 6)


def sum_nums(*args):
    sum = 0
    for i in args:
        sum += i
    return sum

result = sum_nums(10,20,30,40)
print(result) #100

print("**********************\n")

def employee(**kwargs):
    print(kwargs)

employee(
    name= "Mobin Arshad",
    role ="Software Engineer",
    age = 28,
    city = "Delhi"
)

#output:
#{'name': 'Mobin Arshad', 'role': 'Software Engineer', 'age': 28, 'city': 'Delhi'}


def employee(**kwargs):
    for key, value in kwargs.items():
        print(key,value)


employee(
    name = "Mobin Arshad",
    age = "28",
    role ="Developer",
    city = "Delhi"
)

# output:
# age 28
# role Developer
# city Delhi

print("*************\n")

def check_age(age):
    check = ""
    if age >= 18:
        check =  "Eligible"
    else:
        check = "Not Eligible"

    return check

result = check_age(18)
print(result)

print("**************\n")

def greet():
    messgae = "Hello Mobin"
    print(messgae)

# greet()
# print(message)

name = "Mobin Arshad"
def greet():
    print(name)

greet()

count = 10
def update_count():
    global count
    count = 20

update_count()
# print(count)

print("************************\n")

#normal function
def square(number):
    return number * number 

print(square(5)) # 25


#lambda function

square = lambda number: number * number
print(square(25)) #625


print("***********************\n")

def fact(n):
    if(n == 1):
        return 1

    return n * fact(n-1)

result = fact(5)
print(result)


def calculate_area(length, width):
    """
    Calculate the area of a rectangle.

    Args:
        length: Length of rectangle.
        width: Width of rectangle.

    Returns:
        Area of rectangle.
    """
    return length * width
        




result = calculate_area(20 , 10)
print(result) # 200

print(calculate_area.__doc__)