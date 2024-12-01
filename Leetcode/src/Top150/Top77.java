package Top150;

public class Top77 {
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
        private int dfs (TreeNode node, int currentSum) {
            if (node == null) {
                return 0;
            }

            currentSum = currentSum * 10 + node.val;

            if (node.left == null && node.right == null) {
                return currentSum;
            }

            return dfs(node.left, currentSum) + dfs(node.right, currentSum);
        }

        public int sumNumbers(TreeNode root) {
            return dfs(root, 0);
        }
    }
}
