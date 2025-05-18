# Count number of islands (connected regions of '1's) in a 2D grid.
def num_islands(grid):
    if not grid: return 0
    m, n = len(grid), len(grid[0])
    def dfs(i, j):
        if i<0 or j<0 or i>=m or j>=n or grid[i][j] != '1': return
        grid[i][j] = '0'
        for x, y in [(0,1),(1,0),(-1,0),(0,-1)]:
            dfs(i+x, j+y)
    count = 0
    for i in range(m):
        for j in range(n):
            if grid[i][j] == '1':
                dfs(i, j)
                count += 1
    return count
# Mariyappan
