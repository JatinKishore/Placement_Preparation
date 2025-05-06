class Solution:
    def celebrity(self, mat):
        # code here
        n=len(mat)
        celeb=0
        for i in range(1,n):
            if mat[celeb][i]==1:
                celeb=i
        for i in range(0,n):
            if i==celeb:
                continue
            if mat[celeb][i]==1 or mat[i][celeb]==0:
                return -1
        return celeb
