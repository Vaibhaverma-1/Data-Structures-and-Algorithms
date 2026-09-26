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
        if(head==null || head.next == null) return true;
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow, temp=null,prev=null;
        while(curr!=null){
            temp =curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        fast=head;
        while(prev!=null){
           if(prev.val!=fast.val) return false;
           prev=prev.next;
           fast=fast.next;
        }
        return true;


    }
}