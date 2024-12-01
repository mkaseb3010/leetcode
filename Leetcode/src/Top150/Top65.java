package Top150;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Top65 {
    public class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null || k == 0) {
                return head;
            }

            ListNode curr = head;
            int length = 1;
            while (curr.next != null) {
                curr = curr.next;
                length++;
            }

            curr.next = head;
            k = k % length;
            int steps = length - k;
            ListNode newTail = curr;
            while (steps-- > 0) {
                newTail = newTail.next;
            }

            ListNode newHead = newTail.next;
            newTail.next = null;

            return newHead;
        }
    }
}
