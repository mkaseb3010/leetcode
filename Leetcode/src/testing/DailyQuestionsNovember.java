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
}
