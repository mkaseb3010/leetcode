package DailyQuestionsNovember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class November11 {
    public class Solution {
    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        int max = 1000;
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] <= nums[i - 1]) {
                boolean valid = false;
                for (int p : primes) {
                    if (nums[i - 1] - p > 0 && nums[i - 1] - p < nums[i]) {
                        nums[i - 1] -= p;
                        valid = true;
                        break;
                    }
                }
                if (!valid) return false;
            }
        }

        return true;
    }
}

}
