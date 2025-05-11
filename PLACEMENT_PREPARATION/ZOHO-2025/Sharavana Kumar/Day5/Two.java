class Solution {
    int count = 0;
    int[] drow = new int[]{-1,1,0,0};
    int[] dcol = new int[]{0,0,-1,1};
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(visited[i][j]==true||grid[i][j]=='0'){
                    continue;
                }
                if(!visited[i][j]){
                    dfs(i,j,visited,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int row,int col,boolean[][] visited,char[][] grid){
        if(!isvalid(row,col,grid)){
            return ;
        }
        visited[row][col] = true;
        for(int i = 0 ; i < 4 ; i++){
            int delrow = drow[i]+row;
            int delcol = dcol[i]+col;
            if(isvalid(delrow,delcol,grid) && grid[delrow][delcol]=='1' && !visited[delrow][delcol]){
                dfs(delrow,delcol,visited,grid);
            }
        }
        return;
    }
    public boolean isvalid(int i,int j,char[][] grid){
        if(i>=0 && j>=0 && i<grid.length && j<grid[0].length){
            return true;
        }
        return false;
    }
}
