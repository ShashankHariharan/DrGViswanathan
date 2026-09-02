class Solution {
    private int count = 0;

    public int totalNQueens(int n) {
        count = 0;
        backtrack(0, n, 0, 0, 0);
        return count;
    }

    private void backtrack(int row, int n, int cols, int diag1, int diag2) {
        if (row == n) {
            count++;
            return;
        }

        int available = ((1 << n) - 1) & ~(cols | diag1 | diag2);

        while (available != 0) {
            int bit = available & -available;
            available -= bit;

            backtrack(
                row + 1,
                n,
                cols | bit,
                (diag1 | bit) << 1,
                (diag2 | bit) >> 1
            );
        }
    }
}