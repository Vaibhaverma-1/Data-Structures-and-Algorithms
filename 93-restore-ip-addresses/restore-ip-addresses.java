class Solution {

    public List<String> restoreIpAddresses(String s) {

        List<String> result = new ArrayList<>();
        backtrack(s, 0, 0, new StringBuilder(), result);
        return result;
    }

    void backtrack(String s, int index, int parts, StringBuilder current, List<String> result) {

        if (parts == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1)); // remove last dot
            return;
        }

        if (parts == 4 || index == s.length()) {
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {

            String segment = s.substring(index, index + len);

            // leading zero check
            if (segment.length() > 1 && segment.charAt(0) == '0')
                break;

            int value = Integer.parseInt(segment);

            if (value <= 255) {

                int before = current.length();

                current.append(segment).append(".");
                backtrack(s, index + len, parts + 1, current, result);

                current.setLength(before); // backtrack
            }
        }
    }
}