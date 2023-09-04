import java.util.HashSet;
import java.util.Set;

public class Q27 {

    // Approach 1: Using string as key
    // TC = SC = O(9*9)
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            Set<String> vals = new HashSet<>();
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    if (board[r][c] != '.') {
                        if (!vals.add(board[r][c] + " in row " + r) ||
                                !vals.add(board[r][c] + " in col " + c) ||
                                !vals.add(board[r][c] + " in square " + r / 3 + "-" + c / 3)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    // Approach 2: Better than first approach
    // TC = O((9 * 9) + (9 + 9 + (3 * 3)) => Constant
    // SC = O(1)
    class Solution2 {
        // TC = O((9 * 9) + (9 + 9 + (3 * 3))
        public boolean isValidSudoku(char[][] board) {
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    if (board[r][c] != '.' && !isValidPlaced(board, board[r][c], r, c))
                        return false;
                }
            }
            return true;
        }

        // TC = O(9 + 9 + (3 * 3)
        private boolean isValidPlaced(char[][] board, char digit, int row, int col) {
            return !digitInRow(board, digit, row, col) &&
                    !digitInCol(board, digit, row, col) &&
                    !digitInSquare(board, digit, row, col);
        }

        // TC = O(9)
        private boolean digitInRow(char[][] board, char digit, int row, int col) {
            for (int i = 0; i < 9; i++) {
                if (col != i && board[row][i] == digit)
                    return true;
            }
            return false;
        }

        // TC = O(9)
        private boolean digitInCol(char[][] board, char digit, int row, int col) {
            for (int i = 0; i < 9; i++) {
                if (row != i && board[i][col] == digit)
                    return true;
            }
            return false;
        }

        // TC = O(3 * 3)

        private boolean digitInSquare(char[][] board, char digit, int row, int col) {
            int squareRow = row - row % 3;
            int squareCol = col - col % 3;
            for (int i = squareRow; i < squareRow + 3; i++) {
                for (int j = squareCol; j < squareCol + 3; j++) {
                    if (row != i && col != j && board[i][j] == digit)
                        return true;
                }
            }
            return false;
        }
    }
}
