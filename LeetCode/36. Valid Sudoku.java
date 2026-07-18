class Solution {

    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int i = 0; i < 9; i++) {

            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {

                char c = board[i][j];

                if (c == '.')
                    continue;

                if (set.contains(c))
                    return false;

                set.add(c);
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {

            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < 9; i++) {

                char c = board[i][j];

                if (c == '.')
                    continue;

                if (set.contains(c))
                    return false;

                set.add(c);
            }
        }

        // Check 3×3 boxes
        for (int row = 0; row < 9; row += 3) {

            for (int col = 0; col < 9; col += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int i = 0; i < 3; i++) {

                    for (int j = 0; j < 3; j++) {

                        char c = board[row + i][col + j];

                        if (c == '.')
                            continue;

                        if (set.contains(c))
                            return false;

                        set.add(c);
                    }
                }
            }
        }

        return true;
    }
}