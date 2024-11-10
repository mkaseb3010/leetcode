package DailyQuestionsNovember;
import java.util.*;

public class October23 {
    public static class TreeNode {
        int val;
        public TreeNode left;
        public TreeNode right;
        TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public static class Solution {
        public TreeNode replaceValueInTree(TreeNode root) {
            if (root == null) {
                return null;
            } 
    
            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            root.val = 0; 
    
            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                List<TreeNode> currentLevelNodes = new ArrayList<>();
                int levelSum = 0;
    
                for (int i = 0; i < levelSize; i++) {
                    TreeNode node = queue.poll();
                    currentLevelNodes.add(node);
    
                    if (node.left != null) {
                        queue.offer(node.left);
                        levelSum += node.left.val;
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                        levelSum += node.right.val;
                    }
                }
    
                for (TreeNode node : currentLevelNodes) {
                    int siblingSum = 0;
                    if (node.left != null) {
                        siblingSum += node.left.val;
                    }
                    if (node.right != null) {
                        siblingSum += node.right.val;
                    }
                    if (node.left != null) {
                        node.left.val = levelSum - siblingSum;
                    }
                    if (node.right != null) {
                        node.right.val = levelSum - siblingSum;
                    }
                }
            }
    
            return root;
        }
    }
}
