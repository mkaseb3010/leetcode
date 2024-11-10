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
}
