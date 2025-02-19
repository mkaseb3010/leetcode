package Top150;

import java.util.HashMap;
import java.util.Map;

public class Top99 {
    class WordDictionary {
        private TrieNode root;

        public WordDictionary() {
            root = new TrieNode();
        }

        public void addWord(String word) {
            TrieNode node = root;
            for (char ch : word.toCharArray()) {
                if (!node.children.containsKey(ch)) {
                    node.children.put(ch, new TrieNode());
                }
                node = node.children.get(ch);
            }
            node.isEnd = true;
        }

        public boolean search(String word) {
            return dfs(word, 0, root);
        }

        private boolean dfs(String word, int index, TrieNode node) {
            if (index == word.length()) {
                return node.isEnd;
            }

            char ch = word.charAt(index);
            
            if (ch == '.') {
                for (TrieNode child : node.children.values()) {
                    if (dfs(word, index + 1, child)) {
                        return true;
                    }
                }
                return false;
            }else {
                if (!node.children.containsKey(ch)) {
                    return false;
                }
                return dfs(word, index + 1, node.children.get(ch));
            }
        }

        private class TrieNode {
            Map<Character, TrieNode> children = new HashMap<>();
            boolean isEnd = false;
        }
    }

    /**
     * Your WordDictionary object will be instantiated and called as such:
     * WordDictionary obj = new WordDictionary();
     * obj.addWord(word);
     * boolean param_2 = obj.search(word);
     */
}
