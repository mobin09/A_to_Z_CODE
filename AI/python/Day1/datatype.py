# # integer
# age = 25
# experience = 5
# print(age)
# print(type(experience))

# float
salary=75000.50
accuracy=0.95
print(salary)
print(type(accuracy))

#String

name="Mobin Arshad"
role="Software Engineer"
print(name)
print(type(role))


message =  "Hello " + name
print(message)

#Boolean

True 
False

is_learning_ai = True
is_expert = False
print(is_learning_ai)
print(type(is_expert))

#List

# skills = ["Java", "Kafka", "AWS", "AI", "Python"]
# print(skills)
# print(skills[0])

# skills.append("Kubernetes")
# print(skills)


coordinates = (76.57, 45.39)
print(coordinates)
print(coordinates[0])

# coordinates[0]= 30


skills ={"Python", "Java", "AWS", "Postgres", "AI", "Python"}
print(skills)

user = {
    "name" : "Mobin Arshad",
    "age": 27,
    "role": "Software Engineer"
}

print(user)
print(user["name"])
print(user["role"])

# you can aslo modified it 
user["experience"] = 5
print(user)

age = "25"
# Here age is a string, not an integer.
# You can convert it to an integer:

age = int("25")
print(age)
print(type(age))