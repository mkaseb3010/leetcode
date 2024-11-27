package Top150;

import java.util.HashSet;
import java.util.Set;

public class Top34 {
    public class Solution {
        public boolean isValidSudoku(char[][] board) {
            Set<String> seen = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    char curr = board[i][j];

                    if (curr != '.') {
                        if (!seen.add(curr + " in row " + i) || !seen.add(curr + " in column " + j) || 
                            !seen.add(curr + "in box " + i / 3 + "-" + j / 3)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }
}
