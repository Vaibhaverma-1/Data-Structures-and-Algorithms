class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp=head;
        ListNode prev;
        int first=-1,last=-1;
        int min=Integer.MAX_VALUE;
        int ind=0;
        while(temp.next.next!=null){
            prev=temp;
            temp=temp.next;
            ind++;
            if((temp.val<prev.val&&temp.val<temp.next.val)||(temp.val>prev.val&&temp.val>temp.next.val)){
                if(first==-1){
                    first=ind;
                }
                if(last!=-1){
                    min=Math.min(min,ind-last);
                }
                last=ind;
            }
        }
        if(first==last){
            return new int[]{-1,-1};
        }
        return new int[]{min,last-first};
    }
}