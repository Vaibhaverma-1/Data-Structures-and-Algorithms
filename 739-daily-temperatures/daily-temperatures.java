class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? 0:stack.peek()-i;
            stack.push(i);
        }
        return ans;
    }
}