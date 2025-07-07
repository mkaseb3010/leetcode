package DailyQuestionsApril;

public class April30 {
    class Solution {
        private int countDigits(int num) {
            if (num == 0) return 1;
            
            int count = 0;
            while (num > 0) {
                count++;
                num /= 10;
            }
            return count;
        }

        public int findNumbers(int[] nums) {
            int count = 0;
            
            for (int num : nums) {
                int digitCount = countDigits(num);
                
                if (digitCount % 2 == 0) {
                    count++;
                }
            }
            return count;
        }
    }
}
