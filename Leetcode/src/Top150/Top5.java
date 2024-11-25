package Top150;

public class Top5 {
    public class Solution {
        public int majorityElement(int[] nums) {
            int count = 0;
            Integer k = null;
    
            for (int num : nums) {
                if (count == 0) {
                    k = num;
                }
                if (num == k) {
                    count++;
                }else {
                    count--;
                }
            }
            return k;
        }
    }
}
