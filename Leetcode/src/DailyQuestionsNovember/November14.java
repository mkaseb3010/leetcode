package DailyQuestionsNovember;

public class November14 {
    public class Solution {
        private boolean canDistribute(int[] quantities, int n, int maxProduct) {
            int count = 0;
    
            for (int quantity : quantities) {
                count += (quantity + maxProduct - 1) / maxProduct;
            }
            return count <= n;
        }
    
        public int minimizedMaximum(int n, int[] quantities) {
            int left = 1;
            int right = 0;
    
            for (int quantity : quantities) {
                right = Math.max(right, quantity);
            }
    
            while (left < right) {
                int middle = left + (right - left) / 2;
                if (canDistribute(quantities, n, middle)) {
                    right = middle;
                }else {
                    left = middle + 1;
                }
            }
            return left;
        }
    }
}
