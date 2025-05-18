# Rotate an NxN matrix by 90 degrees clockwise.
def rotate_matrix(mat):
    n = len(mat)
    for i in range(n):
        for j in range(i, n):
            mat[i][j], mat[j][i] = mat[j][i], mat[i][j]
    for row in mat:
        row.reverse()
    return mat
# Mariyappan
