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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right || head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;
        int count = 1;
        ListNode prev = null;

        while (count < left) {
            prev = temp;
            temp = temp.next;
            count++;
        }

        // ⚠️ Save start of the reversal segment
        ListNode start = temp;

        ListNode temp2 = temp;
        while (count < right) {  // ⚠️ Only advance count, not when temp2 becomes null
            temp2 = temp2.next;
            count++;
        }

        // ⚠️ Save the node after the reversed part
        ListNode holder = temp2.next;
        temp2.next = null;

        // ⚠️ Reverse the sublist
        temp = reverseList(temp);

        // ⚠️ Connect the previous part to the reversed part
        if (prev != null) {
            prev.next = temp;
        } else {
            head = temp;  // ⚠️ If left == 1, update head
        }

        // ⚠️ Traverse to the end of reversed segment
        temp2 = temp;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }

        // ⚠️ Connect the end of reversed part to the remaining list
        temp2.next = holder;

        return head;
    }

    public ListNode reverseList(ListNode head) {
        // ⚠️ Base case check added
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
