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
  /*class Solution {
    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        }
        int length = len(head);
        int mid = (int)Math.ceil(length/2);
        int count=0;
        while(count<mid){
         count++;
         head=head.next;
        }
        return head;
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
}