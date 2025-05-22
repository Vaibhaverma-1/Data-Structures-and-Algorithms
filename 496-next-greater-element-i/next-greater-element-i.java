class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> ngeMap = new HashMap<>();
        
        // Build NGE map for nums2 using a monotonic stack
        for (int i = nums2.length - 1; i >= 0; i--) {
            int current = nums2[i];
            
            while (!st.isEmpty() && st.peek() <= current) {
                st.pop();
            }
            
            int nextGreater = st.isEmpty() ? -1 : st.peek();
            ngeMap.put(current, nextGreater);
            st.push(current);
        }
        
        // Fill answer for nums1 from the map
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = ngeMap.get(nums1[i]);
        }
        
        return ans;
    }
}
