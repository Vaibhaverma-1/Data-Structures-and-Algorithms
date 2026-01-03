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
    public ListNode modifiedList(int[] nums, ListNode head) {
        int n = nums.length;
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        }
        ListNode dummy = new ListNode(0, head);
        ListNode temp =dummy;
        while(temp.next != null){
            if(set.contains(temp.next.val)){
                temp.next = temp.next.next;

            }
            else{
              temp = temp.next;
            }
            
        }
        return dummy.next;
    }
}