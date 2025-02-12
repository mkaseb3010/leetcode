package DailyQuestionJanuary;

import java.util.HashSet;
import java.util.Set;

public class January14 {
    class Solution {
        public int[] findThePrefixCommonArray(int[] A, int[] B) {
            int n = A.length;
            int[] result = new int[n];
            Set<Integer> seenA = new HashSet<>();
            Set<Integer> seenB = new HashSet<>();
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (seenB.contains(A[i])) {
                    count++;
                }

                if (seenA.contains(B[i])) {
                    count++;
                }

                if (A[i] == B[i]) {
                    count++;
                }

                seenA.add(A[i]);
                seenB.add(B[i]);
                result[i] = count;
            }
            return result;
        }
    }
}
