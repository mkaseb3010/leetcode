package DailyQuestionsFebruary;

public class February11 {
    class Solution {
        public String removeOccurrences(String s, String part) {
            while (s.contains(part)) {
                s = s.replaceFirst(part, "");
            }
            return s;
        }
    }
}
