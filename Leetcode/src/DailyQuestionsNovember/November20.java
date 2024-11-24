package DailyQuestionsNovember;

public class November20 {
    public class Solution {
        public int takeCharacters(String s, int k) {
            int n = s.length();
            int[] count = new int[3];
    
            for (char ch : s.toCharArray()) {
                count[ch - 'a']++;
            }
    
            if (count[0] < k || count[1] < k || count[2] < k) {
                return -1;
            }
    
            int left = n;
            int[] curr = new int[3];
    
            for (int i = 0, j = 0; i < n; i++) {
                curr[s.charAt(i) - 'a']++;
                while (curr[0] > count[0] - k || curr[1] > count[1] - k || curr[2] > count[2] - k) {
                    curr[s.charAt(j++) - 'a']--;
                }
                left = Math.min(left, n - (i - j + 1));
            }
            return left;
        }
    }
}
