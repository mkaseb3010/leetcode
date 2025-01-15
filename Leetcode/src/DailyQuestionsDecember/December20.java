package DailyQuestionsDecember;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class December20 {
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
        public TreeNode reverseOddLevels(TreeNode root) {
            if (root == null) {
                return null;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            int level = 0;

            while(!queue.isEmpty()) {
                int size = queue.size();
                List<TreeNode> curr = new ArrayList<>();

                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    curr.add(node);

                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }

                if (level % 2 == 1) {
                    int left = 0;
                    int right = curr.size() - 1;

                    while (left < right) {
                        int temp = curr.get(left).val;
                        curr.get(left).val = curr.get(right).val;
                        curr.get(right).val = temp;
                        left++;
                        right--;
                    }
                }
                level++;
            }
            return root;
        }
    }
}
