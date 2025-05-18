# 5. Max product of k adjacent elements in matrix (horizontal, vertical, diagonal):

python
Copy
Edit
matrix = [
    [1, 2, 0, -1, 4],
    [3, -1, 2, 4, 6],
    [0, -2, -3, 1, 4],
    [1, 3, 2, 0, -7],
    [2, -1, 3, 2, 9]
]
k = 4
r, c = len(matrix), len(matrix[0])
max_p = float('-inf')

for i in range(r):
    for j in range(c):
        if j + k <= c:
            p = 1
            for x in range(k): p *= matrix[i][j + x]
            max_p = max(max_p, p)
        if i + k <= r:
            p = 1
            for x in range(k): p *= matrix[i + x][j]
            max_p = max(max_p, p)
        if i + k <= r and j + k <= c:
            p = 1
            for x in range(k): p *= matrix[i + x][j + x]
            max_p = max(max_p, p)
        if i + k <= r and j - k + 1 >= 0:
            p = 1
            for x in range(k): p *= matrix[i + x][j - x]
            max_p = max(max_p, p)

print(max_p)
# Mariyappan