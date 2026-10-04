class Solution {

    public boolean isSafe(List<String> board, int row, int col, int n) {

        // Check row
        for (int j = 0; j < n; j++) {
            if (board.get(row).charAt(j) == 'Q') {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < n; i++) {
            if (board.get(i).charAt(col) == 'Q') {
                return false;
            }
        }

        // Upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        // Upper-right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void nQueens(List<String> board, int row, int n,
                        List<List<String>> ans) {

        // All queens placed
        if (row == n) {
            ans.add(new ArrayList<>(board));
            return;
        }

        // Try every column
        for (int j = 0; j < n; j++) {

            if (isSafe(board, row, j, n)) {

                // Place queen
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(j, 'Q');
                board.set(row, sb.toString());

                // Move to next row
                nQueens(board, row + 1, n, ans);

                // Remove queen / backtrack
                sb.setCharAt(j, '.');
                board.set(row, sb.toString());
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<String> board = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();

        // Create empty board
        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n));
        }

        nQueens(board, 0, n, ans);

        return ans;
    }
}