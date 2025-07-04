public class April25 {
    class Solution {
        public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
            long count = 0;
            long equals = 0;
            Map<Integer, Long> arrayMap = new HashMap<>();
            arrayMap.put(0, 1L);

            for (int i : nums) {
                if (i % modulo == k) {
                    equals++;
                }

                int rem = (int)(equals % modulo);
                int needed = (rem - k + modulo) % modulo;
                count += arrayMap.getOrDefault(needed, 0L);
                arrayMap.put(rem, arrayMap.getOrDefault(rem, 0L) + 1);
            }
            return count;
        }
    }
}
