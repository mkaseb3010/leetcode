package Top150;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Top64 {
    public class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return null;
            }

            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;

            while (head != null) {
                if (head.next != null && head.val == head.next.val) {
                    while (head.next != null && head.val == head.next.val) {
                        head = head.next;
                    }
                    prev.next = head.next;
                }else {
                    prev = prev.next;
                }
                head = head.next;
            }
            return dummy.next;
        }
    }
}