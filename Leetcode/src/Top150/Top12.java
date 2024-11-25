package Top150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top12 {
    public class RandomizedSet {
        private Map<Integer, Integer> map;
        private List<Integer> list;
        private Random random;

        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            random = new Random();
        }
        
        public boolean insert(int val) {
            if (map.containsKey(val)) {
                return false;
            }
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
        
        public boolean remove(int val) {
            if (!map.containsKey(val)) {
                return false;
            }
            int index = map.get(val);
            int last = list.get(list.size() - 1);

            list.set(index, last);
            map.put(last, index);

            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }
        
        public int getRandom() {
            int b = list.get(random.nextInt(list.size()));
            return b;
        }
    }
}
