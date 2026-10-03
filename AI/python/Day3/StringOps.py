message = "AI "
print(message * 3)


name = "Mobin Arshad"
print(len(name))
# Output:
# 12

name = "Mobin"
print(name[0])
print(name[2])
print(name[4])

name="Mobin"
print(name[-1])
print(name[-2])

# Output:
# n
# i

name = "Mobin Arshad"
print(name[0:5])

#Ouput
# Mobin


name = "Mobin Arshad"

print(name[6:12])
print(name[:5])
print(name[6:])


text = "Python"
print(text[0:-1:2])

name = "Mobin Arshad"

print(name.upper())
print(name.lower())
print(name.title())
print(name.capitalize())

name = "   Mobin   "
print(name.strip())

name.lstrip()   # left side
name.rstrip()   # right side

message = "I love Java"
new_message = message.replace("Java", "Python")
print(new_message)

text = "I am learning Python"
print("Python" in text)
print("Java" in text)

# Output
True
False

print("Java" not in text)

# Output
True

text = "Python is easy. Python is powerful."
print(text.count("Python"))


text = "I am learning Python"
print(text.find("Python"))

print(text.find("Java"))

name = "Mobin"
age = 28
message = f"My name is {name} and I am {age} years old."
print(message)

price = 100
quantity = 3
print(f"Total price is {price * quantity}")

name = "Mobin"
print(type(name))

name = "Mobin Arshad"
age = 28
print("My name is {} and I am {} years old.".format(name, age))

print("My name is %s and I am %d years old." % (name, age))

raw_string = r"C:\new_folder\file.txt"
print("Raw String:", raw_string)


for i in range(5):
    print("Hello")

for i in range(5):
    print(i)

for i in range(10):
    print(i)   

print("Second loop:::\n") 

for i in range(2,6):
    print(i)

print("Odd Nummber from 1 to 10")
for i in range(1,10,2):
    print(i)    

print("Stirng Loop")

name="Mobin"
for ch in name:
    print(ch)

print("List")
skills = ["Java", "AWS", "Python", "Kubernetes", "Redis", "Docker", "Microservices", "AI"]
for skill in skills:
    print(skill)    


numbers = [1,2,3,4,5]
for num in numbers:
    if num % 2 ==0:
        print(num)

print("While Loop")

count = 1
while count <=5:
    print("Hello World")
    count += 1


print("Break\n")

for i in range(10):
    if i == 5:
     break
    print(i)


print("Continue")

for i in range(5):
    if i == 2:
        continue
    print(i)

print("Loop with ...");

skills = ["Python", "Java", "AWS"]
for i in range(len(skills)):
    print(i, skills[i]);

print("Loop with Enumerate")

skills = ["Python", "Java", "AWS"]
for i, skill in enumerate(skills):
    print(i, skill)


for i in range(3):
    for j in range(2):
        print(i, j)

# Output:
# 0 0
# 0 1
# 1 0
# 1 1
# 2 0
# 2 1



print("Dictionary section")

user = {
    "name": "Mobin Arshad",
    "age":28,
    "profession": "Software Engineer"
}

for key, value in user.items():
    print(key ,value)

print("Print Key")
for key in user:
    print(key)

# Ouput:
# name
# age
# profession

print("Values\n")
for value in user.values():
    print(value)

# Ouput:
# Mobin Arshad
# 28
# Software Engineer

print("Some Example")
marks = [85, 72, 91, 60, 45]
for mark in marks:
    if mark >= 75:
        print(mark)

print("Total Sum")

prices = [100, 200, 50, 150]
sum = 0
for price in prices:
    sum += price
print(sum)