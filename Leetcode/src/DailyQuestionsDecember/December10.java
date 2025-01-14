package DailyQuestionsDecember;

public class December10 {
    public class Solution {
        private boolean hasSubstringOf(String s, int n, int x) {
            int[] count = new int[26];
            int p = 0;
    
            for (int i = 0; i < n; i++) {
                while (s.charAt(p) != s.charAt(i)) p++;
                if (i - p + 1 >= x) {
                    count [s.charAt(i) - 'a']++;
                }
    
                if (count[s.charAt(i) - 'a'] > 2) {
                    return true;
                }
            }
            return false;
        }
    
        public int maximumLength(String s) {
            int n = s.length();
            int l = 1; 
            int r = n;
    
            if (!hasSubstringOf(s, n, l)) return -1;
    
            while (l + 1 < r) {
                int mid = (l + r) / 2;
                if (hasSubstringOf(s, n, mid)) {
                    l = mid;
                }else {
                    r = mid;
                }
            }
            return l;
        }
    }
}
