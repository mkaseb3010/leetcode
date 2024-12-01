package Top150;

public class Top74 {
    /*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

    public class Solution {
        public Node connect(Node root) {
            if (root == null) {
                return null;
            }

            Node curr = root;
            Node dummy = new Node(0);
            Node prev = dummy;

            while (curr != null) {
                while (curr != null) {
                    if (curr.left != null) {
                        prev.next = curr.left;
                        prev = prev.next;
                    }

                    if (curr.right != null) {
                        prev.next = curr.right;
                        prev = prev.next;
                    }
                    curr = curr.next;
                }
                curr = dummy.next;
                dummy.next = null;
                prev = dummy;
            }
            return root;
        }
    }
}
