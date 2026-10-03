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
print(skills[0]) #This produces an error because sets don't support normal indexing.

skills = {"Python", "Java", "AWS"}
skills.add("Docker")
print(skills) 
