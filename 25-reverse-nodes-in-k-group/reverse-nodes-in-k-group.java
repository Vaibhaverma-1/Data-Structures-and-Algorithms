/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;

        while (true) {
            ListNode temp = prevGroupEnd.next;
            ListNode temp2 = prevGroupEnd.next;
            int count = 0;

            // Find k nodes
            while (temp2 != null && count < k) {
                temp2 = temp2.next;
                count++;
            }

            if (count < k) break;

            // Reverse k nodes
            ListNode newHead = reverse(temp, temp2);
            prevGroupEnd.next = newHead;
            temp.next = temp2;
            prevGroupEnd = temp;
        }

        return dummy.next;
    }

    ListNode reverse(ListNode head, ListNode tail) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode ptr = null;

        while (temp != tail) {
            ptr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = ptr;
        }

        return prev;
    }
}
