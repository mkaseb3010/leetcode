package Top150;

import java.util.ArrayList;
import java.util.List;

public class Top100 {
    class Solution {
        private static class TrieNode {
            TrieNode[] children = new TrieNode[26];
            String word = null;
        }

        private TrieNode buildTrie(String[] words) {
            TrieNode root = new TrieNode();
            for (String word : words) {
                TrieNode node = root;
                for (char c : word.toCharArray()) {
                    int index = c - 'a';
                    if (node.children[index] == null) {
                        node.children[index] = new TrieNode();
                    }
                    node = node.children[index];
                }
                node.word = word;
            }
            return root;
        }

        private void dfs(char[][] board, int i, int j, TrieNode node, List<String> result) {
            char c = board[i][j];
            if (c == '#' || node.children[c - 'a'] == null){
                return;
            }

            node = node.children[c - 'a'];
            if (node.word != null) {  
                result.add(node.word);
                node.word = null;
            }

            board[i][j] = '#';

            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int[] d : directions) {
                int x = i + d[0], y = j + d[1];
                if (x >= 0 && x < board.length && y >= 0 && y < board[0].length) {
                    dfs(board, x, y, node, result);
                }
            }
            board[i][j] = c;
        }

        public List<String> findWords(char[][] board, String[] words) {
            List<String> result = new ArrayList<>();
            TrieNode root = buildTrie(words);
            int rows = board.length, cols = board[0].length;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (root.children[board[i][j] - 'a'] != null) {
                        dfs(board, i, j, root, result);
                    }
                }
            }
            return result;
        }
    }
}
