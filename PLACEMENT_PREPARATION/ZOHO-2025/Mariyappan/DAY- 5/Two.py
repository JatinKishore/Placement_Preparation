# Solve a 9x9 Sudoku puzzle by filling empty cells.
def solve_sudoku(board):
    def is_valid(r, c, ch):
        for i in range(9):
            if board[r][i] == ch or board[i][c] == ch or board[3*(r//3)+i//3][3*(c//3)+i%3] == ch:
                return False
        return True
    def solve():
        for i in range(9):
            for j in range(9):
                if board[i][j] == '.':
                    for ch in '123456789':
                        if is_valid(i, j, ch):
                            board[i][j] = ch
                            if solve(): return True
                            board[i][j] = '.'
                    return False
        return True
    solve()
# Mariyappan
