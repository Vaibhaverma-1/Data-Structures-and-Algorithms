class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int len = getLength(head);
        k = k % len;
        if (k == 0) return head;

        // Find new tail: (len - k - 1)th node
        ListNode current = head;
        for (int i = 1; i < len - k; i++) {
            current = current.next;
        }

        // Detach and reassign head
        ListNode newHead = current.next;
        current.next = null;

        // Go to the end of the new list and attach original head
        ListNode tail = newHead;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head;

        return newHead;
    }

    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
