package Top150;

import java.util.ArrayList;
import java.util.List;

public class Top24 {
    public class Solution {
        private String justifyLine(List<String> line, int currentLength, int maxWidth, boolean isLastLine) {
            StringBuilder str = new StringBuilder();

            if (isLastLine || line.size() == 1) {
                for (String word : line) {
                    str.append(word).append(" ");
                }
                str.deleteCharAt(str.length() - 1);
                while (str.length() < maxWidth) {
                    str.append(" ");
                }
            }else {
                int total = maxWidth - currentLength;
                int spaceSlots = line.size() - 1;
                int spacesPerSlot = total / spaceSlots;
                int extra = total % spaceSlots;

                for (int i = 0; i < line.size() - 1; i++) {
                    str.append(line.get(i));
                    for (int j = 0; j < spacesPerSlot; j++) {
                        str.append(" ");
                    }
                    if (extra > 0) {
                        str.append(" ");
                        extra--;
                    }
                }
                str.append(line.get(line.size() - 1));
            }
            String result = str.toString();
            return result;
        }

        public List<String> fullJustify(String[] words, int maxWidth) {
            List<String> result = new ArrayList<>();
            List<String> curr = new ArrayList<>();
            int currLen = 0;

            for (String word : words) {
                if (currLen + word.length() + curr.size() > maxWidth) {
                    result.add(justifyLine(curr, currLen, maxWidth, false));
                    curr.clear();
                    currLen = 0;
                }
                curr.add(word);
                currLen += word.length();
            }

            if (!curr.isEmpty()) {
                result.add(justifyLine(curr, currLen, maxWidth, true));
            }
            return result;
        }
    }
}
