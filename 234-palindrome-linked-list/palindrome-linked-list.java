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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // A single node or empty list is always a palindrome
        }

        // Step 1: Use slow and fast pointers to find the middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode secondHalfStart = reverse(slow.next);

        // Step 3: Compare the first half and the reversed second half
        ListNode first = head;
        ListNode second = secondHalfStart;
        boolean isPalindrome = true;
        while (second != null) {
            if (first.val != second.val) {
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        // Step 4: Restore the original list (optional, good practice)
        slow.next = reverse(secondHalfStart);

        return isPalindrome;
    }

    // Helper function to reverse a linked list
    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
