package Top150;

import java.util.HashMap;

public class Top72 {
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
        private HashMap<Integer, Integer> inOrderIndexMap;
        private int preOrderIndex;

        private TreeNode buildSubTree(int[] preorder, int left, int right) {
            if (left > right) {
                return null;
            }
            int rootVal = preorder[preOrderIndex++];
            TreeNode root = new TreeNode(rootVal);
            int inOrder = inOrderIndexMap.get(rootVal);
            root.left = buildSubTree(preorder, left, inOrder - 1);
            root.right = buildSubTree(preorder, inOrder + 1, right);
            return root;
        }

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            inOrderIndexMap = new HashMap<>();

            for (int i = 0; i < inorder.length; i++) {
                inOrderIndexMap.put(inorder[i], i);
            }
            preOrderIndex = 0;
            return buildSubTree(preorder, 0, inorder.length - 1);
        }
    }
}
