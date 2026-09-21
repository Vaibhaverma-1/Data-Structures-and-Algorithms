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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev=head;
        ListNode curr=head;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
            int value =gcd(prev.val,curr.val);
            ListNode temp = new ListNode(value,curr);
            prev.next=temp;
        }
        return head;
    }
    int gcd(int a, int b) {
    while (b != 0) {
        int rem = a % b;
        a = b;
        b = rem;
    }
    return a;
}
}

