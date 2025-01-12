package Top150;

public class Top78 {
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
        private int max = Integer.MIN_VALUE;

        private int dfs(TreeNode node) {
            if (node == null) {
                return 0;
            }

            int left = Math.max(0, dfs(node.left));
            int right = Math.max(0, dfs(node.right));
            int curr = node.val + left + right;
            max = Math.max(max, curr);

            return node.val + Math.max(left, right);
        }

        public int maxPathSum(TreeNode root) {
            dfs(root);
            return max;
        }
    }
}
