public class March14 {
    class Solution {
        public int maximumCandies(int[] candies, long k) {
            int left = 1;
            int right = 0;
    
            for (int ch : candies) {
                right = Math.max(right, ch);
            }
    
            int result = 0;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
                long total = 0;
    
                for (int ch : candies) {
                    total += ch / mid;
                }
    
                if (total >= k) {
                    result = mid;
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
            return result;
        }
    }
}
