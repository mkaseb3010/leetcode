package DailyQuestionsOctober;
import java.util.*;

public class October24 {

    public class TreeNode {
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

    public class Solution {
        public boolean flipEquiv(TreeNode root1, TreeNode root2) {
            if (root1 == null && root2 == null) {
                return true;
            }

            if (root1 == null || root2 == null || root1.val != root2.val) {
                return false;
            }

            boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
            boolean noFlip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);

            if (flip || noFlip) {
                return true;
            }else {
                return false;
            }
        }
    }
}
