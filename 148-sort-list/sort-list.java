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
import java.util.Collections;

class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;

        // Step 1: Extract all values into an ArrayList
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;  // ✅ Move to the next node
        }

        // Step 2: Sort the values
        Collections.sort(list);

        // Step 3: Assign sorted values back into the linked list
        int i = 0;
        temp = head;
        while (temp != null) {
            temp.val = list.get(i++);
            temp = temp.next;
        }

        return head;  // Return the sorted list
    }
}
