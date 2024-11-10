package DailyQuestionsOctober;
import java.util.*;

public class October28 {
    public class Solution {
        public int longestSquareStreak(int[] nums) {  
            int max = -1;
            Set<Integer> set = new HashSet<>();
    
            for (int num : nums) {
                set.add(num);
            }
    
            List<Integer> setArr = new ArrayList<>(set);
            Collections.sort(setArr);
            
            for (int i = 0; i < setArr.size(); i++) {
                int curr = setArr.get(i);
                int count = 0;
                
                while (set.contains(curr)) {
                    set.remove(curr);
                    curr *= curr;
                    count++;
                }
                
                max = Math.max(max, count);
            }
            
            if (max > 1) {
                return max;
            }else {
                return -1;
            }
        }
    }
}
