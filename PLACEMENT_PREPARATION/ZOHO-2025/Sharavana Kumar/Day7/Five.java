class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        int freshCount = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair<>(i, j));
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        
        if (freshCount == 0) return 0;

        int time = -1;
        int[] drow = {-1, 1, 0, 0};
        int[] dcol = {0, 0, -1, 1};
        
        while (!q.isEmpty()) {
            int size = q.size();
           
            
            for (int i = 0; i < size; i++) {
                Pair<Integer, Integer> p = q.poll();
                int curRow = p.getKey();
                int curCol = p.getValue();
                
                for (int j = 0; j < 4; j++) {
                    int newRow = curRow + drow[j];
                    int newCol = curCol + dcol[j];
                    
                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m &&
                        grid[newRow][newCol] == 1) {
                        
                        grid[newRow][newCol] = 2;
                        freshCount--;
                        q.offer(new Pair<>(newRow, newCol));
                    }
                }
            }
             time++;
        }
        
        return (freshCount == 0) ? time : -1;
    }
}
