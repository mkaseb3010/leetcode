package Top150;

public class Top19 {
    public class Solution {
        public int lengthOfLastWord(String s) {
            s = s.trim();
            int last = s.lastIndexOf(' ');
            int result = s.length() - last - 1;
            return result;
        }
    }
}
