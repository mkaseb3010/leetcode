package Top150;

import java.util.HashSet;
import java.util.Set;

public class Top47 {
    public class Solution {
        public int longestConsecutive(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }

            int max = 0;

            for (int num : set) {
                if (!set.contains(num - 1)) {
                    int curr = num;
                    int currStreak = 1;

                    while (set.contains(curr + 1)) {
                        curr += 1;
                        currStreak += 1;
                    }
                    max = Math.max(max, currStreak);
                }
            }
            return max;
        }
    }
}
