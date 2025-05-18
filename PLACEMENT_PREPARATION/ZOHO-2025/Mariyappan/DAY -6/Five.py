# Return the minimum time to rot all oranges or -1 if impossible.
from collections import deque
def oranges_rotting(grid):
    m, n = len(grid), len(grid[0])
    q = deque()
    fresh = 0
    for i in range(m):
        for j in range(n):
            if grid[i][j] == 2:
                q.append((i,j,0))
            elif grid[i][j] == 1:
                fresh += 1
    time = 0
    while q:
        i, j, d = q.popleft()
        for x, y in [(0,1),(1,0),(-1,0),(0,-1)]:
            ni, nj = i+x, j+y
            if 0 <= ni < m and 0 <= nj < n and grid[ni][nj] == 1:
                grid[ni][nj] = 2
                fresh -= 1
                q.append((ni,nj,d+1))
                time = d+1
    return time if fresh == 0 else -1
# Mariyappan
