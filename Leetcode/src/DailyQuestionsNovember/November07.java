package DailyQuestionsNovember;

public class November07 {
    public class Solution {
        public int largestCombination(int[] candidates) {
            int[] count = new int[32];
    
            for (int number : candidates) {
                for (int i = 0; i < 32; i++) {
                    if ((number & (1 << i)) != 0) {
                        count[i]++;
                    }
                }
            }
    
            int max = 0;
    
            for (int counts : count) {
                max = Math.max(max, counts);
            }
            return max;
        }
    }
}
