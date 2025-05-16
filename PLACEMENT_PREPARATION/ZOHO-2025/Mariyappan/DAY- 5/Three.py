# Find path from top-left to bottom-right with minimum effort (max abs diff between adjacent cells).
import heapq
def minimum_effort_path(heights):
    m, n = len(heights), len(heights[0])
    heap = [(0, 0, 0)]
    dist = [[float('inf')]*n for _ in range(m)]
    dist[0][0] = 0
    while heap:
        d, x, y = heapq.heappop(heap)
        if x == m - 1 and y == n - 1:
            return d
        for dx, dy in [(0,1),(1,0),(-1,0),(0,-1)]:
            nx, ny = x + dx, y + dy
            if 0 <= nx < m and 0 <= ny < n:
                nd = max(d, abs(heights[nx][ny] - heights[x][y]))
                if nd < dist[nx][ny]:
                    dist[nx][ny] = nd
                    heapq.heappush(heap, (nd, nx, ny))
# Mariyappan
