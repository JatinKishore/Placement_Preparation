class Solution {
    public int minimumEffortPath(int[][] arr) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int[][] distance = new int[arr.length][arr[0].length];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                distance[i][j] = Integer.MAX_VALUE;
            }
        }
        
        int n = arr.length;
        int m = arr[0].length;
        distance[0][0] = 0;
        pq.offer(new int[]{0, 0, 0}); // {effort, row, col}
        
        int[] drow = {-1, 0, 1, 0};
        int[] dcol = {0, 1, 0, -1};
        
        while (!pq.isEmpty()) {
            int[] eff = pq.poll();
            int wt = eff[0];
            int row = eff[1];
            int col = eff[2];
            
          
            
            for (int i = 0; i < 4; i++) {
                int delrow = drow[i] + row;
                int delcol = dcol[i] + col;
                
                if (delcol >= 0 && delrow >= 0 && delcol < m && delrow < n) {
                    int newDist = Math.max(wt, Math.abs(arr[row][col] - arr[delrow][delcol]));
                    
                    if (newDist < distance[delrow][delcol]) {
                        distance[delrow][delcol] = newDist;
                        pq.offer(new int[]{newDist, delrow, delcol});
                    }
                }
            }
        }
        
        return distance[n - 1][m - 1];
    }
}
