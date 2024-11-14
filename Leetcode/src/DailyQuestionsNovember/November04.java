package DailyQuestionsNovember;

public class November04 {
    public class Solution {
        public String compressedString(String word) {
            StringBuilder compressed = new StringBuilder();
            int i = 0;
    
            while (i < word.length()) {
                char curr = word.charAt(i);
                int count = 0;
    
                while (i < word.length() && word.charAt(i) == curr && count < 9) {
                    count++;
                    i++;
                }
                compressed.append(count).append(curr);
            }
            return compressed.toString();
        }
    }
}
