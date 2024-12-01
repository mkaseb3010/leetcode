package Top150;

public class Top60 {
    class Solution {
        public Node copyRandomList(Node head) {
            if (head == null) {
                return null;
            }
    
            Node curr = head;
            while (curr != null) {
                Node newNode = new Node(curr.val);
                newNode.next = curr.next;
                curr.next = newNode;
                curr = newNode.next;
            }
    
            curr = head;
            while (curr != null) {
                if (curr.random != null) {
                    curr.next.random = curr.random.next;
                }
                curr = curr.next.next;
            }
    
            Node original = head;
            Node copy = head.next;
            Node copyHead = copy;
    
            while (original != null) {
                original.next = original.next.next;
                if (copy.next != null) {
                    copy.next = copy.next.next;
                }
                original = original.next;
                copy = copy.next;
            }
            return copyHead;
        }
    }
}
