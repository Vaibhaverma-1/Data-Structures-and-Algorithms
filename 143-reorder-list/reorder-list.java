class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode curr = slow.next, temp = null, prev = null;
        slow.next = null;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        ListNode start1 = head, start2 = prev, temp1 = null, temp2 = null;

        while (start2 != null) {
            temp1 = start1.next;
            temp2 = start2.next;

            start1.next = start2;
            start2.next = temp1;

            start1 = temp1;
            start2 = temp2;
        }
    }
}