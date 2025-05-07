class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        n=len(matrix)
        for i in range(0,n-1):
            for j in range(i+1,n):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
        for i in range(n):
            p1,p2=0,n-1
            while p1<p2:
                matrix[i][p1],matrix[i][p2]=matrix[i][p2],matrix[i][p1]
                p1+=1
                p2-=1
        return matrix
