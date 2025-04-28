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
 /*
class Solution {
    public ListNode middleNode(ListNode head) {
        int n = len(head);
        int mid = n/2;
        int cnt=0;
        ListNode temp= head;
        while(temp!=null)
        {  
            if(cnt==mid) break;
            cnt++;

            System.out.println(temp.val);
            temp = temp.next;
        }
        return temp;
    }
      int len(ListNode head){
        int count=0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}*/
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}