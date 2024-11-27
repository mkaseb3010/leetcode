package Top150;

public class Top26 {
    public class Solution {
        public boolean isSubsequence(String s, String t) {
            int sSequence = 0;
            int tSequence = 0;
    
            while (sSequence < s.length() && tSequence < t.length()) {
                if (s.charAt(sSequence) == t.charAt(tSequence)) {
                    sSequence++;
                }
                tSequence++;
            }
            return sSequence == s.length();
        }
    }
}
