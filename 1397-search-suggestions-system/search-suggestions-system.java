
class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null;
    }

    TrieNode root = new TrieNode();

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        for (String product : products) {
            insert(product);
        }

        List<List<String>> ans = new ArrayList<>();
        TrieNode curr = root;

        for (char c : searchWord.toCharArray()) {
            int index = c - 'a';

            if (curr != null) {
                curr = curr.children[index];
            }

            List<String> suggestions = new ArrayList<>();

            if (curr != null) {
                dfs(curr, suggestions);
            }

            ans.add(suggestions);
        }

        return ans;
    }

    private void insert(String word) {
        TrieNode curr = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new TrieNode();
            }

            curr = curr.children[index];
        }

        curr.word = word;
    }

    private void dfs(TrieNode node, List<String> suggestions) {
        if (suggestions.size() == 3) {
            return;
        }

        if (node.word != null) {
            suggestions.add(node.word);
        }

        for (int i = 0; i < 26; i++) {
            if (suggestions.size() == 3) {
                return;
            }

            if (node.children[i] != null) {
                dfs(node.children[i], suggestions);
            }
        }
    }
}
