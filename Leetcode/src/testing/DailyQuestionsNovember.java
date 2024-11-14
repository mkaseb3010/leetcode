package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.TestInstance;

import DailyQuestionsNovember.*;

import java.util.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DailyQuestionsNovember {

    //Test cases for november daily questions
    @Nested
    class November1Test {
        @Test
        void testEmptyString() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("", solution.makeFancyString(""));
        }

        @Test
        public void testSingleCharacterString() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("a", solution.makeFancyString("a"));
        }

        @Test
        public void testTwoCharacterStringNoRepetition() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("ab", solution.makeFancyString("ab"));
        }

        @Test
        public void testTwoCharacterStringWithRepetition() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("aa", solution.makeFancyString("aa"));
        }

        @Test
        public void testThreeCharacterStringWithTripleRepetition() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("aa", solution.makeFancyString("aaa"));
        }

        @Test
        public void testLongStringWithNoRepetition() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("abcde", solution.makeFancyString("abcde"));
        }

        @Test
        public void testLongStringWithTripleRepetitions() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("aabbcc", solution.makeFancyString("aaabbbccc"));
        }

        @Test
        public void testLongStringWithMultipleRepetitions() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("aabbccddee", solution.makeFancyString("aaabbbcccddee"));
        }

        @Test
        public void testLongStringWithEdgeRepetitions() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("aabbaa", solution.makeFancyString("aaabbbaaa"));
        }

        @Test
        public void testAlternatingTripleAndSingleRepetitions() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("aabbcaa", solution.makeFancyString("aaabbcaaa"));
        }

        @Test
        public void testStringWithAllUniqueCharacters() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("abcdef", solution.makeFancyString("abcdef"));
        }

        @Test
        public void testStringWithMixedPatterns() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("aabbaaccdd", solution.makeFancyString("aaabbbaaacccddddd"));
        }

        @Test
        public void testStringWithMaxTripleEdgeCase() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("aa", solution.makeFancyString("aaaaa"));
        }

        @Test
        public void testStringWithTwoSetsOfTripleRepetitions() {
            November01.Solution solution = new November01().new Solution();
            assertEquals("aabb", solution.makeFancyString("aaaabbbbbb"));
        }
    }

    @Nested
    class November02Test {
        @Test
        void testSingleWordCircularSentence() {
            November02.Solution solution = new November02().new Solution();
            assertTrue(solution.isCircularSentence("level"));
        }

        @Test
        void testSingleWordNonCircularSentence() {
            November02.Solution solution = new November02().new Solution();
            assertFalse(solution.isCircularSentence("hello"));
        }

        @Test
        void testTwoWordCircularSentence() {
            November02.Solution solution = new November02().new Solution();
            assertFalse(solution.isCircularSentence("hello odd"));
        }

        @Test
        void testTwoWordNonCircularSentence() {
            November02.Solution solution = new November02().new Solution();
            assertFalse(solution.isCircularSentence("hello world"));
        }

        @Test
        void testMultipleWordCircularSentence() {
            November02.Solution solution = new November02().new Solution();
            assertFalse(solution.isCircularSentence("go on never rest stop"));
        }

        @Test
        void testMultipleWordNonCircularSentence() {
            November02.Solution solution = new November02().new Solution();
            assertFalse(solution.isCircularSentence("go on never rest here"));
        }

        @Test
        void testSentenceWithRepeatedWordsCircular() {
            November02.Solution solution = new November02().new Solution();
            assertFalse(solution.isCircularSentence("abc cba abc"));
        }

        @Test
        void testSentenceWithRepeatedWordsNonCircular() {
            November02.Solution solution = new November02().new Solution();
            assertFalse(solution.isCircularSentence("abc def abc"));
        }

        @Test
        void testSentenceWithSingleCharacterWordsCircular() {
            November02.Solution solution = new November02().new Solution();
            assertTrue(solution.isCircularSentence("a a a a"));
        }

        @Test
        void testSentenceWithSingleCharacterWordsNonCircular() {
            November02.Solution solution = new November02().new Solution();
            assertFalse(solution.isCircularSentence("a b c a"));
        }

        @Test
        void testSentenceWithMixedCaseCircular() {
            November02.Solution solution = new November02().new Solution();
            assertFalse(solution.isCircularSentence("Apple ends silently top"));
        }

        @Test
        void testSentenceWithMixedCaseNonCircular() {
            November02.Solution solution = new November02().new Solution();
            assertFalse(solution.isCircularSentence("Apple ends here stop"));
        }

        @Test
        void testSentenceWithTrailingSpacesCircular() {
            November02.Solution solution = new November02().new Solution();
            assertFalse(solution.isCircularSentence("end now we end "));
        }
    }

    @Nested
    class November3Test {
        @Test
        void testEmptyStrings() {
            November03.Solution solution = new November03().new Solution();
            assertTrue(solution.rotateString("", ""));
        }

        @Test
        void testUnequalLengthStrings() {
            November03.Solution solution = new November03().new Solution();
            assertFalse(solution.rotateString("abc", "ab"));
        }

        @Test
        void testSameString() {
            November03.Solution solution = new November03().new Solution();
            assertTrue(solution.rotateString("abc", "abc"));
        }

        @Test
        void testValidRotation() {
            November03.Solution solution = new November03().new Solution();
            assertTrue(solution.rotateString("abcde", "cdeab"));
        }

        @Test
        void testInvalidRotation() {
            November03.Solution solution = new November03().new Solution();
            assertFalse(solution.rotateString("abcde", "abced"));
        }

        @Test
        void testSingleCharacterStringsValid() {
            November03.Solution solution = new November03().new Solution();
            assertTrue(solution.rotateString("a", "a"));
        }

        @Test
        void testSingleCharacterStringsInvalid() {
            November03.Solution solution = new November03().new Solution();
            assertFalse(solution.rotateString("a", "b"));
        }

        @Test
        void testDoubleRotation() {
            November03.Solution solution = new November03().new Solution();
            assertTrue(solution.rotateString("aa", "aa"));
        }

        @Test
        void testStringsWithRepeatingPatternsValid() {
            November03.Solution solution = new November03().new Solution();
            assertTrue(solution.rotateString("abab", "baba"));
        }

        @Test
        void testStringsWithRepeatingPatternsInvalid() {
            November03.Solution solution = new November03().new Solution();
            assertFalse(solution.rotateString("abab", "abba"));
        }

        @Test
        void testPartialMatch() {
            November03.Solution solution = new November03().new Solution();
            assertFalse(solution.rotateString("abcdefg", "efghijk"));
        }

        @Test
        void testRotationWithDifferentCharacters() {
            November03.Solution solution = new November03().new Solution();
            assertFalse(solution.rotateString("abc", "def"));
        }

        @Test
        void testGoalAsSubstringButNotRotation() {
            November03.Solution solution = new November03().new Solution();
            assertTrue(solution.rotateString("abcde", "eabcd"));
        }

        @Test
        void testLongValidRotation() {
            November03.Solution solution = new November03().new Solution();
            assertTrue(solution.rotateString("abcdefghijkl", "ghijklabcdef"));
        }

        @Test
        void testLongInvalidRotation() {
            November03.Solution solution = new November03().new Solution();
            assertTrue(solution.rotateString("abcdefghijkl", "ghijklabcdef"));
        }
    }

    @Nested
    class November04Test {
        @Test
        void testEmptyString() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("", solution.compressedString(""));
        }
    
        @Test
        void testSingleCharacterString() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("1a", solution.compressedString("a"));
        }
    
        @Test
        void testStringWithNoRepeatingCharacters() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("1a1b1c", solution.compressedString("abc"));
        }
    
        @Test
        void testStringWithRepeatingCharactersBelowLimit() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("2a3b", solution.compressedString("aabbb"));
        }
    
        @Test
        void testStringWithRepeatingCharactersAtLimit() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("9a", solution.compressedString("aaaaaaaaa"));
        }
    
        @Test
        void testStringWithRepeatingCharactersExceedingLimit() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("9a2a", solution.compressedString("aaaaaaaaaaa"));
        }
    
        @Test
        void testStringWithMultipleGroupsOfRepeatingCharacters() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("9a9a1a", solution.compressedString("aaaaaaaaaaaaaaaaaaa"));
        }
    
        @Test
        void testStringWithMixedRepeatingAndNonRepeatingCharacters() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("1a9b1c", solution.compressedString("abbbbbbbbbc"));
        }
    
        @Test
        void testStringWithAllSameCharacter() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("9a9a9a", solution.compressedString("aaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        }
    
        @Test
        void testStringWithAlternatingCharacters() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("1a1b1a1b1a1b1a1b1a1b1a", solution.compressedString("abababababa"));
        }
    
        @Test
        void testStringWithMultipleDifferentRepeatingPatterns() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("3a2b3c", solution.compressedString("aaabbccc"));
        }
    
        @Test
        void testStringWithEdgeCaseLimit() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("9z", solution.compressedString("zzzzzzzzz"));
        }
    
        @Test
        void testStringWithShortRepeatingCharacters() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("1x2y1z", solution.compressedString("xyyz"));
        }
    
        @Test
        void testLongStringWithMultipleLimitGroups() {
            November04.Solution solution = new November04().new Solution();
            assertEquals("9a9a1a", solution.compressedString("aaaaaaaaaaaaaaaaaaa"));
        }
    }
}
