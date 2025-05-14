class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check each row
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i)) {
                return false;
            }
        }
        
        // Check each column
        for (int j = 0; j < 9; j++) {
            if (!isValidColumn(board, j)) {
                return false;
            }
        }
        
        // Check each 3x3 sub-box
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubBox(board, i, j)) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private boolean isValidRow(char[][] board, int row) {
        Set<Character> seen = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            char current = board[row][j];
            if (current != '.') {
                if (seen.contains(current)) {
                    return false;
                }
                seen.add(current);
            }
        }
        return true;
    }
    
    private boolean isValidColumn(char[][] board, int col) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            char current = board[i][col];
            if (current != '.') {
                if (seen.contains(current)) {
                    return false;
                }
                seen.add(current);
            }
        }
        return true;
    }
    
    private boolean isValidSubBox(char[][] board, int startRow, int startCol) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char current = board[startRow + i][startCol + j];
                if (current != '.') {
                    if (seen.contains(current)) {
                        return false;
                    }
                    seen.add(current);
                }
            }
        }
        return true;
    }
}