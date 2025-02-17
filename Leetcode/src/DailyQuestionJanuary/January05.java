package DailyQuestionJanuary;

public class January05 {
    class Solution {
        public String shiftingLetters(String s, int[][] shifts) {
            int n = s.length();
            int[] diff = new int[n + 1];
    
            for (int[] shift : shifts) {
                int start = shift[0];
                int end = shift[1];
                int direction = shift[2];
    
                if (direction == 1) {
                    diff[start] += 1;
                    diff[end + 1] -= 1;
                }else {
                    diff[start] -= 1;
                    diff[end + 1] += 1;
                }
            }
    
            int[] netShifts = new int[n];
            int shift = 0;
    
            for (int i = 0; i < n; i++) {
                shift += diff[i];
                netShifts[i] = shift;
            }
    
            StringBuilder result = new StringBuilder();
    
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                int newChar = (ch - 'a' + netShifts[i]) % 26;
                if (newChar < 0) {
                    newChar += 26;
                }
                result.append((char) ('a' + newChar));
            }
            return result.toString();
        }
    }
}
