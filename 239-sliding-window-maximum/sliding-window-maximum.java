class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> maxD = new ArrayDeque<>();
        int n =nums.length;
        int left = 0;
        int[] ans = new int[n-k+1];

for (int right = 0; right < n; right++) {

    // 1️⃣ Add nums[right] into window
    while(!maxD.isEmpty() && nums[maxD.peekLast()]<=nums[right]){
        maxD.pollLast();
    }
    maxD.addLast(right);

    // 2️⃣ If window size > k → remove nums[left] and move left

    while (right - left + 1 > k) {
        if(maxD.peekFirst()==left){
            maxD.pollFirst();
        }
        // remove nums[left]
        left++;
    }

    // 3️⃣ If window size == k → record answer
    if(right-left+1==k){
        ans[left] = nums[maxD.peekFirst()];

    }
}
return ans;
    }
}