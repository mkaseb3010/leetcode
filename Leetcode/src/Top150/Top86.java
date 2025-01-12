package Top150;

public class Top86 {
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
        private int min = Integer.MAX_VALUE;
        private Integer prev = null;

        private void inOrderTraversal(TreeNode node) {
            if (node == null) {
                return;
            }

            inOrderTraversal(node.left);

            if (prev != null) {
                min = Math.min(min, node.val - prev);
            }
            
            prev = node.val;
            inOrderTraversal(node.right);
        }

        public int getMinimumDifference(TreeNode root) {
            inOrderTraversal(root);
            return min;
        }
    }
}
