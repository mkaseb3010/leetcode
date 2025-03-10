package Top150;

import java.util.HashMap;
import java.util.Map;

public class Top91 {
        /*
    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
    */

    class Solution {
        private Node clone(Node node, Map<Node, Node> visited) {
            if (visited.containsKey(node)) {
                return visited.get(node);
            }

            Node copy = new Node(node.val);
            visited.put(node, copy);

            for (Node neighbor : node.neighbors) {
                copy.neighbors.add(clone(neighbor, visited));
            }
            return copy;
        }

        public Node cloneGraph(Node node) {
            if (node == null) {
                return null;
            }

            Map<Node, Node> visited = new HashMap<>();
            return clone(node, visited);
        }
    }
}
