package DailyQuestionJanuary;

public class January12 {
    class Solution {
        public boolean canBeValid(String s, String locked) {
            if (s.length() % 2 != 0) {
                return false;
            }
    
            int open = 0;
            int unlockable = 0;
    
            for (int i = 0; i < s.length(); i++) {
                if (locked.charAt(i) == '1') {
                    open += s.charAt(i) == '(' ? 1 : -1;
                }else {
                    unlockable++;
                }
    
                if (open + unlockable < 0) {
                    return false;
                }
            }
    
            int close = 0;
            unlockable = 0;
    
            for (int i = s.length() - 1; i >= 0; i--) {
                if (locked.charAt(i) == '1') {
                    close += s.charAt(i) == ')' ? 1 : -1;
                }else {
                    unlockable++;
                }
    
                if (close + unlockable < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
