package Top150;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Top62 {
    public class Solution {
        public ListNode reverseKGroup(ListNode head, int k) {
            if (head == null || k == 1) {
                return head;
            }

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prevEnd = dummy;

            while (true) {
                ListNode start = prevEnd.next;
                ListNode end = prevEnd;

                for (int i = 0; i < k; i++) {
                    end = end.next;
                    if (end == null) {
                        return dummy.next;
                    }
                }

                ListNode nextGroupStart = end.next;
                ListNode prev = nextGroupStart;
                ListNode curr = start;

                while (curr != nextGroupStart) {
                    ListNode temp = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = temp;
                }

                prevEnd.next = end;
                prevEnd = start;
            }
        }
    }
}
