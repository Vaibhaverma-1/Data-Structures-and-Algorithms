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
        if(head.next == null || head == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while( fast.next != null&&fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode first = head;
        ListNode second = newHead;
        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
        
    }
    ListNode reverse (ListNode head){
        ListNode prev =  null;
        ListNode ptr = null;
        ListNode curr = head;
        while(curr != null){
            ptr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ptr;
        }
        return prev;
    }
}