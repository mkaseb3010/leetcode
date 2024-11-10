package DailyQuestionsOctober;
import java.util.*;


public class October25 {
    public class Solution {
        public List<String> removeSubfolders(String[] folder) {
            Arrays.sort(folder);
            List<String> result = new ArrayList<>();
            String prev = folder[0];
            result.add(prev);

            for (int i = 1; i < folder.length; i++) {
                String curr = folder[i];
                if (!curr.startsWith(prev + "/")) {
                    result.add(curr);
                    prev = curr;
                }
            }
            return result;
        }
    }
}
