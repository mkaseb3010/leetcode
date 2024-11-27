package Top150;

public class Top25 {
    public class Solution {
        public boolean isPalindrome(String s) {
            String converted = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            int left = 0;
            int right = converted.length() - 1;
    
            while (left < right) {
                if (converted.charAt(left) != converted.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
