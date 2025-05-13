class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;

        int left = 0;
        int right = 1000000; // Maximum possible height difference

        int minEffort = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canReachBottomRight(heights, mid)) {
                minEffort = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return minEffort;
    }

    private boolean canReachBottomRight(int[][] heights, int maxDiff) {
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] visited = new boolean[rows][cols];
        return dfs(heights, 0, 0, maxDiff, visited);
    }

    private boolean dfs(int[][] heights, int row, int col, int maxDiff, boolean[][] visited) {
        int rows = heights.length;
        int cols = heights[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;

        if (row == rows - 1 && col == cols - 1) {
            return true;
        }

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int newRow = row + dr[i];
            int newCol = col + dc[i];

            if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                if (Math.abs(heights[row][col] - heights[newRow][newCol]) <= maxDiff) {
                    if (dfs(heights, newRow, newCol, maxDiff, visited)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
