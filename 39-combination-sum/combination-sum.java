import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return; // stop recursion
        }

        // Include the current number (can reuse, so index stays the same)
        current.add(candidates[index]);
        backtrack(index, candidates, target - candidates[index], current, result);
        current.remove(current.size() - 1); // backtrack

        // Exclude and move to next number
        backtrack(index + 1, candidates, target, current, result);
    }
}
