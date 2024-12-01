package Top150;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Top57 {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null) {
                return false;
            }

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
    }
}
