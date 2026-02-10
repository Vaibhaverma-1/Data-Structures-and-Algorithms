class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int count=0;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(heights[n-1]);
        ans[n-1]=0;
        for(int i=n-2; i>=0; i--){
           while (!st.isEmpty() && st.peek() <= heights[i]){
              count++;
              st.pop();
            }
            
            if(!st.isEmpty() && st.peek()>heights[i]){
                count++;
               
            }st.push(heights[i]);
            ans[i]=count;
            count=0;
        }
        return ans;
    }
}