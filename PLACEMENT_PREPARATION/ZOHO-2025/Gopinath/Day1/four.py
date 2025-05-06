class Solution:
    def celebrity(self, mat):
        n=len(mat)
        if n==1 and mat[0][0]==1:
            return 0
        knowme=[0]*n
        iknow=[0]*n
        for i in range(n):
            for j in range(n):
                if i==j:
                    continue
                if mat[i][j]==1:
                    iknow[i]+=1
                    knowme[j]+=1
        idx=0
        for (i,j) in zip(iknow,knowme):
            if i==0 and j==n-1:
                return idx
            idx+=1
        return -1