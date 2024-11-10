package DailyQuestionsNovember;
import java.util.*;

public class October26 {
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
        private void depthFirstSearch(TreeNode node, int depth, int rest) {
        if (node == null) {
            return;
        }

        depth++;
        response[node.val] = rest;
        depthFirstSearch(node.left, depth, Math.max(rest, depth + depthMap.get(node.right)));
        depthFirstSearch(node.right, depth, Math.max(rest, depth + depthMap.get(node.left)));
        }

        private int calculateDepth(TreeNode node) {
            if (node == null) {
                return 0;
            }

            int leftDepth = calculateDepth(node.left);
            int rightDepth = calculateDepth(node.right);
            int maxDepth = 1 + Math.max(leftDepth, rightDepth);
            depthMap.put(node, maxDepth);
            return maxDepth;
        }

        private Map<TreeNode, Integer> depthMap = new HashMap<>();
        private int[] response;

        public int[] treeQueries(TreeNode root, int[] queries) {
            calculateDepth(root);
            response = new int[depthMap.size() + 1];
            depthMap.put(null, 0);
            depthFirstSearch(root, -1, 0);
        
            int queryCount = queries.length;
            int[] answer = new int[queryCount];

            for (int i = 0; i < queryCount; ++i) {
                answer[i] = response[queries[i]];
            }
            
            return answer;
        }
    }
}
