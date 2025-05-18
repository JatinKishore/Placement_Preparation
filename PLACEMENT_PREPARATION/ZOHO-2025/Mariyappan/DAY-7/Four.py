# 4.Check if binary of n is palindrome:

python
Copy
Edit
n = 5
b = bin(n)[2:]
print("palindrome" if b == b[::-1] else "not palindrome")
# Mariyappan