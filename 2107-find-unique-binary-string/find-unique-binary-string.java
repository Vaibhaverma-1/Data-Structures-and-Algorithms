class Solution {

    String answer = "";
    boolean found = false;

    public String findDifferentBinaryString(String[] nums) {

        int n = nums.length;

        HashSet<String> set = new HashSet<>();
        for (String s : nums) {
            set.add(s);
        }

        StringBuilder sb = new StringBuilder();
        generate(sb, n, set);

        return answer;
    }

    void generate(StringBuilder sb, int n, HashSet<String> set) {

        if (found) return;

        if (sb.length() == n) {
            String candidate = sb.toString();
            if (!set.contains(candidate)) {
                answer = candidate;
                found = true;
            }
            return;
        }

        // choose '0'
        sb.append('0');
        generate(sb, n, set);
        sb.deleteCharAt(sb.length() - 1);  // backtrack

        // choose '1'
        sb.append('1');
        generate(sb, n, set);
        sb.deleteCharAt(sb.length() - 1);  // backtrack
    }
}