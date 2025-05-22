package DailyQuestionsMarch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class March07 {
    class Solution {
        public int[] closestPrimes(int left, int right) {
            boolean[] isPrime = new boolean[right + 1];
            Arrays.fill(isPrime, true);
            isPrime[0] = isPrime[1] = false;
    
            for (int i = 2; i * i <= right; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= right; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
    
            List<Integer> primes = new ArrayList<>();
    
            for (int i = left; i <= right; i++) {
                if (isPrime[i]) {
                    primes.add(i);
                }
            }
    
            if (primes.size() < 2) {
                return new int[]{-1, -1};
            }
    
            int min = Integer.MAX_VALUE;
            int num1 = -1;
            int num2 = -1;
    
            for (int i = 1; i < primes.size(); i++) {
                int diff = primes.get(i) - primes.get(i - 1);
    
                if (diff < min) {
                    min = diff;
                    num1 = primes.get(i - 1);
                    num2 = primes.get(i);
                }
            }
            return new int[]{num1, num2};
        }
    }
}
