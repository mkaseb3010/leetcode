package Top150;

public class Top07 {
    public class Solution {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) {
                return 0;
            }
    
            int min = Integer.MAX_VALUE;
            int max = 0;
    
            for (int price : prices) {
                if (price < min) {
                    min = price;
                }
    
                int profit = price - min;
                
                if (profit > max) {
                    max = profit;
                }
            }
            return max;
        }
    }
}
