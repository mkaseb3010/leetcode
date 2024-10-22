package DailyQuestions;
import java.util.*;

public class October11 {
	public class Solution {
	    public int smallestChair(int[][] times, int targetFriend) {
	        int n = times.length;

	        PriorityQueue<Integer> unoccupied = new PriorityQueue<>();
	        for (int i = 0; i < n; i++) {
	            unoccupied.add(i);
	        }

	        PriorityQueue<int[]> occupied = new PriorityQueue<>(new Comparator<int[]>() {
	            @Override
	            public int compare(int[] a, int[] b) {
	                return Integer.compare(a[0], b[0]);
	            }
	        });
	        
	        int[][] friends = new int[n][3];
	        for (int i = 0; i < n; i++) {
	            friends[i][0] = times[i][0];
	            friends[i][1] = times[i][1];
	            friends[i][2] = i;
	        }

	        Arrays.sort(friends, (a, b) -> a[0] - b[0]);
	        for (int[] friend : friends) {
	            int arrival = friend[0];
	            int leaving = friend[1];
	            int index = friend[2];
	            while (!occupied.isEmpty() && occupied.peek()[0] <= arrival) {
	                unoccupied.add(occupied.poll()[1]);
	            }

	            int assigned = unoccupied.poll();

	            if (index == targetFriend) {
	                return assigned;
	            }
	            occupied.add(new int[]{leaving, assigned});
	        }
	        return -1;
	    }
	}
}
