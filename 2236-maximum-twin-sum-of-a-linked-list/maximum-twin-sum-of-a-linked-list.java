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
    public int pairSum(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev = slow;
        slow = slow.next;
        prev.next=null;
        prev=null;
        while(slow!=null){
            ListNode next = slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        slow=prev;
        fast=head;
        int sum=0;
        while(slow!=null && fast!=null){
            sum=Math.max(sum,slow.val+fast.val);
            slow=slow.next;
            fast=fast.next;
        }
        return sum;
        


       

        
    }
}