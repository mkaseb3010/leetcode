package DailyQuestionsApril;

import java.util.*;

public class April13 {
    class Solution {
        public int countGoodNumbers(long n) {
            if(n==1) {
                return 5;
            }

            long even = (n+1)/2;
            long odd = n/2;
            long mod = 1000000007;
        
            return (int)((goodNumbers(5,even,mod)*goodNumbers(4,odd,mod))%mod);
        }

        public long goodNumbers(long base,long expo,long mod){
            long ans = 1;

            while(expo>0)
            {
                if(expo%2==0)            
                {
                    base = (base*base)%mod;
                    expo = expo/2;
                }
                else{
                    ans = (ans*base)%mod;
                    expo-=1;
                }
            }
            return ans;
        }
    }
}
