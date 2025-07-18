package DailyQuestionsApril;

import java.util.*;

public class April20 {
    class Solution {
        public int numRabbits(int[] answers) {
            Map<Integer, Integer> rabbitMap = new HashMap<>();

            for (int i : answers) {
                rabbitMap.put(i, rabbitMap.getOrDefault(i, 0) + 1);
            }

            int total = 0;

            for (Map.Entry<Integer, Integer> p : rabbitMap.entrySet())
                total += Math.ceil((double)p.getValue() / (p.getKey() + 1)) * (p.getKey() + 1);

            return total;
        }
    }
}
