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


print("\n")

person = {
    "name": "Mobin Arshad",
    "age":28
}

print(person.get("name")) # Mobin Arshad
print(person.get("age"))  # 28

print(person.get("phoneNo")) #None

print(person.get("salary", 0)) # 0

print("Key Exist or Not\n")

person = {
    "name": "Mobin Arshad",
    "age": 28
}

print("name" in person) # True
print("salary" in person) # False

print("Get All Keys\n")

person={
    "name": "Mobin Arshad",
    "age":28,
    "role": "Developer"
}

print(person.keys()) #dict_keys(['name', 'age', 'role'])

for key in person.keys():
    print(key)

print("Get All values\n")

person= {
    "name": 'Mobin Arshad',
    "age":28,
    "role":"Developer"
}

for value in person.values():
    print(value)


print("Some other operations on the dictionary\n")

employee = {
    "name": "Mobin",
    "age": 28,
    "salary": 104000.0,
    "is_active": True,
    "skills": ["Java", "Python", "AWS"]
}
print(employee)
print(len(employee))

for key, value in person.items():
    print(key,value)


request = {
    "model": "gpt-model",
    "temperature": 0.7,
    "messages": [
        {
            "role": "user",
            "content": "Explain Python dictionaries"
        }
    ]
}

print(request["model"])
print(request["messages"][0]["content"])

print("Loop through List of Dict\n")

employees = [
    {"name": "Mobin", "age": 28},
    {"name": "Rahul", "age": 30},
    {"name": "Amit", "age": 26}
]

for employee in employees:
    print(employee["name"])

