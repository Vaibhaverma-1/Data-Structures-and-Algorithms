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

 //Done by self, used gpt for syntax errors
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int size = count(head);
        ListNode finalNode = head; // Changed variable name from 'final' to 'finalNode' final is reserved
        
        if (head == null || head.next == null || k % size == 0) {return head; }
        
 for (int i = 0; i < k % size; i++) {
            finalNode = rotate(finalNode);
        }
        return finalNode;
    }

    int count(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) { 
            count++;
            temp = temp.next;
        }
        return count;
    }

    ListNode rotate(ListNode head) {
        if(head == null || head.next == null) { return head;}

        ListNode temp = head;
        ListNode prev = null;

       
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

       
        prev.next = null;
        temp.next = head;

        return temp; 
    }
}
