package Top150;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class Top66 {
    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode least = new ListNode(0);
            ListNode greater = new ListNode(0);
            ListNode less = least;
            ListNode great = greater;

            while (head != null) {
                if (head.val < x) {
                    less.next = head;
                    less = less.next;
                }else {
                    great.next = head;
                    great = great.next;
                }
                head = head.next;
            }
            great.next = null;
            less.next = greater.next;
            return least.next;
        }
    }
}
