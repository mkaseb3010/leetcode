package Top150;

public class Top39 {
    public class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] letter = new int[26];
    
            for (char ch : magazine.toCharArray()) {
                letter[ch - 'a']++;
            }
    
            for (char ch : ransomNote.toCharArray()) {
                if (letter[ch - 'a'] == 0) {
                    return false;
                }
                letter[ch - 'a']--;
            }
            return true;
        }
    }
}
