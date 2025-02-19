package Top150;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Top97 {
    class Solution {
        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Set<String> wordSet = new HashSet<>(wordList);

            if (!wordSet.contains(endWord)) {
                return 0;
            }

            Queue<String> queue = new LinkedList<>();
            queue.add(beginWord);
            int steps = 1;

            while (!queue.isEmpty()) {
                int size = queue.size();

                for (int i = 0; i < size; i++) {
                    String curr = queue.poll();

                    if (curr.equals(endWord)) {
                        return steps;
                    }

                    for (int j = 0; j < curr.length(); j++) {
                        char[] chars = curr.toCharArray();

                        for (char ch = 'a'; ch <= 'z'; ch++) {
                            chars[j] = ch;
                            String newWord = new String(chars);

                            if (wordSet.contains(newWord)) {
                                queue.add(newWord);
                                wordSet.remove(newWord);
                            }
                        }
                    }
                }
                steps++;
            }
            return 0;
        }
    }
}
