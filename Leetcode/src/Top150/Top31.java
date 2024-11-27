package Top150;

import java.util.HashMap;

public class Top31 {
    public class Solution {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            int longest = 0;
            
            for (int j = 0, i = 0; j < s.length(); j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)) + 1, i);
                }
                map.put(s.charAt(j), j);
                longest = Math.max(longest, j - i + 1);
            }
            return longest;
        }
    }
}
