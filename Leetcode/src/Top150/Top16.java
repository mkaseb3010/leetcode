package Top150;

public class Top16 {
    public class Solution {
        public int trap(int[] height) {
            if (height == null || height.length < 3) {
                return 0;
            }
    
            int left = 0;
            int right = height.length - 1;
            int lMax = 0;
            int rMax = 0;
            int trapped = 0;
    
            while (left < right) {
                if (height[left] < height[right]) {
                     if (height[left] >= lMax) {
                        lMax = height[left];
                    }else {
                        trapped += lMax - height[left];
                    }
                    left++;
                }else {
                    if (height[right] >= rMax) {
                        rMax = height[right];
                    }else {
                        trapped += rMax - height[right];
                    }
                    right--;
                }
            }
            return trapped;
        }
    }
}
