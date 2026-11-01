skills = {"python", "java", "AWS", "python"}
print(skills) #{'python', 'java', 'AWS'}
#Python appeared twice, but the set kept it only once.

numbers = {10, 20, 30, 40}
print(numbers)

# A set can also contain different data types:
data = {"Mobin", 28, 75000.50, True}
print(data)

#Sets Do Not Allow Duplicates
numbers = {1, 2, 2, 3, 3, 3}
print(numbers)

#This makes sets very useful when you need unique values.
skills = ["Python", "Java", "Python", "AWS", "Java"]
unique_skills = set(skills)
print(unique_skills) #{'AWS', 'Java', 'Python'}

print("Set is unordered\n")

skills = {"Python", "Java", "AWS"}
#print(skills[0]) #This produces an error because sets don't support normal indexing.

skills = {"Python", "Java", "AWS"}
skills.add("Docker")
print(skills) 

print("Remove the element\n")

skills = {"Python", "Java", "AWS"}
skills.remove("Python")
print(skills) #{'AWS', 'Java'}

skills.discard("JavaScript")

print("Remove everything\n")
# Remove every thing
skills = {"Java", "Python", "AWS"}
skills.clear()
print(skills) # set()

print("In Operator\n")
skills = {"Python", "Java", "AWS"}
print("Java" in skills) # True
print("JavaScript" in skills) # False

print("Set Union Operator\n")

set1 = {"Java", "Python", "AWS"}
set2 = {"Docker", "AWS", "Kafka"}

result = set1 | set2
print(result) # {'AWS', 'Python', 'Kafka', 'Java', 'Docker'}


set1 = {"Python", "Java", "AWS"}
set2 = {"Docker", "AWS", "Kafka"}

result = set1 & set2
print(result) #{'AWS'}

result = set1.intersection(set2)
print(result) #{'AWS'}

print("Differences of set\n")

set1 = {"Python", "Java", "AWS"}
set2 = {"Docker", "AWS", "Kafka"}

result = set1 - set2
print(result) # {'Python', 'Java'}

result = set2-set1
print(result) # {'Docker', 'Kafka'}



set1 = {"Python", "Java", "AWS"}
set2 = {"Docker", "AWS", "Kafka"}

result = set1 ^ set2
print(result) #{'Kafka', 'Docker', 'Python', 'Java'}

set1 = {"Java", "Python", "AWS", "Docker", "Kafka"}

for skill in set1:
    print(skill)


set1 = {"Java", "Python"}
print(len(set1)) #2

numbers = [1, 2, 2, 3, 4, 4, 5]
new_nums = set(numbers)
print(new_nums) #{1, 2, 3, 4, 5}

set1 = {1,2,3,4}
list1 = list(set1)
print(type(list1)) #<class 'list'>

a = {}
b = set()
print(type(a)) # <class 'dict'>
print(type(b)) # <class 'set'>
