/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashSet;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode temp1 = headA;
        ListNode temp2 = headB;
        HashSet<ListNode> set = new HashSet<>();

        // Traverse both lists together
        while (temp1 != null && temp2 != null) {
            if (set.contains(temp1)) return temp1;
            set.add(temp1);
            temp1 = temp1.next;

            if (set.contains(temp2)) return temp2;
            set.add(temp2);
            temp2 = temp2.next;
        }

        // If list A still has nodes
        while (temp1 != null) {
            if (set.contains(temp1)) return temp1;
            set.add(temp1);
            temp1 = temp1.next;
        }

        // If list B still has nodes
        while (temp2 != null) {
            if (set.contains(temp2)) return temp2;
            set.add(temp2);
            temp2 = temp2.next;
        }

        return null; // No intersection
    }
}
