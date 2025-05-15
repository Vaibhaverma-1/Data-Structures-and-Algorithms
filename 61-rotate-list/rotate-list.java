class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int len = length(head);
        if (head == null || head.next == null || k == 0 || len == 0) {
            return head;
        }

        k = k % len;
        if (k == 0) return head;

        // Find the (len - k - 1)th node
        int count = 1;
        ListNode temp = head;
        while (count < len - k) {
            temp = temp.next;
            count++;
        }

        // temp is now at the rotation breaking point
        ListNode newHead = temp.next;
        temp.next = null;  // Break the list here

        // Go to the end of new list and connect it to original head
        ListNode tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;

        return newHead;
    }

    int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
