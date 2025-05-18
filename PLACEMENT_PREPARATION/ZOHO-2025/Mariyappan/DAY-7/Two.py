#2. Find Nth lucky number (only digits 3 or 4 allowed):

python
Copy
Edit
n = 12
count = 0
i = 1
while True:
    if all(c in '34' for c in str(i)):
        count += 1
        if count == n:
            print(i)
            break
    i += 1
# Mariyappan