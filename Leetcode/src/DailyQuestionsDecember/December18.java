package DailyQuestionsDecember;

import java.util.Stack;

public class December18 {
    class Solution {
        public int[] finalPrices(int[] prices) {
            int n = prices.length;
            int[] result = new int[n];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                while(!stack.isEmpty() && prices[i] <= prices[stack.peek()]) {
                    int index = stack.pop();
                    result[index] = prices[index] - prices[i];
                }
                stack.push(i);
            }

            while (!stack.isEmpty()) {
                int index = stack.pop();
                result[index] = prices[index];
            }
            return result;
        }
    }
}