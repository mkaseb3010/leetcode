package Top150;

public class Top80 {
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
        private int getDepth(TreeNode node, boolean isLeft) {
            int depth = 0;

            while (node != null) {
                depth++;
                node = isLeft ? node.left : node.right;
            }
            return depth;
        }

        public int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int left = getDepth(root, true);
            int right = getDepth(root, false);

            if (left == right) {
                return (1 << left) - 1;
            }else {
                return 1 + countNodes(root.left) + countNodes(root.right);
            }
        }
    }
}
