package DailyQuestionsApril;

import java.util.*;

public class April15 {
    class Solution {
        class FenwickTree {
            long[] tree;
            int size;

            public FenwickTree(int n) {
                tree = new long[n + 1];
                size = n;
            }

            public void update(int i, long delta) {
                i++;

                while (i <= size) {
                    tree[i] += delta;
                    i += i & -i;
                }
            }

            public long query(int i) {
                i++;
                long sum = 0;

                while (i > 0) {
                    sum += tree[i];
                    i -= i & -i;
                }
                return sum;
            }
        }

        public long goodTriplets(int[] nums1, int[] nums2) {
            int n = nums1.length;
            int[] pos = new int[n];

            for (int i = 0; i < n; i++) {
                pos[nums2[i]] = i;
            }

            FenwickTree left = new FenwickTree(n);
            FenwickTree right = new FenwickTree(n);

            for (int i = 0; i < n; i++) {
                right.update(pos[nums1[i]], 1);
            }

            long result = 0;

            for (int i = 0; i < n; i++) {
                int idx = pos[nums1[i]];
                right.update(idx, -1);
                long leftCount = left.query(idx - 1);
                long rightCount = right.query(n - 1) - right.query(idx);
                result += leftCount * rightCount;
                left.update(idx, 1);
            }
            return result;
        }
    }
}
