# Find the celebrity in a party using a matrix of people.
def find_celebrity(mat):
    n = len(mat)
    a, b = 0, 1
    while b < n:
        if mat[a][b]:
            a = b
        b += 1
    for i in range(n):
        if i != a and (mat[a][i] or not mat[i][a]):
            return -1
    return a
# Mariyappan
