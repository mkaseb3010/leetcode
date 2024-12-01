package Top150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top43 {
    public class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            if (strs == null || strs.length == 0) {
                return new ArrayList<>();
            }

            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] ch = str.toCharArray();
                Arrays.sort(ch);
                String sorted = new String(ch);

                if (!map.containsKey(sorted)) {
                    map.put(sorted, new ArrayList<>());
                }
                map.get(sorted).add(str);
            }
            return new ArrayList<>(map.values());
        }
    }
}
