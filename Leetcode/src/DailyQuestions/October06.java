package DailyQuestions;

public class October06 {
	public class Solution {
	    public boolean areSentencesSimilar(String sentence1, String sentence2) {
	        String[] s1 = sentence1.split(" ");
	        String[] s2 = sentence2.split(" ");

	        int min = Math.min(s1.length, s2.length);
	        int left = 0;
	        int right = 0;

	        while (left < min && s1[left].equals(s2[left])) {
	            left++;
	        }

	        while (right < min && s1[s1.length - 1 - right].equals(s2[s2.length - 1 - right])) {
	            right++;
	        }

	        if (left + right >= min) {
	            return true;
	        }else {
	            return false;
	        }
	    }
	}
}
