package DailyQuestionsNovember;
import java.util.*;

public class October31 {
    public class Solution {
        private long calculateMinDistance(int rIndex, int fIndex, List<Integer> robot, List<Integer> fPos, long[][] memo) {
            if (rIndex == robot.size()) {
                return 0;
            }
    
            if (fIndex == fPos.size()) {
                long val = Long.MAX_VALUE / 2;
                return val;
            }
    
            if (memo[rIndex][fIndex] != -1) {
                long val = memo[rIndex][fIndex];
                return val;
            }
    
            long assignCurr = Math.abs(robot.get(rIndex) - fPos.get(fIndex)) + calculateMinDistance(rIndex + 1, fIndex + 1,
                                        robot, fPos, memo);
        
            long skipCurr = calculateMinDistance(rIndex, fIndex + 1, robot, fPos, memo);
    
            memo[rIndex][fIndex] = Math.min(assignCurr, skipCurr);
            return memo[rIndex][fIndex];
        }
    
        public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
            Collections.sort(robot);
            List<Integer> fPos = new ArrayList<>();
            for (int[] factories : factory) {
                for (int i = 0; i < factories[1]; i++) {
                    fPos.add(factories[0]);
                }
            }
    
            Collections.sort(fPos);
            long[][] memo = new long[robot.size()][fPos.size()];
    
            for (long[] row : memo) {
                Arrays.fill(row, -1);
            }
            return calculateMinDistance(0, 0, robot, fPos, memo);
        }
    }
}
