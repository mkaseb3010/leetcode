package Top150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Top85 {
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
    public class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean leftToRight = true;

            while(!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> currLevel = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();

                    if (leftToRight) {
                        currLevel.add(curr.val);
                    }else {
                        currLevel.add(0, curr.val);
                    }

                    if (curr.left != null) {
                        queue.add(curr.left);
                    }

                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }
                result.add(currLevel);
                leftToRight = !leftToRight;
            }
            return result;
        }
    }
}
