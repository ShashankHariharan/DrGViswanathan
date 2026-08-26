class Solution {
    private List<List<String>> result = new ArrayList<>();
    private int[] queens;
    private boolean[] cols;
    private boolean[] diag1;
    private boolean[] diag2;

    public List<List<String>> solveNQueens(int n) {
        queens = new int[n];
        cols = new boolean[n];
        diag1 = new boolean[2 * n - 1];
        diag2 = new boolean[2 * n - 1];

        backtrack(0, n);

        return result;
    }

    private void backtrack(int row, int n) {
        if (row == n) {
            result.add(buildBoard(n));
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n - 1;
            int d2 = row + col;

            if (cols[col] || diag1[d1] || diag2[d2]) {
                continue;
            }

            queens[row] = col;
            cols[col] = true;
            diag1[d1] = true;
            diag2[d2] = true;

            backtrack(row + 1, n);

            cols[col] = false;
            diag1[d1] = false;
            diag2[d2] = false;
        }
    }

    private List<String> buildBoard(int n) {
        List<String> board = new ArrayList<>();

        for (int row = 0; row < n; row++) {
            char[] current = new char[n];
            Arrays.fill(current, '.');
            current[queens[row]] = 'Q';
            board.add(new String(current));
        }

        return board;
    }
}