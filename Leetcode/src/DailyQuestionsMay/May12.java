package DailyQuestionsMay;

import java.util.Set;
import java.util.TreeSet;

/**
 * LeetCode Daily Challenge for May 12, 2023.
 * Problem: Find All Possible Even 3-Digit Numbers.
 * Link: https://leetcode.com/problems/find-all-possible-even-3-digit-numbers/
 */

// Time Complexity: O(n^3)
// Space Complexity: O(n^3)

public class May12 {
    class Solution {
        public int[] findEvenNumbers(int[] digits) {
            Set<Integer> result = new TreeSet<>();

            for (int i = 0; i < digits.length; i++) {
                for (int j = 0; j < digits.length; j++) {
                    if (j == i) {
                        continue;
                    }

                    for (int k = 0; k < digits.length; k++) {
                        if (k == i || k == j) {
                            continue;
                        }

                        int a = digits[i];
                        int b = digits[j];
                        int c = digits[k];

                        if (a == 0) {
                            continue;
                        }

                        if (c % 2 != 0) {
                            continue;
                        }

                        int num = a * 100 + b * 10 + c;
                        result.add(num);
                    }
                }
            }

            int[] output = new int[result.size()];
            int index = 0;

            for (int num : result) {
                output[index++] = num;
            }
            return output;
        }
    }
}
