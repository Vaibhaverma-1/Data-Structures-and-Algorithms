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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // No rearrangement needed for 0 or 1 node
        }

        // Initialize odd and even pointers
        ListNode odd = head;              // Points to current odd node
        ListNode estart = head.next;      // Keeps track of start of even list
        ListNode even = head.next;        // Points to current even node

        // Rearranging next pointers: skip over alternate nodes
        while (odd != null && odd.next != null && even != null && even.next != null) {
            odd.next = odd.next.next;     // Link current odd to next odd
            odd = odd.next;               // Move odd pointer forward

            even.next = even.next.next;   // Link current even to next even
            even = even.next;             // Move even pointer forward
        }

        // After rearranging, connect end of odd list to start of even list
        odd.next = estart;

        return head; // Return modified head
    }
}
