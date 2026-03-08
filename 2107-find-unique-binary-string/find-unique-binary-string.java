class Solution {

    String answer = "";
    boolean found = false;

    public String findDifferentBinaryString(String[] nums) {

        int n = nums.length;

        HashSet<String> set = new HashSet<>();
        for (String s : nums) {
            set.add(s);
        }

        generate("", n, set);

        return answer;
    }

    void generate(String current, int n, HashSet<String> set) {

        if (found) return;  // stop recursion completely

        if (current.length() == n) {
            if (!set.contains(current)) {
                answer = current;
                found = true;
            }
            return;
        }

        generate(current + "0", n, set);
        generate(current + "1", n, set);
    }
}