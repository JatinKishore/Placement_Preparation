/*
LeetCode - 994. Rotting Oranges
You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.

Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
Output: 4
 */
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class _05_RottingOranges {
    static class Pair {
        int row;
        int col;
        int time;
        public Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;

        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] grid = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                grid[i][j] = in.nextInt();
            }
        }
        int minimumMinutes = getMinimumMinutes(grid, n, m);
        System.out.println(minimumMinutes);
    }

    private static int getMinimumMinutes(int[][] grid, int n, int m) {
        int noOfFreshOrange = 0;
        int[][] visited = new int[n][m];
        Queue<Pair> queue = new LinkedList<>();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (grid[i][j] == 2) {
                    visited[i][j] = 2;
                    queue.offer(new Pair(i, j, 0));
                }

                if (grid[i][j] == 1) {
                    noOfFreshOrange++;
                }
            }
        }
        int count = 0;
        int minimumNoOfMinutes = 0;
        int[][] directions = {{-1, 0}, {0, +1}, {+1, 0}, {0, -1}};
        while (!queue.isEmpty()) {
            int row = queue.peek().row;
            int col = queue.peek().col;
            int time = queue.peek().time;
            queue.poll();
            minimumNoOfMinutes = Math.max(minimumNoOfMinutes, time);
            for (int i=0; i<4; i++) {
                int r = row + directions[i][0];
                int c = col + directions[i][1];

                if (r >= 0 && r<n && c >= 0 && c < m && visited[r][c] != 2 && grid[r][c] == 1) {
                    queue.offer(new Pair(r, c, time + 1));
                    visited[r][c] = 2;
                    count++;
                }
            }
        }

        if(count != noOfFreshOrange) return -1;
        return minimumNoOfMinutes;

    }
}
