package Top150;

import java.util.ArrayList;
import java.util.List;

public class Top82 {
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
        private void dfs(TreeNode node, int depth, List<Integer> result) {
            if (node == null) {
                return;
            }

            if (depth == result.size()) {
                result.add(node.val);
            }

            dfs(node.right, depth + 1, result);
            dfs(node.left, depth + 1, result);
        }

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            dfs(root, 0, result);
            return result;
        }
    }
}
