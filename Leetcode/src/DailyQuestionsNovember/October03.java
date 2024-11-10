package DailyQuestionsNovember;

import java.util.*;

public class October03 {
	public class Solution {
	    public int minSubarray(int[] nums, int p) {
	        int total = 0;

	        for (int num : nums) {
	            total = (total + num) % p;
	        }

	        if (total == 0) {
	            return 0;
	        }

	        int target = total;
	        HashMap<Integer, Integer> pre = new HashMap<>();
	        pre.put(0, -1);
	        int preSum = 0;
	        int min = nums.length;

	        for (int i = 0; i < nums.length; i++) {
	            preSum = (preSum + nums[i]) % p;
	            int find = (preSum - target + p) % p;
	            if (pre.containsKey(find)) {
	                min = Math.min(min, i - pre.get(find));
	            }
	            pre.put(preSum, i);
	        }

	        if (min == nums.length) {
	            return -1;
	        }else {
	            return min;
	        }
	    }
	}
}
