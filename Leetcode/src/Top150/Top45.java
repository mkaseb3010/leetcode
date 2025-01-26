package Top150;

public class Top45 {
    public class Solution {
        private int sumOfSquares(int nums) {
            int sum = 0;
            while (nums > 0) {
                int digit = nums % 10;
                sum += digit * digit;
                nums /= 10;
            }
            return sum;
        }
    
        public boolean isHappy(int n) {
            int slow = n;
            int fast = n;
            do {
                slow = sumOfSquares(slow);
                fast = sumOfSquares(sumOfSquares(fast));
            }while (slow != fast);
            return slow == 1;
        }
    }
}
