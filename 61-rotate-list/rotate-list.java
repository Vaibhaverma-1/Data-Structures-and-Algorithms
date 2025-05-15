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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        k = k % length(head);
        if (k == 0) {
            return head;
        }

        while (k-- > 0) {
            head = rotate(head);
        }

        return head;
    }

    // Helper method to rotate the list to the right by one place
    ListNode rotate(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        temp.next = head;
        prev.next = null;
        return temp; // new head
    }

    // Helper method to find the length of the list
    int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
