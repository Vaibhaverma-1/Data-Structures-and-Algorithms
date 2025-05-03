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
import java.util.ArrayList;

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        ListNode temp2 = head.next;

        // Add odd-positioned nodes
        while (temp != null) {
            list.add(temp.val);
            if (temp.next == null || temp.next.next == null) break;
            temp = temp.next.next;
        }

        // Add even-positioned nodes
        while (temp2 != null) {
            list.add(temp2.val);
            if (temp2.next == null || temp2.next.next == null) break;
            temp2 = temp2.next.next;
        }

        // Assign values back from the list
        temp = head;
        int i = 0;
        int n = list.size();
        while (temp != null && i < n) {
            temp.val = list.get(i++);
            temp = temp.next;
        }

        return head;
    }
}
