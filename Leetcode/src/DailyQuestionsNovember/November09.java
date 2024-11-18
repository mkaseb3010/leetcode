package DailyQuestionsNovember;

public class November09 {
    public class Solution {
        public long minEnd(int n, int x) {
            return x | Long.expand(n - 1, ~(long)x);
        }
    }
}
