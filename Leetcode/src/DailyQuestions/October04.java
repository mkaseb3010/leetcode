package DailyQuestions;
import java.util.*;

public class October04 {
	public class Solution {
	    public long dividePlayers(int[] skill) {
	        Arrays.sort(skill);
	        int n = skill.length;
	        long chemistry = 0;
	        int team = skill[0] + skill[n - 1];

	        for (int i = 0; i < n / 2; i++) {
	            if (skill[i] + skill[n - 1 - i] != team) {
	                return -1;
	            }
	            chemistry += (long) skill[i] * skill[n - 1 - i];
	        }
	        return chemistry;
	    }
	}
}
