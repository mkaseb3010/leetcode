package Top150;

import java.util.HashMap;

public class Top46 {
    public class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                Integer old = map.put(nums[i], i);
                if (old != null && i - old <= k) {
                    return true;
                }
            }
            return false;
        }
    }
}
