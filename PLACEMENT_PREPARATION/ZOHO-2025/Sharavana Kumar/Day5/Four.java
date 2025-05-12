class Solution {
    int[] drow = new int[]{-1,1,0,0};
    int[] dcol = new int[]{0,0,-1,1};
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        int[][] distance = new int[n][m];
        for(int i[] : distance){
            Arrays.fill(i,Integer.MAX_VALUE);
        }
        distance[0][0] = 0;
         PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int[] node = pq.poll();
            int row = node[1];
            int col = node[2];
            int wt = node[0];
            for(int i = 0 ; i < 4 ; i++){
                int delrow = row + drow[i];
                int delcol = col + dcol[i];
                if(delrow>=0 && delcol>=0 && delrow<n && delcol<m){
                    int new_wt = Math.max(wt ,Math.abs(heights[delrow][delcol]-heights[row][col]));
                    if(new_wt<distance[delrow][delcol]){
                        
                        pq.add(new int[]{new_wt,delrow,delcol});
                        distance[delrow][delcol] = new_wt;
                    }
                }
            }
        }
        return distance[n-1][m-1];
    }
}
