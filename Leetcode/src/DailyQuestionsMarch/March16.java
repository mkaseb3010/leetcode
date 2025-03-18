public class March16 {
    class Solution {
        private boolean canRepairAllCars(int[] ranks, int cars, long maxTime) {
            long total = 0;
    
            for (int rank : ranks) {
                total += (long) Math.sqrt(maxTime / rank);
    
                if (total >= cars) {
                    return true;
                }
            }
            return false;
        }
    
        public long repairCars(int[] ranks, int cars) {
            long low = 1;
            long high = (long) ranks[0] * (long) cars * cars;
    
            while (low < high) {
                long mid = low + (high - low) / 2;
    
                if (canRepairAllCars(ranks, cars, mid)) {
                    high = mid;
                }else {
                    low = mid + 1;
                }
            }
            return low;
        }
    }
}
