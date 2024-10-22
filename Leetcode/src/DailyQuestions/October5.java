package DailyQuestions;

public class October5 {
	public class Solution {
	    private boolean matches(int[] s1Frequency, int[] window) {
	        for (int i = 0; i < 26; i++) {
	            if(s1Frequency[i] != window[i]) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public boolean checkInclusion(String s1, String s2) {
	        int n = s1.length();
	        int m = s2.length();

	        if (n > m) {
	            return false;
	        }

	        int[] s1Frequency = new int[26];
	        int[] window = new int[26];

	        for (int i = 0; i < n; i++) {
	            s1Frequency[s1.charAt(i) - 'a']++;
	            window[s2.charAt(i) - 'a']++;
	        }

	        for (int i = n; i < m; i++) {
	            if (matches(s1Frequency, window)) {
	                return true;
	            }

	            window[s2.charAt(i) - 'a']++;
	            window[s2.charAt(i - n) - 'a']--;
	        }
	        return matches(s1Frequency, window);
	    }
	}
}
