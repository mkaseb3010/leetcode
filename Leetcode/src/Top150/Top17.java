package Top150;

import java.util.HashMap;

public class Top17 {
    public class Solution {
        public int romanToInt(String s) {
            HashMap<Character, Integer> romanMap = new HashMap<>();
            romanMap.put('I', 1);
            romanMap.put('V', 5);
            romanMap.put('X', 10);
            romanMap.put('L', 50);
            romanMap.put('C', 100);
            romanMap.put('D', 500);
            romanMap.put('M', 1000);

            int total = 0;
            for (int i = 0; i < s.length(); i++) {
                int curr = romanMap.get(s.charAt(i));

                if (i + 1 < s.length() && curr < romanMap.get(s.charAt(i + 1))) {
                    total -= curr;
                }else {
                    total += curr;
                }
            }
            return total;
        }
    }
}
