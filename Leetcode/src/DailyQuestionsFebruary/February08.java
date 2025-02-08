package DailyQuestionsFebruary;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class February08 {
    class NumberContainers {
        private Map<Integer, Integer> indexMap;
        private Map<Integer, TreeSet<Integer>> indicesMap;

        public NumberContainers() {
            indexMap = new HashMap<>();
            indicesMap = new HashMap<>();
        }
        
        public void change(int index, int number) {
            if (indexMap.containsKey(index)) {
                int prev = indexMap.get(index);
                if (indicesMap.containsKey(prev)) {
                    indicesMap.get(prev).remove(index);
                    if (indicesMap.get(prev).isEmpty()) {
                        indicesMap.remove(prev);
                    }
                }
            }

            indexMap.put(index, number);
            indicesMap.putIfAbsent(number, new TreeSet<>());
            indicesMap.get(number).add(index);
        }
        
        public int find(int number) {
            if (!indicesMap.containsKey(number) || indicesMap.get(number).isEmpty()) {
                return -1;
            }
            return indicesMap.get(number).first();
        }
    }

    /**
     * Your NumberContainers object will be instantiated and called as such:
     * NumberContainers obj = new NumberContainers();
     * obj.change(index,number);
     * int param_2 = obj.find(number);
     */
}
