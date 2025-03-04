package DailyQuestionsFebruary;

import java.util.ArrayList;
import java.util.List;

public class February14 {
    class ProductOfNumbers {
        private List<Integer> prefixProduct;
    
        public ProductOfNumbers() {
            prefixProduct = new ArrayList<>();
            prefixProduct.add(1);
        }
        
        public void add(int num) {
            if (num == 0) {
                prefixProduct.clear();
                prefixProduct.add(1);
            }else {
                int last = prefixProduct.get(prefixProduct.size() - 1);
                prefixProduct.add(last * num);
            }
        }
        
        public int getProduct(int k) {
            if (k >= prefixProduct.size()) {
                return 0;
            }
            int n = prefixProduct.size();
            return prefixProduct.get(n - 1) / prefixProduct.get(n - 1 - k);
        }
    }
    
    /**
     * Your ProductOfNumbers object will be instantiated and called as such:
     * ProductOfNumbers obj = new ProductOfNumbers();
     * obj.add(num);
     * int param_2 = obj.getProduct(k);
     */
}
