/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       ListNode fast = head;
       ListNode slow = head;
       boolean ans=false;
       while(fast != null && fast.next != null){
        slow = slow.next;
        fast= fast.next.next;
        if(slow==fast){
             ans =true;
             break;
        }
       }
       if(ans){
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;

        }
        return fast;
       }
       return null;
    }
}