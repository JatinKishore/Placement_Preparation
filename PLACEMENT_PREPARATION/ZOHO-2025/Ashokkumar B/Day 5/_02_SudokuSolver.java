import java.security.spec.RSAOtherPrimeInfo;

/*
LeetCode - 37. Sudoku Solver

Write a program to solve a Sudoku puzzle by filling the empty cells.

A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.
 */
public class _02_SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                            {'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}
                        };
        solve(board);

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean solve(char[][] board) {
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (board[i][j] == '.') {
                    for (char ch = '1'; ch<='9'; ch++) {
                        if (isPossible(board, i, j, ch)) {
                            board[i][j] = ch;
                            if (solve(board) == true) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isPossible(char[][] board, int row, int column, char value) {
        for (int i=0; i<9; i++) {
            if (board[row][i] == value) return false;
            if (board[i][column] == value) return false;
            if(board[ 3*(row / 3) + i / 3 ][ 3 * (column / 3) + i % 3 ] == value) return false;
        }
        return true;
    }
}
