package Top150;

public class Top38 {
    public class Solution {
        public void gameOfLife(int[][] board) {
            int m = board.length;
            int n = board[0].length;
            int[] directions = {-1, 0, 1};
    
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int neighbors = 0;
    
                    for (int x : directions) {
                        for (int y : directions) {
                            if (x == 0 && y == 0) {
                                continue;
                            }
    
                            int newRow = i + x;
                            int newCol = j + y;
    
                            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && (board[newRow][newCol] == 1
                                || board[newRow][newCol] == 2)) {
                                    neighbors++;
                            }
                        }
                    }
    
                    if (board[i][j] == 1 && (neighbors < 2 || neighbors > 3)) {
                        board[i][j] = 2;
                    }else if (board[i][j] == 0 && neighbors == 3) {
                        board[i][j] = 3;
                    }
                }
            }
            
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 2) {
                        board[i][j] = 0;
                    }else if (board[i][j] == 3) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}
