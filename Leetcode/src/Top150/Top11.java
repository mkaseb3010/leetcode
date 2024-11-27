package Top150;

import java.util.Arrays;

public class Top11 {
    public class Solution {
        public int hIndex(int[] citations) {
            Arrays.sort(citations);
            int n = citations.length;

            for (int i = 0; i < n; i++) {
                if (citations[i] >= n - i) {
                    int index = n - i;
                    return index;
                }
            }
            return 0;
        }
    }
}
