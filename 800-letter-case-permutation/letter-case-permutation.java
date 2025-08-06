class Solution {
    public List<String> letterCasePermutation(String s) {
        ArrayList<String> list = new ArrayList<>();
        solve(s.toCharArray(), 0, new StringBuilder(), list);
        return list;
    }

    void solve(char[] s, int i, StringBuilder part, ArrayList<String> list) {
        if (i == s.length) {
            list.add(part.toString());
            return;
        }

        char ch = s[i];
        if (Character.isDigit(ch)) {
            part.append(ch);
            solve(s, i + 1, part, list);
            part.deleteCharAt(part.length() - 1);
        } else {
            part.append(Character.toLowerCase(ch));
            solve(s, i + 1, part, list);
            part.deleteCharAt(part.length() - 1);

            part.append(Character.toUpperCase(ch));
            solve(s, i + 1, part, list);
            part.deleteCharAt(part.length() - 1);
        }
    }
}
