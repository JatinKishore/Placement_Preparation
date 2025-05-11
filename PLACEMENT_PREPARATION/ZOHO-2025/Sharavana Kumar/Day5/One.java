class Solution {
    public void solveSudoku(char[][] board) {
        helper(board);
    }
    public boolean helper(char[][] board){
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0; j < board[0].length ; j++){
                if(board[i][j]=='.'){
                    for(char ch = '1' ; ch<='9' ; ch++){
                        
                        if(isvalid(board,i,j,ch)){
                            board[i][j] = ch;
                            if (helper(board)) return true;
                            board[i][j] = '.';

                        }
                        
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isvalid(char[][] board,int row,int col,char ch){
        for(int i = 0 ; i < 9 ; i++){
            if(board[row][i]==ch){
                return false;
            }
            if(board[i][col]==ch){
                return false;
            }
        }
        int startrow = (row/3)*3;
        int startcol = (col/3)*3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startrow + i][startcol + j] == ch) {
                    return false;
                }
            }
        }
        return true;
    }
}
