package DailyQuestionsApril;

public class April11 {
    class Solution {
        public int countSymmetricIntegers(int low, int high) {
            int count = 0;

            for (int i = low; i <= high; i++) {
                String str = String.valueOf(i);
                int n = str.length();

                if (n % 2 != 0) {
                    continue;
                }

                int half = n / 2;
                int sum1 = 0;
                int sum2 = 0;

                for (int j = 0; j < half; j++) {
                    sum1 += str.charAt(j) - '0';
                    sum2 += str.charAt(j + half) - '0';
                }

                if (sum1 == sum2) {
                    count++;
                }
            }
            return count;
        }
    }
}
