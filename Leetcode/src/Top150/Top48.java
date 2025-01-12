package Top150;

import java.util.List;
import java.util.ArrayList;

public class Top48 {
    public class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> range = new ArrayList<>();
            if (nums == null || nums.length == 0) {
                return range;
            }
    
            int start = nums[0];
            for (int i = 1; i <= nums.length; i++) {
                if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                    if (start == nums[i - 1]) {
                        range.add(String.valueOf(start));
                    }else {
                        range.add(start + "->" + nums[i - 1]);
                    }
                    if (i < nums.length) {
                        start = nums[i];
                    }
                }
            }
            return range;
        }
    }
}
