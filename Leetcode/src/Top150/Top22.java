package Top150;

public class Top22 {
    public class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) {
                return s;
            }
    
            StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
            
            for (int i = 0; i < rows.length; i++) {
                rows[i] = new StringBuilder();
            }
    
            int curr = 0;
            boolean down = false;
    
            for (char ch : s.toCharArray()) {
                rows[curr].append(ch);
                if (curr == 0 || curr == numRows - 1) {
                    down = !down;
                }
                
                if (down) {
                    curr++;
                }else {
                    curr--;
                }
            }
    
            StringBuilder result = new StringBuilder();
            for (StringBuilder row : rows) {
                result.append(row);
            }
            String str = result.toString();
            return str;
        }
    }
}
