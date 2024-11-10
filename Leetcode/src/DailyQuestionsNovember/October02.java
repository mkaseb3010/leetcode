package DailyQuestionsNovember;
import java.util.*;

public class October02 {
	public class Solution {
	    public int[] arrayRankTransform(int[] arr) {
	        int n = arr.length;
	        int[] sortedArr = arr.clone();
	        Arrays.sort(sortedArr);

	        HashMap<Integer, Integer> rank = new HashMap<>();
	        int ranked = 1;

	        for (int num : sortedArr) {
	            if(!rank.containsKey(num)) {
	                rank.put(num, ranked);
	                ranked++;
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            arr[i] = rank.get(arr[i]);
	        }
	        return arr;
	    }
	}
}
