class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int islandCount = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Start DFS if a land cell is found
                if (grid[i][j] == '1') {
                    islandCount++;
                    dfs(grid, i, j);
                }
            }
        }

        return islandCount;
    }

    private void dfs(char[][] grid, int i, int j) {
        int m = grid.length;
        int n = grid[0].length;

        // Boundary or water check
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1') {
            return;
        }

        // Mark current cell as visited by sinking the land
        grid[i][j] = '0';

        // Visit all 4 adjacent directions
        dfs(grid, i - 1, j); // up
        dfs(grid, i + 1, j); // down
        dfs(grid, i, j - 1); // left
        dfs(grid, i, j + 1); // right
    }
}

