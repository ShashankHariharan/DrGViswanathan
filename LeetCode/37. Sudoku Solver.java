class Solution {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {

        // Find an empty cell
        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {

                    // Try digits 1 to 9
                    for (char digit = '1'; digit <= '9'; digit++) {

                        if (isValid(board, row, col, digit)) {

                            // Choose
                            board[row][col] = digit;

                            // Explore
                            if (solve(board)) {
                                return true;
                            }

                            // Undo / Backtrack
                            board[row][col] = '.';
                        }
                    }

                    // No digit works here
                    return false;
                }
            }
        }

        // No empty cells remain
        return true;
    }

    private boolean isValid(char[][] board, int row, int col, char digit) {

        // Check row
        for (int j = 0; j < 9; j++) {

            if (board[row][j] == digit) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {

            if (board[i][col] == digit) {
                return false;
            }
        }

        // Find top-left corner of 3x3 box
        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;

        // Check 3x3 box
        for (int i = boxRow; i < boxRow + 3; i++) {

            for (int j = boxCol; j < boxCol + 3; j++) {

                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }
}