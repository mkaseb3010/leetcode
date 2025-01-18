package DailyQuestionsDecember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class December23 {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
    class Solution {
        private int countMinimumSwaps(List<Integer> values) {
            int n = values.size();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = values.get(i);
            }

            int[][] indexedArr = new int[n][2];
            for (int i = 0; i < n; i++) {
                indexedArr[i][0] = arr[i];
                indexedArr[i][1] = i;
            }

            Arrays.sort(indexedArr, Comparator.comparingInt(a -> a[0]));
            boolean[] visited = new boolean[n];
            int swaps = 0;

            for (int i = 0; i < n; i++) {
                if (visited[i] || indexedArr[i][1] == i) continue;

                int cycleSize = 0;
                int j = i;
                while (!visited[j]) {
                    visited[j] = true;
                    j = indexedArr[j][1];
                    cycleSize++;
                }

                if (cycleSize > 1) {
                    swaps += (cycleSize - 1);
                }
            }
            return swaps;
        }
        
        public int minimumOperations(TreeNode root) {
            if (root == null) {
                return 0;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int minOperations = 0;

            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> levelValues = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    levelValues.add(node.val);

                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                minOperations += countMinimumSwaps(levelValues);
            }

            return minOperations;
        }
    }
}
