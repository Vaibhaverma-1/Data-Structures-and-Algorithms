class Solution {
    List<List<Integer>> ans;
    List<Integer> curr;
    public List<List<Integer>> combinationSum3(int k, int n) {
        int minSum = (k*(k+1))/2;
        int rem = 9-k;
        int maxSum =((9*(9+1))/2)-((rem*(rem+1))/2);
        if(n<minSum || n>maxSum) return new ArrayList<>();
        ans = new ArrayList<>();
        curr = new ArrayList<>();
        backtrack(k,n,1);
        return ans;
    }

    void backtrack(int k, int target, int start){
        if(curr.size()==k){
            if(target==0) ans.add(new ArrayList<>(curr));
            //curr is mutuable so we create new copy else ans would have had its reference only
            return;
        }
        if(target<0) return;
        for(int i=start; i<=9; i++){
            curr.add(i);
            backtrack(k,target-i,i+1);
            curr.remove(curr.size()-1);
        }

    }
}