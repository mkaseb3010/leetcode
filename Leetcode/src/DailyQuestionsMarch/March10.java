package DailyQuestionsMarch;

public class March10 {
    class Solution {
        public long countOfSubstrings(String word, int k) {
            int[][] freq = new int[2][128];
    
            for (char c : "aeiou".toCharArray()) {
                freq[0][c] = 1;
            }
    
            long result = 0;
            int currentK = 0, vowels = 0, extraLeft = 0;
    
            for (int right = 0, left = 0; right < word.length(); right++) {
                char rightChar = word.charAt(right);
    
                if (freq[0][rightChar] == 1) {
                    if (++freq[1][rightChar] == 1) vowels++;
                } else {
                    currentK++;
                }
    
                while (currentK > k) {
                    char leftChar = word.charAt(left);
                    if (freq[0][leftChar] == 1) {
                        if (--freq[1][leftChar] == 0) vowels--;
                    } else {
                        currentK--;
                    }
                    left++;
                    extraLeft = 0;
                }
    
                while (vowels == 5 && currentK == k &&
                       left < right && freq[0][word.charAt(left)] == 1 && freq[1][word.charAt(left)] > 1) {
                    extraLeft++;
                    freq[1][word.charAt(left)]--;
                    left++;
                }
    
                if (currentK == k && vowels == 5) {
                    result += (1 + extraLeft);
                }
            }
    
            return result;
        }
    }    
}
