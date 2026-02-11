import java.util.*;

class MinimumEffort {
    class Cell {
        int x, y, effort;
        public Cell(int x, int y, int effort) {
            this.x = x;
            this.y = y;
            this.effort = effort;
        }
    }

    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        int[][] dist = new int[m][n];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);
        dist[0][0] = 0;

        PriorityQueue<Cell> pq = new PriorityQueue<>((a, b) -> a.effort - b.effort);
        pq.offer(new Cell(0, 0, 0));
      
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};

        while (!pq.isEmpty()) {
            Cell curr = pq.poll();
            int x = curr.x;
            int y = curr.y;
            int effort = curr.effort;

            if (x == m - 1 && y == n - 1) return effort;

            for (int[] dir : dirs) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    int nextEffort = Math.max(effort, Math.abs(heights[x][y] - heights[nx][ny]));
                    if (nextEffort < dist[nx][ny]) {
                        dist[nx][ny] = nextEffort;
                        pq.offer(new Cell(nx, ny, nextEffort));
                    }
                }
            }
        }

        return 0;
    }
}
