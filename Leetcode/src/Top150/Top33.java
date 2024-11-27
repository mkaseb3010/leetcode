package Top150;

import java.util.HashMap;
import java.util.Map;

public class Top33 {
    public class Solution {
        public String minWindow(String s, String t) {
            if (s == null || s.length() == 0 || t == null || t.length() == 0) {
                return "";
            }
    
            Map<Character, Integer> tFrequency = new HashMap<>();
            
            for (char ch : t.toCharArray()) {
                tFrequency.put(ch, tFrequency.getOrDefault(ch, 0) + 1);
            }
    
            int left = 0;
            int right = 0;
            int required = tFrequency.size();
            int formed = 0;
            Map<Character, Integer> window = new HashMap<>();
            int[] result = {-1, 0, 0};
    
            while (right < s.length()) {
                char ch = s.charAt(right);
                window.put(ch, window.getOrDefault(ch, 0) + 1);
    
                if (tFrequency.containsKey(ch) && window.get(ch).intValue() == tFrequency.get(ch).intValue()) {
                    formed++;
                }
    
                while (left <= right && formed == required) {
                    ch = s.charAt(left);
    
                    if(result[0] == -1 || right - left + 1 < result[0]) {
                        result[0] = right - left + 1;
                        result[1] = left;
                        result[2] = right;
                    }
    
                    window.put(ch, window.get(ch) - 1);
                    if (tFrequency.containsKey(ch) && window.get(ch).intValue() < tFrequency.get(ch).intValue()) {
                        formed--;
                    }
                    left++;
                }
                right++;
            }
            if (result[0] == -1) {
                return "";
            }else {
                return s.substring(result[1], result[2] + 1);
            }
        }
    }
}
