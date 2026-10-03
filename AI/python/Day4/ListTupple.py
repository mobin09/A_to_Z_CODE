skills = ["Python", "Java", "AWS", "Docker", "Kubernetes", "Redis"]
data = ["Mobin",28, 75000.00, True]
print(skills)
print(data)
print(skills[-1]) # Redis


skills = ["Python", "Java", "AWS", "Docker", "K8s", "Redis", "Kafka"]
print(skills[1:5]) # [Java, AWS, Docker, K8s]
print(skills[:3])  #  [Python, Java, AWS]
print(skills[2:])  # [AWS, Docker, K8s, Redis, Kafka]
print(skills[::2]) # [Python, AWS, K8s, Kafka]

skills = ["Python", "Java", "AWS"]
skills[0] = "AI"
print(skills) # [AI, Java, AWS]

skills.append("Docker")
print(skills) # ['AI', 'Java', 'AWS', 'Docker']

skills.insert(2, "Kafka")
print(skills) # ['AI', 'Java', 'Kafka', 'AWS', 'Docker']

skills.remove("AWS")
print(skills) # ['AI', 'Java', 'Kafka', 'Docker']

skills.pop(1)
print(skills) # ['AI', 'Kafka', 'Docker']

skills.pop()
print(skills) # ['AI', 'Kafka']


print("List important operations")

numbers = [40,20,30,10]

print(len(numbers)) # 4

print(20 in numbers) # True
print(50 in numbers) # False

numbers.sort()
print(numbers) # [10, 20, 30, 40]

numbers.reverse()
print(numbers) # [40, 30, 20, 10]

print("Loops through the List\n")
skills = ["Java", "Python", "AWS", "Docker", "AI"]
for skill in skills:
    print(skill)

print("Nested Loops\n")
numbers = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

print(numbers[0]) #[1,2,3]
print(numbers[1][2]) #6

print("Tuple Introduction\n")

coordinates = (28.61, 77.20)
print(coordinates) #(28.61, 77.2)
print(coordinates[0]) #28.61
print(coordinates[-1]) #77.2



person = ("Mobin", 28, 75000.50, True)
print(person) #('Mobin', 28, 75000.5, True)

person = ("Mobin", 28, 75000.50, True)
name,age,salary,isWorking = person
print(name) # Mobin
print(age) # 28
print(salary) # 75000.50
print(isWorking) # True

print("Tuple Method\n")
numbers = (10, 20, 10, 30, 10)
print(numbers.count(10)) # 3

print(numbers.index(10)) # 0
print(numbers.index(30)) # 3


print("Dictionary\n")

person = {
    "name": "Mobin Arshad",
    "age":28,
    "role": "Software Engineer"
}
print(person) #{'name': 'Mobin Arshad', 'age': 28, 'role': 'Software Engineer'}

# 2. Accessing Values
print(person["name"]) # Mobin Arshad
print(person["role"]) # Software Engineer

# 3. Adding a New Item
person["experience"] = 5
print(person) # {'name': 'Mobin Arshad', 'age': 28, 'role': 'Software Engineer', 'experience': 5}

# 4. Updating a Value
person["age"] = 29
print(person) # {'name': 'Mobin Arshad', 'age': 29, 'role': 'Software Engineer', 'experience': 5}

# 5. Removing Items
person.pop("experience")
print(person) #{'name': 'Mobin Arshad', 'age': 29, 'role': 'Software Engineer'}

#del
del person["age"]
print(person) # {'name': 'Mobin Arshad', 'role': 'Software Engineer'}

#Removes everything:
person.clear()
print(person) #{}


