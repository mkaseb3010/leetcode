package DailyQuestionsNovember;
import java.util.*;

public class October22 {
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
	    public long kthLargestLevelSum(TreeNode root, int k) {
	        if (root == null) {
	            return -1;
	        }

	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.offer(root);
	        List<Long> level = new ArrayList<>();

	        while(!queue.isEmpty()) {
	            int size = queue.size();
	            long curr = 0;

	            for (int i = 0; i < size; i++) {
	                TreeNode node = queue.poll();
	                curr += node.val;

	                if (node.left != null) {
	                    queue.offer(node.left);
	                }

	                if(node.right != null) {
	                    queue.offer(node.right);
	                }
	            }

	            level.add(curr);
	        }
	        Collections.sort(level, Collections.reverseOrder());

	        if (k <= level.size()) {
	            return level.get(k - 1);
	        }else {
	            return -1;
	        }
	    }
	}
}
