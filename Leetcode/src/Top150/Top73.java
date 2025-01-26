package Top150;

import java.util.HashMap;

public class Top73 {
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
        private int postOrderIndex;
        
        private TreeNode buildSubTree(int[] inorder, int[] postorder, int left, int right) {
            if (left > right) {
                return null;
            }
            int rootVal = postorder[postOrderIndex--];
            TreeNode root = new TreeNode(rootVal);
            int inOrderIndex = inOrderIndexMap.get(rootVal);
            root.right = buildSubTree(inorder, postorder, inOrderIndex + 1, right);
            root.left = buildSubTree(inorder, postorder, left, inOrderIndex - 1);
            return root;
        }

        public TreeNode buildTree(int[] inorder, int[] postorder) {
            inOrderIndexMap = new HashMap<>();

            for (int i = 0; i < inorder.length; i++) {
                inOrderIndexMap.put(inorder[i], i);
            }

            postOrderIndex = postorder.length - 1;
            return buildSubTree(inorder, postorder, 0, inorder.length - 1);
        }
    }
}
