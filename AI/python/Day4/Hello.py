print("Hello World!!")
print("My favoiurites colors are", 'blue', 'green', 'red')
name = "Mobin"
age=28


# Python is dynamically typed language
age = "Twenty Eight"

my_integer_var = 1
my_integer2_var = -5
print("My Integer is",my_integer2_var)

my_float_num = 4.5
print("My float num is", my_float_num)

my_string_var ="THis is the String var"
print("String::", my_string_var)

my_boolean_var = True
print("My boolean is", my_boolean_var)


developer = "Mobin"
print(type(developer)) #<class 'str>

# type() function in python is helpful to check the data type of variable

my_int_var = 10
print(type(my_int_var)) # <class 'int'>

my_float_var = 4.5
print(type(my_float_var)) #<class 'float'>

my_string_var = "This is the simple string"
print(type(my_string_var)) #<class 'str'>

my_boolean_var = False
print(type(my_boolean_var)) # <class 'bool'>

account_balance = '12' 
isinstance(account_balance, int)# False

account_balance = 12
isinstance(account_balance, (int,float)) # True


age = 17
if age > 18:
    print("You can enter")
elif age == 18:
    print("Go see Pinky Floyd")
else :
    print("Go see Meat  Loaf")
print("Move ON")

my_str_1 = 'Hello'
my_str_2 = "World"

