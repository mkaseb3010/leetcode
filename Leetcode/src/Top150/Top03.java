package Top150;

public class Top03 {
    public class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
    
            int r = 0;
    
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[r]) {
                    r++;
                    nums[r] = nums[i];
                }
            }
            int index = r + 1;
            return index;
        }
    }
}
