package DailyQuestionsFebruary;

public class February15 {
    class Solution {
        private boolean canPartition(String str, int index, int target) {
            if (index == str.length()) {
                return target == 0;
            }
    
            int sum = 0;
    
            for (int i = index; i < str.length(); i++) {
                sum = sum * 10 + (str.charAt(i) - '0');
    
                if (sum > target) {
                    break;
                }
    
                if (canPartition(str, i + 1, target - sum)) {
                    return true;
                }
            }
            return false;
        }
    
        public int punishmentNumber(int n) {
            int result = 0;
    
            for (int i = 1; i <= n; i++) {
                int square = i * i;
                String str = String.valueOf(square);
    
                if (canPartition(str, 0, i)) {
                    result += square;
                }
            }
            return result;
        }
    }
}
