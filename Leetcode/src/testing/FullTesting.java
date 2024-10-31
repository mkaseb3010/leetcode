package testing;

import DailyQuestions.*;
import DailyQuestions.October23.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FullTesting {
	
	//Test cases for daily questions
	@Nested
	class October1Test {
		@Test
		void testBasic() {
			October01.Solution solution = new October01().new Solution();
			int[] arr1 = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
			int k1 = 5;
			assertTrue(solution.canArrange(arr1, k1), "October1 Test case 1 failed.");
		}
		
		@Test
		void testNoPairs() {
			October01.Solution solution = new October01().new Solution();		
			int[] arr2 = {1, 2, 3, 4, 5, 6};
			int k2 = 7;
			assertTrue(solution.canArrange(arr2, k2), "October1 Test case 2 failed.");
		}
		
		@Test
		void testWithNegativeNumbers() {
		    October01.Solution solution = new October01().new Solution();
		    int[] arr = {-10, 10};
		    int k = 2;
		    assertTrue(solution.canArrange(arr, k), "Test case with negative numbers failed");
		}

		@Test
		void testNotAllPairsMatch() {
		    October01.Solution solution = new October01().new Solution();
		    int[] arr = {1, 2, 3, 4, 5, 6};
		    int k = 7;
		    assertTrue(solution.canArrange(arr, k), "Test case with not all pairs matching failed");
		}

		@Test
		void testMixedPositiveAndNegative() {
		    October01.Solution solution = new October01().new Solution();
		    int[] arr = {-1, 1, -2, 2, -3, 3, -4, 4};
		    int k = 3;
		    assertTrue(solution.canArrange(arr, k), "Test case with mixed positive and negative numbers failed");
		}

		@Test
		void testAllZeros() {
		    October01.Solution solution = new October01().new Solution();
		    int[] arr = {0, 0, 0, 0};
		    int k = 1;
		    assertTrue(solution.canArrange(arr, k), "Test case with all zeros failed");
		}

		@Test
		void testLargeNumbers() {
		    October01.Solution solution = new October01().new Solution();
		    int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE};
		    int k = 4;
		    assertFalse(solution.canArrange(arr, k), "Test case with large numbers failed");
		}

		@Test
		void testSingleElement() {
		    October01.Solution solution = new October01().new Solution();
		    int[] arr = {5};
		    int k = 5;
		    assertFalse(solution.canArrange(arr, k), "Test case with a single element failed");
		}

		@Test
		void testPairCountsMismatch() {
		    October01.Solution solution = new October01().new Solution();
		    int[] arr = {1, 1, 2, 2, 3, 4};
		    int k = 3;
		    assertFalse(solution.canArrange(arr, k), "Test case with mismatched pair counts failed");
		}

		@Test
		void testLargeK() {
		    October01.Solution solution = new October01().new Solution();
		    int[] arr = {10, 20, 30, 40};
		    int k = 100;
		    assertFalse(solution.canArrange(arr, k), "Test case with large k failed");
		}
	}
	
	@Nested
    class October2Test {
        @Test
        void testEmptyArray() {
            October02.Solution solution = new October02().new Solution();
            int[] arr = {};
            assertArrayEquals(new int[]{}, solution.arrayRankTransform(arr), "Empty array failed");
        }

        @Test
        void testSingleElement() {
            October02.Solution solution = new October02().new Solution();
            int[] arr = {5};
            assertArrayEquals(new int[]{1}, solution.arrayRankTransform(arr), "Single element failed");
        }

        @Test
        void testAllElementsTheSame() {
            October02.Solution solution = new October02().new Solution();
            int[] arr = {100, 100, 100, 100};
            assertArrayEquals(new int[]{1, 1, 1, 1}, solution.arrayRankTransform(arr), "All elements the same failed");
        }

        @Test
        void testAlreadySortedArray() {
            October02.Solution solution = new October02().new Solution();
            int[] arr = {1, 2, 3, 4, 5};
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, solution.arrayRankTransform(arr), "Already sorted array failed");
        }

        @Test
        void testReverseSortedArray() {
            October02.Solution solution = new October02().new Solution();
            int[] arr = {5, 4, 3, 2, 1};
            assertArrayEquals(new int[]{5, 4, 3, 2, 1}, solution.arrayRankTransform(arr), "Reverse sorted array failed");
        }

        @Test
        void testMixedPositiveAndNegativeNumbers() {
            October02.Solution solution = new October02().new Solution();
            int[] arr = {-10, 0, 5, -20, 10};
            assertArrayEquals(new int[]{2, 3, 4, 1, 5}, solution.arrayRankTransform(arr), "Mixed positive and negative numbers failed");
        }

        @Test
        void testAllNegativeNumbers() {
            October02.Solution solution = new October02().new Solution();
            int[] arr = {-1, -2, -3, -4, -5};
            assertArrayEquals(new int[]{5, 4, 3, 2, 1}, solution.arrayRankTransform(arr), "All negative numbers failed");
        }

        @Test
        void testMaxAndMinIntegers() {
            October02.Solution solution = new October02().new Solution();
            int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
            assertArrayEquals(new int[]{3, 1, 2}, solution.arrayRankTransform(arr), "Max and Min integers failed");
        }

        @Test
        void testLargeNumberOfElements() {
            October02.Solution solution = new October02().new Solution();
            int[] arr = new int[1000];
            Arrays.fill(arr, 100); 
            int[] expected = new int[1000];
            Arrays.fill(expected, 1); 
            assertArrayEquals(expected, solution.arrayRankTransform(arr), "Large number of elements failed");
        }

        @Test
        void testRepeatedElementsInRandomOrder() {
            October02.Solution solution = new October02().new Solution();
            int[] arr = {10, 5, 5, 10, 20, 5};
            assertArrayEquals(new int[]{2, 1, 1, 2, 3, 1}, solution.arrayRankTransform(arr), "Repeated elements in random order failed");
        }
    }
	
	@Nested
	class October3Test {
		@Test
	    void testSumDivisibleByP() {
		    October03.Solution solution = new October03().new Solution();
		    int[] nums = {1, 2, 3, 4};
		    int p = 10;
		    assertEquals(0, solution.minSubarray(nums, p), "Sum divisible by p failed");
		}
		
		@Test
		void testNoValidSubarray() {
		    October03.Solution solution = new October03().new Solution();
		    int[] nums = {1, 2, 3};
		    int p = 7;
		    assertEquals(-1, solution.minSubarray(nums, p), "No valid subarray failed");
		}

		@Test
		void testSingleElement() {
		    October03.Solution solution = new October03().new Solution();
		    int[] nums = {5};
		    int p = 2;
		    assertEquals(-1, solution.minSubarray(nums, p), "Single element failed");
		}

		@Test
		void testLargeP() {
		    October03.Solution solution = new October03().new Solution();
		    int[] nums = {3, 1, 4, 1, 5, 9};
		    int p = 100;
		    assertEquals(-1, solution.minSubarray(nums, p), "Large p value failed");
		}

		@Test
		void testRemainderSubarray() {
		    October03.Solution solution = new October03().new Solution();
		    int[] nums = {3, 1, 4, 1, 5, 9};
		    int p = 7;
		    assertEquals(1, solution.minSubarray(nums, p), "Remainder subarray failed");
		}

		@Test
		void testAllElementsDivisibleByP() {
		    October03.Solution solution = new October03().new Solution();
		    int[] nums = {2, 4, 6, 8};
		    int p = 2;
		    assertEquals(0, solution.minSubarray(nums, p), "All elements divisible by p failed");
		}

		@Test
		void testSumEqualsP() {
		    October03.Solution solution = new October03().new Solution();
		    int[] nums = {5, 5, 5};
		    int p = 15;
		    assertEquals(0, solution.minSubarray(nums, p), "Sum equals p failed");
		}
		
		@Test
		void testAllZeros() {
		    October03.Solution solution = new October03().new Solution();
		    int[] nums = {0, 0, 0, 0};
		    int p = 5;
		    assertEquals(0, solution.minSubarray(nums, p), "All elements are zeroes failed");
		}

		@Test
		void testSubarrayRemovalAtBeginning() {
		    October03.Solution solution = new October03().new Solution();
		    int[] nums = {7, 6, 5, 1};
		    int p = 5;
		    assertEquals(-1, solution.minSubarray(nums, p), "Subarray removal at beginning failed");
		}

		@Test
		void testRemoveLastElement() {
		    October03.Solution solution = new October03().new Solution();
		    int[] nums = {1, 1, 1, 3};
		    int p = 2;
		    assertEquals(0, solution.minSubarray(nums, p), "Only last element removal failed");
		}
	}
	
	@Nested
	class October4Test {
		@Test
		public void testEvenPlayersBalanced() {
			October04.Solution solution = new October04().new Solution();
		    int[] skill = {2, 3, 3, 2};
		    long expected = 12;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testMinimumInputSizeValid() {
			October04.Solution solution = new October04().new Solution();
		    int[] skill = {1, 1};
		    long expected = 1;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testMinimumInputSizeInvalid() {
			October04.Solution solution = new October04().new Solution();
		    int[] skill = {1, 2};
		    long expected = 2;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testAllSameSkillLevel() {
			October04.Solution solution = new October04().new Solution();
		    int[] skill = {4, 4, 4, 4};
		    long expected = 32;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testMixedSkillsInvalidPairing() {
			October04.Solution solution = new October04().new Solution();
		    int[] skill = {1, 3, 3, 5};
		    long expected = 14;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testDescendingOrder() {
			October04.Solution solution = new October04().new Solution();
		    int[] skill = {10, 8, 6, 4};
		    long expected = 88;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testLargeDifferenceInvalid() {
			October04.Solution solution = new October04().new Solution();
		    int[] skill = {1, 2, 3, 10};
		    long expected = -1;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testEvenPlayersValid() {
			October04.Solution solution = new October04().new Solution();
		    int[] skill = {1, 2, 2, 3};
		    long expected = 7;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testHighSkillDifference() {
			October04.Solution solution = new October04().new Solution();
		    int[] skill = {1, 1, 100, 100};
		    long expected = 200;
		    assertEquals(expected, solution.dividePlayers(skill));
		}
	}
	
	@Nested
	class October5Test {
		@Test
		public void testBasicValidPermutation() {
			October05.Solution solution = new October05().new Solution();
		    String s1 = "ab";
		    String s2 = "eidbaooo";
		    boolean expected = true;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}
		
		@Test
		public void testNoPermutation() {
			October05.Solution solution = new October05().new Solution();
		    String s1 = "ab";
		    String s2 = "eidboaoo";
		    boolean expected = false;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}
		
		@Test
		public void testExactMatch() {
			October05.Solution solution = new October05().new Solution();
		    String s1 = "abc";
		    String s2 = "abc";
		    boolean expected = true;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}

		@Test
		public void testPermutationAtEnd() {
			October05.Solution solution = new October05().new Solution();
		    String s1 = "abc";
		    String s2 = "xyzzabc";
		    boolean expected = true;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}

		@Test
		public void testNoPermutationLargeString() {
			October05.Solution solution = new October05().new Solution();
		    String s1 = "ab";
		    String s2 = "eidbaoooooo";
		    boolean expected = true;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}

		@Test
		public void testSingleCharacterMatch() {
			October05.Solution solution = new October05().new Solution();
		    String s1 = "a";
		    String s2 = "a";
		    boolean expected = true;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}

		@Test
		public void testSingleCharacterNoMatch() {
			October05.Solution solution = new October05().new Solution();
		    String s1 = "a";
		    String s2 = "b";
		    boolean expected = false;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}

		@Test
		public void testPermutationInMiddle() {
			October05.Solution solution = new October05().new Solution();
		    String s1 = "ab";
		    String s2 = "xxbaxy";
		    boolean expected = true;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}
	}
	
	@Nested
	class October6Test {
		@Test
		public void testIdenticalSentences() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "I love programming";
		    String sentence2 = "I love programming";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testCompletelyDifferentSentences() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "I love programming";
		    String sentence2 = "She enjoys reading";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testSentencePrefix() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "I love programming";
		    String sentence2 = "I love";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testSentenceSuffix() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "I love programming";
		    String sentence2 = "love programming";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testOneWordCommonAtStart() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "Hello world";
		    String sentence2 = "Hello everyone";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testOneWordCommonAtEnd() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "I like apples";
		    String sentence2 = "She eats apples";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testPrefixAndSuffixMatch() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "I love programming in Java";
		    String sentence2 = "I love coding in Java";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testNoCommonWords() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "I love programming";
		    String sentence2 = "She hates running";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testFullMatchExceptMiddle() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "The quick brown fox jumps over the lazy dog";
		    String sentence2 = "The slow yellow fox jumps over the lazy dog";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testVeryShortSentencesNoMatch() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "Hi";
		    String sentence2 = "Bye";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testEmptySentences() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "";
		    String sentence2 = "";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testOneEmptySentence() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "";
		    String sentence2 = "Hello";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testSingleWordMatch() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "Hello";
		    String sentence2 = "Hello";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testLongSentencesNoMatch() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "The quick brown fox jumps over the lazy dog";
		    String sentence2 = "A fast black cat runs under the energetic dog";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testPrefixMatchOnly() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "This is a test sentence";
		    String sentence2 = "This is";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testSubstringInLongerSentence() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "love programming";
		    String sentence2 = "I really love programming languages";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testLargeDifferenceInLengthNoMatch() {
			October06.Solution solution = new October06().new Solution();
		    String sentence1 = "I love programming and I enjoy solving problems";
		    String sentence2 = "I love running";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}
	}
	
	@Nested
	class October7Test {
		@Test
		public void testBasicPairs() {
			October07.Solution solution = new October07().new Solution();
		    String s = "ABCD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testNoRemovablePairs() {
			October07.Solution solution = new October07().new Solution();
		    String s = "ACDB";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testMixedPairs() {
			October07.Solution solution = new October07().new Solution();
		    String s = "CABD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testSingleCharacter() {
			October07.Solution solution = new October07().new Solution();
		    String s = "A";
		    int expected = 1;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testEntireStringRemoved() {
			October07.Solution solution = new October07().new Solution();
		    String s = "ABABABCDCD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testSinglePairRestUnchanged() {
			October07.Solution solution = new October07().new Solution();
		    String s = "EFAB";
		    int expected = 2;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testLongStringMultiplePairs() {
			October07.Solution solution = new October07().new Solution();
		    String s = "ABABCDCDABCD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testNestedPairs() {
			October07.Solution solution = new October07().new Solution();
		    String s = "AABBCCDD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testNoABCD() {
			October07.Solution solution = new October07().new Solution();
		    String s = "XYZ";
		    int expected = 3;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testConsecutivePairs() {
			October07.Solution solution = new October07().new Solution();
		    String s = "AABBCCDD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testInterleavedNoAdjacent() {
			October07.Solution solution = new October07().new Solution();
		    String s = "ACBD";
		    int expected = 4;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testPairFormingAtDifferentPoints() {
			October07.Solution solution = new October07().new Solution();
		    String s = "AABBABCD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testStringWithNoValidPairs() {
			October07.Solution solution = new October07().new Solution();
		    String s = "ACDCBA";
		    int expected = 4;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testOnlyCDPairs() {
			October07.Solution solution = new October07().new Solution();
		    String s = "CCD";
		    int expected = 1;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testAlternatingValidInvalidPairs() {
			October07.Solution solution = new October07().new Solution();
		    String s = "ABCDDCBA";
		    int expected = 4;
		    assertEquals(expected, solution.minLength(s));
		}
	}
	
	@Nested
	class October8Test {
		@Test
		public void testBalancedBrackets() {
			October08.Solution solution = new October08().new Solution();
		    String s = "[]";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testOneSwapNeeded() {
			October08.Solution solution = new October08().new Solution();
		    String s = "][";
		    int expected = 1;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testLongBalancedString() {
			October08.Solution solution = new October08().new Solution();
		    String s = "[[]][]";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testMultipleSwapsNeeded() {
			October08.Solution solution = new October08().new Solution();
		    String s = "]]][[[";
		    int expected = 2;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testNestedBalancedBrackets() {
			October08.Solution solution = new October08().new Solution();
		    String s = "[[[]]]";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testLargeUnbalancedString() {
			October08.Solution solution = new October08().new Solution();
		    String s = "[]]]][[[[]";
		    int expected = 2;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testEmptyString() {
			October08.Solution solution = new October08().new Solution();
		    String s = "";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testAllClosingBrackets() {
			October08.Solution solution = new October08().new Solution();
		    String s = "]]]]";
		    int expected = 2;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testAllOpeningBrackets() {
			October08.Solution solution = new October08().new Solution();
		    String s = "[[[[";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testAlternatingBalancedBrackets() {
			October08.Solution solution = new October08().new Solution();
		    String s = "[]][[]";
		    int expected = 1;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testSingleBracket() {
			October08.Solution solution = new October08().new Solution();
		    String s = "[";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testLargeValidStringNoSwaps() {
			October08.Solution solution = new October08().new Solution();
		    String s = "[[]][[][]][]";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}
	}
	
	@Nested
	class October9Test {
		@Test
		public void testValidParentheses() {
			October09.Solution solution = new October09().new Solution();
		    String s = "()";
		    int expected = 0;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testAllOpenParentheses() {
			October09.Solution solution = new October09().new Solution();
		    String s = "((((";
		    int expected = 4;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testAllCloseParentheses() {
			October09.Solution solution = new October09().new Solution();
		    String s = "))))";
		    int expected = 4;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testMixedParenthesesNeedingAdditions() {
			October09.Solution solution = new October09().new Solution();
		    String s = "())";
		    int expected = 1;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testValidNestedParentheses() {
			October09.Solution solution = new October09().new Solution();
		    String s = "((()))";
		    int expected = 0;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testEmptyString() {
			October09.Solution solution = new October09().new Solution();
		    String s = "";
		    int expected = 0;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testAlternatingUnbalancedParentheses() {
			October09.Solution solution = new October09().new Solution();
		    String s = ")()(";
		    int expected = 2;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testBalancedSections() {
			October09.Solution solution = new October09().new Solution();
		    String s = "(()))(";
		    int expected = 2;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testNestedParenthesesNeedingAdditions() {
			October09.Solution solution = new October09().new Solution();
		    String s = "(((";
		    int expected = 3;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testOneSidedBalancedParentheses() {
			October09.Solution solution = new October09().new Solution();
		    String s = ")))(((";
		    int expected = 6;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testLongValidString() {
			October09.Solution solution = new October09().new Solution();
		    String s = "((()()()))";
		    int expected = 0;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testLongUnbalancedString() {
			October09.Solution solution = new October09().new Solution();
		    String s = "(()()(()";
		    int expected = 2;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testComplexUnbalancedCase() {
			October09.Solution solution = new October09().new Solution();
		    String s = "((())())(((()())())())(";
		    int expected = 1;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}
		
		@Test
		public void testNestedAndAlternatingUnbalanced() {
			October09.Solution solution = new October09().new Solution();
		    String s = "(())))((";
		    int expected = 4;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}
	}
	
	@Nested
	class October10Test {
		@Test
		public void testSimpleIncreasingArray() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {1, 2, 3, 4, 5};
		    int expected = 4;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}

		@Test
		public void testSimpleDecreasingArray() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {5, 4, 3, 2, 1};
		    int expected = 0;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}

		@Test
		public void testRandomArrayWithMultipleRamps() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {6, 0, 8, 2, 1, 5};
		    int expected = 4;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}

		@Test
		public void testAllEqualElements() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {7, 7, 7, 7};
		    int expected = 3;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}

		@Test
		public void testSingleElementArray() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {5};
		    int expected = 0;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}

		@Test
		public void testArrayWithNegativeNumbers() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {-4, -3, -2, -1};
		    int expected = 3;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}

		@Test
		public void testRampInTheMiddle() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {9, 8, 1, 0, 5, 6, 7};
		    int expected = 4;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}

		@Test
		public void testRampFromMinMaxValues() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {9, 4, 7, 2, 5, 3, 10};
		    int expected = 6;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}

		@Test
		public void testAlternatingValues() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {5, 1, 5, 1, 5, 1, 5};
		    int expected = 6;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}

		@Test
		public void testNoRampPossible() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {4, 3, 2, 5, 1};
		    int expected = 3;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}

		@Test
		public void testArrayWithFlatSection() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {4, 4, 4, 5, 1};
		    int expected = 3;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}

		@Test
		public void testLargeValidRamp() {
			October10.Solution solution = new October10().new Solution();
		    int[] nums = {5, 1, 2, 3, 4, 9};
		    int expected = 5;
		    assertEquals(expected, solution.maxWidthRamp(nums));
		}
	}
	
	@Nested
	class October11Test {
		@Test
		public void testBasicCase() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{1, 4}, {2, 5}, {3, 6}};
		    int targetFriend = 0;
		    int expected = 0;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}

		@Test
		public void testTargetFriendArrivesLast() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{1, 4}, {2, 5}, {3, 6}};
		    int targetFriend = 2;
		    int expected = 2;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}

		@Test
		public void testFriendsArriveSameTime() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{1, 4}, {1, 5}, {1, 6}};
		    int targetFriend = 1;
		    int expected = 1;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}

		@Test
		public void testFriendLeavingBeforeNextArrives() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{1, 4}, {4, 5}, {5, 6}};
		    int targetFriend = 1;
		    int expected = 0;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}

		@Test
		public void testAllFriendsSameDuration() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{1, 5}, {2, 6}, {3, 7}};
		    int targetFriend = 2;
		    int expected = 2;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}

		@Test
		public void testFriendArrivesAfterOthersLeft() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{1, 2}, {2, 3}, {3, 4}};
		    int targetFriend = 2;
		    int expected = 0;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}

		@Test
		public void testMultipleFriendsSameArrivalAndLeave() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{1, 4}, {1, 4}, {1, 4}};
		    int targetFriend = 2;
		    int expected = 2;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}

		@Test
		public void testTargetFriendArrivesInBetween() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{1, 5}, {3, 6}, {2, 7}};
		    int targetFriend = 1;
		    int expected = 2;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}

		@Test
		public void testTargetFriendArrivesFirstLeavesLast() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{1, 7}, {2, 5}, {3, 6}};
		    int targetFriend = 0;
		    int expected = 0;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}

		@Test
		public void testLargeGapBetweenFriends() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{1, 10}, {20, 25}, {30, 35}};
		    int targetFriend = 1;
		    int expected = 0;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}

		@Test
		public void testSingleFriend() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{5, 10}};
		    int targetFriend = 0;
		    int expected = 0;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}

		@Test
		public void testTargetFriendArrivesLastLeavesFirst() {
			October11.Solution solution = new October11().new Solution();
		    int[][] times = {{1, 7}, {2, 5}, {6, 7}};
		    int targetFriend = 2;
		    int expected = 1;
		    assertEquals(expected, solution.smallestChair(times, targetFriend));
		}
	}
	
	@Nested
	class October12Test {
		@Test
		public void testNoOverlappingIntervals() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 2}, {3, 4}, {5, 6}};
		    int expected = 1;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testAllIntervalsOverlap() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 5}, {2, 6}, {3, 7}};
		    int expected = 3;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testPartiallyOverlappingIntervals() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 3}, {2, 5}, {4, 6}};
		    int expected = 2;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testSingleInterval() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 2}};
		    int expected = 1;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testIntervalsSameStartAndEnd() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 3}, {1, 3}, {1, 3}};
		    int expected = 3;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testNestedIntervals() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 10}, {2, 9}, {3, 8}, {4, 7}};
		    int expected = 4;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testNonOverlappingFollowedByOverlap() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 2}, {3, 4}, {2, 5}};
		    int expected = 2;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testIntervalsWithLargeGaps() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 5}, {10, 15}, {20, 25}, {3, 8}};
		    int expected = 2;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testOverlappingEndSameTime() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 5}, {2, 5}, {3, 5}};
		    int expected = 3;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testRandomOverlappingIntervals() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 4}, {2, 3}, {5, 6}, {7, 8}};
		    int expected = 2;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testLargeNonOverlappingIntervals() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 1000}, {1001, 2000}, {2001, 3000}};
		    int expected = 1;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testZeroLengthIntervals() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 1}, {2, 2}, {3, 3}};
		    int expected = 1;
		    assertEquals(expected, solution.minGroups(intervals));
		}

		@Test
		public void testOverlappingStartingAtSamePoint() {
			October12.Solution solution = new October12().new Solution();
		    int[][] intervals = {{1, 3}, {1, 4}, {1, 5}};
		    int expected = 3;
		    assertEquals(expected, solution.minGroups(intervals));
		}	
	}
	
	@Nested
	class October13Test {
		@Test
		public void testBasicCase() {
		    List<List<Integer>> nums = Arrays.asList(
		        Arrays.asList(4, 10, 15, 24, 26),
		        Arrays.asList(0, 9, 12, 20),
		        Arrays.asList(5, 18, 22, 30)
		    );
		    October13.Solution solution = new October13().new Solution();
		    int[] expected = {20, 24};
		    assertArrayEquals(expected, solution.smallestRange(nums));
		}

		@Test
		public void testSingleElementLists() {
		    List<List<Integer>> nums = Arrays.asList(
		        Arrays.asList(1),
		        Arrays.asList(2),
		        Arrays.asList(3)
		    );
		    October13.Solution solution = new October13().new Solution();
		    int[] expected = {1, 3};
		    assertArrayEquals(expected, solution.smallestRange(nums));
		}

		@Test
		public void testOverlappingRangesWithDuplicates() {
		    List<List<Integer>> nums = Arrays.asList(
		        Arrays.asList(1, 5, 8),
		        Arrays.asList(2, 3, 7),
		        Arrays.asList(4, 5, 6)
		    );
		    October13.Solution solution = new October13().new Solution();
		    int[] expected = {3, 5};
		    assertArrayEquals(expected, solution.smallestRange(nums));
		}

		@Test
		public void testLargeNumbers() {
		    List<List<Integer>> nums = Arrays.asList(
		        Arrays.asList(1000000, 1000001),
		        Arrays.asList(999999, 1000002),
		        Arrays.asList(1000003, 1000004)
		    );
		    October13.Solution solution = new October13().new Solution();
		    int[] expected = {1000001, 1000003};
		    assertArrayEquals(expected, solution.smallestRange(nums));
		}

		@Test
		public void testIdenticalElements() {
		    List<List<Integer>> nums = Arrays.asList(
		        Arrays.asList(1, 1, 1),
		        Arrays.asList(1, 1, 1),
		        Arrays.asList(1, 1, 1)
		    );
		    October13.Solution solution = new October13().new Solution();
		    int[] expected = {1, 1};
		    assertArrayEquals(expected, solution.smallestRange(nums));
		}

		@Test
		public void testLargeGapBetweenRanges() {
		    List<List<Integer>> nums = Arrays.asList(
		        Arrays.asList(1, 2, 3),
		        Arrays.asList(100, 101, 102),
		        Arrays.asList(1000, 1001, 1002)
		    );
		    October13.Solution solution = new October13().new Solution();
		    int[] expected = {3, 1000};
		    assertArrayEquals(expected, solution.smallestRange(nums));
		}

		@Test
		public void testSmallOverlappingRange() {
		    List<List<Integer>> nums = Arrays.asList(
		        Arrays.asList(1, 5, 9),
		        Arrays.asList(4, 6, 8),
		        Arrays.asList(3, 7, 10)
		    );
		    October13.Solution solution = new October13().new Solution();
		    int[] expected = {3, 5};
		    assertArrayEquals(expected, solution.smallestRange(nums));
		}

		@Test
		public void testSingleListMultipleElements() {
		    List<List<Integer>> nums = Arrays.asList(
		        Arrays.asList(1, 2, 3, 4, 5)
		    );
		    October13.Solution solution = new October13().new Solution();
		    int[] expected = {1, 1};
		    assertArrayEquals(expected, solution.smallestRange(nums));
		}

		@Test
		public void testAlternatingHighLowValues() {
		    List<List<Integer>> nums = Arrays.asList(
		        Arrays.asList(1, 10),
		        Arrays.asList(2, 9),
		        Arrays.asList(3, 8)
		    );
		    October13.Solution solution = new October13().new Solution();
		    int[] expected = {1, 3};
		    assertArrayEquals(expected, solution.smallestRange(nums));
		}
	}
	
	@Nested
	class October14Test {
		 @Test
		public void testMaxKelements_AllSameValues() {
			October14.Solution solution = new October14().new Solution();
			int[] nums = {5, 5, 5, 5, 5};
			int k = 3;
			long expected = 15; 
			assertEquals(expected, solution.maxKelements(nums, k));
		}

		@Test
		public void testMaxKelements_LargeKWithMixedElements() {
			October14.Solution solution = new October14().new Solution();
			int[] nums = {1, 10, -1, -10, 20, -20};
			int k = 6; 
			long expected = 46; 
			assertEquals(expected, solution.maxKelements(nums, k));
		}

		@Test
		public void testMaxKelements_SingleElementArray() {
			October14.Solution solution = new October14().new Solution();
			int[] nums = {10};
			int k = 1;
			long expected = 10; 
			assertEquals(expected, solution.maxKelements(nums, k));
		}

		@Test
		public void testMaxKelements_KGreaterThanArraySize() {
			October14.Solution solution = new October14().new Solution();
			int[] nums = {7, 4, 2};
			int k = 5; 
			long expected = 18;
			assertEquals(expected, solution.maxKelements(nums, k));
		}

		@Test
		public void testMaxKelements_AllNegativeNumbers() {
			October14.Solution solution = new October14().new Solution();
			int[] nums = {-5, -10, -3, -8};
			int k = 2;
			long expected = -4; 
			assertEquals(expected, solution.maxKelements(nums, k));
		}

		@Test
		public void testMaxKelements_LargeValues() {
			October14.Solution solution = new October14().new Solution();
			int[] nums = {1000000000, 999999999, 888888888};
			int k = 2;
			long expected = 1999999999;
			assertEquals(expected, solution.maxKelements(nums, k));
		}

		@Test
		public void testMaxKelements_AllZeros() {
			October14.Solution solution = new October14().new Solution();
			int[] nums = {0, 0, 0, 0};
			int k = 4;
			long expected = 0;
			assertEquals(expected, solution.maxKelements(nums, k));
		}

		@Test
		public void testMaxKelements_KIsZero() {
			October14.Solution solution = new October14().new Solution();
			int[] nums = {8, 7, 6, 5};
			int k = 0;
			long expected = 0; 
			assertEquals(expected, solution.maxKelements(nums, k));
		}

		@Test
		public void testMaxKelements_SingleLargeElement() {
			October14.Solution solution = new October14().new Solution();
			int[] nums = {Integer.MAX_VALUE};
			int k = 1;
			long expected = (long) Integer.MAX_VALUE;
			assertEquals(expected, solution.maxKelements(nums, k));
		}

		@Test
		public void testMaxKelements_MixedPositiveAndNegative() {
			October14.Solution solution = new October14().new Solution();
			int[] nums = {10, -1, 5, -3, 7};
			int k = 3;
			long expected = 22; 
			assertEquals(expected, solution.maxKelements(nums, k));
		}
	}

	@Nested
	class October15Test {
		@Test
		public void testSimpleCaseWithOnesAndZeros() {
			October15.Solution solution = new October15().new Solution();
			String input = "101";
			long result = solution.minimumSteps(input);
			assertEquals(1, result, "Test case 1 failed.");
		}

		@Test
		public void testNoSwapsNeeded() {
			October15.Solution solution = new October15().new Solution();
			String input = "111000";
			long result = solution.minimumSteps(input);
			assertEquals(9, result, "Test case 2 failed.");
		}

		@Test
		public void testAllZeros() {
			October15.Solution solution = new October15().new Solution();
			String input = "000";
			long result = solution.minimumSteps(input);
			assertEquals(0, result, "Test case 3 failed.");
		}

		@Test
		public void testAllOnes() {
			October15.Solution solution = new October15().new Solution();
			String input = "111";
			long result = solution.minimumSteps(input);
			assertEquals(0, result, "Test case 4 failed.");
		}

		@Test
		public void testAlternatingOnesAndZeros() {
			October15.Solution solution = new October15().new Solution();
			String input = "010101";
			long result = solution.minimumSteps(input);
			assertEquals(3, result, "Test case 5 failed.");
		}

		@Test
		public void testMultipleZerosAfterOnes() {
			October15.Solution solution = new October15().new Solution();
			String input = "11000";
			long result = solution.minimumSteps(input);
			assertEquals(6, result, "Test case 6 failed.");
		}

		@Test
		public void testMultipleOnesAndZeros() {
			October15.Solution solution = new October15().new Solution();
			String input = "111000111";
			long result = solution.minimumSteps(input);
			assertEquals(9, result, "Test case 7 failed.");
		}

		@Test
		public void testSingleOne() {
			October15.Solution solution = new October15().new Solution();
			String input = "1";
			long result = solution.minimumSteps(input);
			assertEquals(0, result, "Test case 8 failed.");
		}

		@Test
		public void testSingleZero() {
			October15.Solution solution = new October15().new Solution();
			String input = "0";
			long result = solution.minimumSteps(input);
			assertEquals(0, result, "Test case 9 failed.");
		}

		@Test
		public void testLongStringAlternating() {
			October15.Solution solution = new October15().new Solution();
			String input = "1010101010101010";
			long result = solution.minimumSteps(input);
			assertEquals(36, result, "Test case 10 failed.");
		}
	}

	@Nested
	class October16Test {
		private boolean isValidDiverseString(String result) {
			for (int i = 0; i < result.length() - 2; i++) {
				if (result.charAt(i) == result.charAt(i + 1) && result.charAt(i) == result.charAt(i + 2)) {
					return false;
				}
			}
			return true;
		}
	
		private int countCharacter(String str, char ch) {
			int count = 0;
			for (char c : str.toCharArray()) {
				if (c == ch) {
					count++;
				}
			}
			return count;
		}

		@Test
		public void testEqualNumbers() {
			October16.Solution solution = new October16().new Solution();
			String result = solution.longestDiverseString(2, 2, 2);
			assertTrue(isValidDiverseString(result), "Test case 1 failed.");
		}
	
		@Test
		public void testMoreA() {
			October16.Solution solution = new October16().new Solution();
			String result = solution.longestDiverseString(7, 1, 0);
			assertTrue(isValidDiverseString(result), "Test case 2 failed.");
			assertEquals(1, countCharacter(result, 'b'), "Test case 2 character count failed.");
		}
	
		@Test
		public void testMoreB() {
			October16.Solution solution = new October16().new Solution();
			String result = solution.longestDiverseString(1, 7, 1);
			assertTrue(isValidDiverseString(result), "Test case 3 failed.");
		}
	
		@Test
		public void testMoreC() {
			October16.Solution solution = new October16().new Solution();
			String result = solution.longestDiverseString(0, 2, 5);
			assertTrue(isValidDiverseString(result), "Test case 4 failed.");
		}
	
		@Test
		public void testAllZeros() {
			October16.Solution solution = new October16().new Solution();
			String result = solution.longestDiverseString(0, 0, 0);
			assertEquals("", result, "Test case 5 failed.");
		}
	
		@Test
		public void testSingleA() {
			October16.Solution solution = new October16().new Solution();
			String result = solution.longestDiverseString(1, 0, 0);
			assertEquals("a", result, "Test case 6 failed.");
		}
	
		@Test
		public void testLargeInput() {
			October16.Solution solution = new October16().new Solution();
			String result = solution.longestDiverseString(100, 100, 100);
			assertTrue(isValidDiverseString(result), "Test case 7 failed.");
		}
	
		@Test
		public void testOnlyTwoCharacters() {
			October16.Solution solution = new October16().new Solution();
			String result = solution.longestDiverseString(0, 3, 5);
			assertTrue(isValidDiverseString(result), "Test case 8 failed.");
		}
	
		@Test
		public void testOnlyBAndC() {
			October16.Solution solution = new October16().new Solution();
			String result = solution.longestDiverseString(0, 6, 8);
			assertTrue(isValidDiverseString(result), "Test case 9 failed.");
		}
	
		@Test
		public void testLongAlternatingString() {
			October16.Solution solution = new October16().new Solution();
			String result = solution.longestDiverseString(50, 50, 50);
			assertTrue(isValidDiverseString(result), "Test case 10 failed.");
		}
	}

	@Nested
	class October17Test {
		@Test
		public void testSimpleSwap() {
			October17.Solution solution = new October17().new Solution();
			int result = solution.maximumSwap(2736);
			assertEquals(7236, result, "Test case 1 failed.");
		}

		@Test
		public void testNoSwapNeeded() {
			October17.Solution solution = new October17().new Solution();
			int result = solution.maximumSwap(9876);
			assertEquals(9876, result, "Test case 2 failed.");
		}

		@Test
		public void testSingleDigit() {
			October17.Solution solution = new October17().new Solution();
			int result = solution.maximumSwap(7);
			assertEquals(7, result, "Test case 3 failed.");
		}

		@Test
		public void testSameDigits() {
			October17.Solution solution = new October17().new Solution();
			int result = solution.maximumSwap(1111);
			assertEquals(1111, result, "Test case 4 failed.");
		}

		@Test
		public void testSwapLastDigits() {
			October17.Solution solution = new October17().new Solution();
			int result = solution.maximumSwap(1993);
			assertEquals(9913, result, "Test case 5 failed.");
		}

		@Test
		public void testSwapFirstDigits() {
			October17.Solution solution = new October17().new Solution();
			int result = solution.maximumSwap(9123);
			assertEquals(9321, result, "Test case 6 failed.");
		}

		@Test
		public void testLargeNumber() {
			October17.Solution solution = new October17().new Solution();
			int result = solution.maximumSwap(98368);
			assertEquals(98863, result, "Test case 7 failed.");
		}

		@Test
		public void testAlreadyLargestPossible() {
			October17.Solution solution = new October17().new Solution();
			int result = solution.maximumSwap(876543);
			assertEquals(876543, result, "Test case 8 failed.");
		}

		@Test
		public void testSwapMiddleDigits() {
			October17.Solution solution = new October17().new Solution();
			int result = solution.maximumSwap(12943);
			assertEquals(92143, result, "Test case 9 failed.");
		}

		@Test
		public void testSwapFirstAndLast() {
			October17.Solution solution = new October17().new Solution();
			int result = solution.maximumSwap(1342);
			assertEquals(4312, result, "Test case 10 failed.");
		}
	}

	@Nested
	class October18Test {
		@Test
		public void testSimpleCase() {
			October18.Solution solution = new October18().new Solution();
			int[] nums = {1, 2, 3};
			int result = solution.countMaxOrSubsets(nums);
			assertEquals(5, result, "Test case 1 failed.");
		}

		@Test
		public void testAllOnes() {
			October18.Solution solution = new October18().new Solution();
			int[] nums = {1, 1, 1};
			int result = solution.countMaxOrSubsets(nums);
			assertEquals(7, result, "Test case 2 failed.");
		}

		@Test
		public void testLargeORValue() {
			October18.Solution solution = new October18().new Solution();
			int[] nums = {3, 5, 7, 9};
			int result = solution.countMaxOrSubsets(nums);
			assertEquals(5, result, "Test case 3 failed.");
		}

		@Test
		public void testSingleElement() {
			October18.Solution solution = new October18().new Solution();
			int[] nums = {5};
			int result = solution.countMaxOrSubsets(nums);
			assertEquals(1, result, "Test case 4 failed.");
		}

		@Test
		public void testEmptyArray() {
			October18.Solution solution = new October18().new Solution();
			int[] nums = {};
			int result = solution.countMaxOrSubsets(nums);
			assertEquals(1, result, "Test case 5 failed.");
		}

		@Test
		public void testMultipleMaxOrSubsets() {
			October18.Solution solution = new October18().new Solution();
			int[] nums = {2, 3, 7};
			int result = solution.countMaxOrSubsets(nums);
			assertEquals(4, result, "Test case 6 failed.");
		}

		@Test
		public void testArrayWithZeros() {
			October18.Solution solution = new October18().new Solution();
			int[] nums = {0, 0, 0, 1};
			int result = solution.countMaxOrSubsets(nums);
			assertEquals(8, result, "Test case 7 failed.");
		}

		@Test
		public void testLargeInput() {
			October18.Solution solution = new October18().new Solution();
			int[] nums = {8, 1, 2, 12};
			int result = solution.countMaxOrSubsets(nums);
			assertEquals(2, result, "Test case 8 failed.");
		}

		@Test
		public void testArrayWithSameBits() {
			October18.Solution solution = new October18().new Solution();
			int[] nums = {7, 7, 7};
			int result = solution.countMaxOrSubsets(nums);
			assertEquals(7, result, "Test case 9 failed.");
		}

		@Test
		public void testComplexOR() {
			October18.Solution solution = new October18().new Solution();
			int[] nums = {5, 1, 3, 7};
			int result = solution.countMaxOrSubsets(nums);
			assertEquals(10, result, "Test case 10 failed.");
		}
	}

	@Nested
	class October19Test {
		@Test
		public void testBasicCase() {
			October19.Solution solution = new October19().new Solution();
			char result = solution.findKthBit(3, 1);
			assertEquals('0', result, "Test case 1 failed.");
		}
	
		@Test
		public void testKInMiddle() {
			October19.Solution solution = new October19().new Solution();
			char result = solution.findKthBit(4, 8);
			assertEquals('1', result, "Test case 2 failed.");
		}
	
		@Test
		public void testLastBit() {
			October19.Solution solution = new October19().new Solution();
			char result = solution.findKthBit(4, 15);
			assertEquals('1', result, "Test case 3 failed.");
		}
	
		@Test
		public void testFirstBit() {
			October19.Solution solution = new October19().new Solution();
			char result = solution.findKthBit(5, 1);
			assertEquals('0', result, "Test case 4 failed.");
		}
	
		@Test
		public void testKGreaterThanMiddle() {
			October19.Solution solution = new October19().new Solution();
			char result = solution.findKthBit(3, 5);
			assertEquals('0', result, "Test case 5 failed.");
		}
	
		@Test
		public void testMaximumN() {
			October19.Solution solution = new October19().new Solution();
			char result = solution.findKthBit(20, 524288);
			assertEquals('1', result, "Test case 6 failed.");
		}
	
		@Test
		public void testSmallestN() {
			October19.Solution solution = new October19().new Solution();
			char result = solution.findKthBit(1, 1);
			assertEquals('0', result, "Test case 7 failed.");
		}
	
		@Test
		public void testMiddleBitInN3() {
			October19.Solution solution = new October19().new Solution();
			char result = solution.findKthBit(3, 4);
			assertEquals('1', result, "Test case 8 failed.");
		}
	
		@Test
		public void testNearMiddle() {
			October19.Solution solution = new October19().new Solution();
			char result = solution.findKthBit(4, 7);
			assertEquals('1', result, "Test case 9 failed.");
		}
	
		@Test
		public void testLargeK() {
			October19.Solution solution = new October19().new Solution();
			char result = solution.findKthBit(10, 1000);
			assertEquals('1', result, "Test case 10 failed.");
		}
	}

	@Nested
	class October20Test {
		@Test
		public void testSingleTrue() {
			October20.Solution solution = new October20().new Solution();
			boolean result = solution.parseBoolExpr("t");
			assertTrue(result, "Test case 1 failed.");
		}
	
		@Test
		public void testSingleFalse() {
			October20.Solution solution = new October20().new Solution();
			boolean result = solution.parseBoolExpr("f");
			assertFalse(result, "Test case 2 failed.");
		}
	
		@Test
		public void testNegation() {
			October20.Solution solution = new October20().new Solution();
			boolean result = solution.parseBoolExpr("!(t)");
			assertFalse(result, "Test case 3 failed.");
		}
	
		@Test
		public void testDoubleNegation() {
			October20.Solution solution = new October20().new Solution();
			boolean result = solution.parseBoolExpr("!(f)");
			assertTrue(result, "Test case 4 failed.");
		}
	
		@Test
		public void testConjunction() {
			October20.Solution solution = new October20().new Solution();
			boolean result = solution.parseBoolExpr("&(t,t,f)");
			assertFalse(result, "Test case 5 failed.");
		}
	
		@Test
		public void testDisjunction() {
			October20.Solution solution = new October20().new Solution();
			boolean result = solution.parseBoolExpr("|(f,f,t)");
			assertTrue(result, "Test case 6 failed.");
		}
	
		@Test
		public void testNestedExpression() {
			October20.Solution solution = new October20().new Solution();
			boolean result = solution.parseBoolExpr("|(&(t,f,t),!(f),&(t)))");
			assertTrue(result, "Test case 7 failed.");
		}
	
		@Test
		public void testComplexExpression() {
			October20.Solution solution = new October20().new Solution();
			boolean result = solution.parseBoolExpr("&(|(t,f),!(f),&(t))");
			assertTrue(result, "Test case 8 failed.");
		}
	
		@Test
		public void testAllFalse() {
			October20.Solution solution = new October20().new Solution();
			boolean result = solution.parseBoolExpr("&(f,f,f)");
			assertFalse(result, "Test case 9 failed.");
		}
	
		@Test
		public void testAllTrue() {
			October20.Solution solution = new October20().new Solution();
			boolean result = solution.parseBoolExpr("&(t,t,t)");
			assertTrue(result, "Test case 10 failed.");
		}
	}

	@Nested
	class October21Test {
		@Test
		public void testSimpleCase() {
			October21.Solution solution = new October21().new Solution();
			int result = solution.maxUniqueSplit("abc");
			assertEquals(3, result, "Test case 1 failed.");
		}

		@Test
		public void testRepeatingCharacters() {
			October21.Solution solution = new October21().new Solution();
			int result = solution.maxUniqueSplit("aaaa");
			assertEquals(2, result, "Test case 2 failed.");
		}

		@Test
		public void testPalindrome() {
			October21.Solution solution = new October21().new Solution();
			int result = solution.maxUniqueSplit("abccba");
			assertEquals(4, result, "Test case 3 failed.");
		}

		@Test
		public void testAllUnique() {
			October21.Solution solution = new October21().new Solution();
			int result = solution.maxUniqueSplit("abcdef");
			assertEquals(6, result, "Test case 4 failed.");
		}

		@Test
		public void testRepeatedSubstringPattern() {
			October21.Solution solution = new October21().new Solution();
			int result = solution.maxUniqueSplit("ababab");
			assertEquals(4, result, "Test case 5 failed.");
		}

		@Test
		public void testLongString() {
			October21.Solution solution = new October21().new Solution();
			int result = solution.maxUniqueSplit("abcdefghijklm");
			assertEquals(13, result, "Test case 6 failed.");
		}

		@Test
		public void testSingleCharacter() {
			October21.Solution solution = new October21().new Solution();
			int result = solution.maxUniqueSplit("a");
			assertEquals(1, result, "Test case 7 failed.");
		}

		@Test
		public void testMultipleRepeatedSubstrings() {
			October21.Solution solution = new October21().new Solution();
			int result = solution.maxUniqueSplit("abcabc");
			assertEquals(4, result, "Test case 8 failed.");
		}

		@Test
		public void testEmptyString() {
			October21.Solution solution = new October21().new Solution();
			int result = solution.maxUniqueSplit("");
			assertEquals(0, result, "Test case 9 failed.");
		}

		@Test
		public void testLongRepeatingCharacters() {
			October21.Solution solution = new October21().new Solution();
			int result = solution.maxUniqueSplit("aaaaaaa");
			assertEquals(3, result, "Test case 10 failed.");
		}
	}

	@Nested
	class October22Test {
		@Test
		void testNullTree() {
			October22.Solution solution = new October22.Solution();
			assertEquals(-1, solution.kthLargestLevelSum(null, 1), "Should return -1 for a null tree.");
		}

		@Test
		void testSingleRootNode() {
			October22.Solution solution = new October22.Solution();
			October22.TreeNode root = new October22.TreeNode(10);
			assertEquals(10, solution.kthLargestLevelSum(root, 1), "The only level sum should be the value of the root.");
		}

		@Test
		void testRootWithTwoChildren() {
			October22.Solution solution = new October22.Solution();
			October22.TreeNode root = new October22.TreeNode(1);
			root.left = new TreeNode(2);
			root.right = new TreeNode(3);
			assertEquals(5, solution.kthLargestLevelSum(root, 1), "The largest level sum should be 5.");
			assertEquals(1, solution.kthLargestLevelSum(root, 2), "The second largest level sum should be the root level with value 1.");
		}

		@Test
		void testFullBinaryTreeDepth3() {
			October22.Solution solution = new October22.Solution();
			October22.TreeNode root = new October22.TreeNode(1);
			root.left = new TreeNode(2);
			root.right = new TreeNode(3);
			root.left.left = new TreeNode(4);
			root.left.right = new TreeNode(5);
			root.right.left = new TreeNode(6);
			root.right.right = new TreeNode(7);
			
			assertEquals(22, solution.kthLargestLevelSum(root, 1), "The largest level sum should be 22.");
			assertEquals(5, solution.kthLargestLevelSum(root, 2), "The second largest level sum should be 5.");
			assertEquals(1, solution.kthLargestLevelSum(root, 3), "The third largest level sum should be 1.");
		}

		@Test
		void testLeftSkewedTree() {
			October22.Solution solution = new October22.Solution();
			October22.TreeNode root = new October22.TreeNode(1);
			root.left = new TreeNode(2);
			root.left.left = new TreeNode(3);
			root.left.left.left = new TreeNode(4);
			
			assertEquals(4, solution.kthLargestLevelSum(root, 1), "The largest level sum should be 4.");
			assertEquals(3, solution.kthLargestLevelSum(root, 2), "The second largest level sum should be 3.");
			assertEquals(2, solution.kthLargestLevelSum(root, 3), "The third largest level sum should be 2.");
			assertEquals(1, solution.kthLargestLevelSum(root, 4), "The fourth largest level sum should be 1.");
		}

		@Test
		void testRightSkewedTree() {
			October22.Solution solution = new October22.Solution();
			October22.TreeNode root = new October22.TreeNode(1);
			root.right = new TreeNode(2);
			root.right.right = new TreeNode(3);
			root.right.right.right = new TreeNode(4);
			
			assertEquals(4, solution.kthLargestLevelSum(root, 1), "The largest level sum should be 4.");
			assertEquals(3, solution.kthLargestLevelSum(root, 2), "The second largest level sum should be 3.");
			assertEquals(2, solution.kthLargestLevelSum(root, 3), "The third largest level sum should be 2.");
			assertEquals(1, solution.kthLargestLevelSum(root, 4), "The fourth largest level sum should be 1.");
		}

		@Test
		void testKOutOfBounds() {
			October22.Solution solution = new October22.Solution();
			October22.TreeNode root = new October22.TreeNode(1);
			root.left = new TreeNode(2);
			root.right = new TreeNode(3);
			
			assertEquals(-1, solution.kthLargestLevelSum(root, 4), "Should return -1 when k is larger than the number of levels.");
		}

		@Test
		void testKEqualsNumberOfLevels() {
			October22.Solution solution = new October22.Solution();
			TreeNode root = new TreeNode(5);
			root.left = new TreeNode(6);
			root.right = new TreeNode(7);
			root.left.left = new TreeNode(8);
			
			assertEquals(5, solution.kthLargestLevelSum(root, 3), "Should return the smallest level sum when k equals the number of levels.");
		}

		void testComplexTreeWithMixedValues() {
            October22.Solution solution = new October22.Solution();
            
            TreeNode root = new TreeNode(5);
            root.left = new TreeNode(3);
            root.right = new TreeNode(8);
            root.left.left = new TreeNode(2);
            root.left.right = new TreeNode(4);
            root.right.left = new TreeNode(7);
            root.right.right = new TreeNode(10);
            
            assertEquals(25, solution.kthLargestLevelSum(root, 1), "The largest level sum should be 25.");
            assertEquals(11, solution.kthLargestLevelSum(root, 2), "The second largest level sum should be 11.");
            assertEquals(5, solution.kthLargestLevelSum(root, 3), "The third largest level sum should be 5.");
        }

		@Test
        void testTreeWithNegativeValues() {
            October22.Solution solution = new October22.Solution();
            
            TreeNode root = new TreeNode(-10);
            root.left = new TreeNode(-20);
            root.right = new TreeNode(-30);
            root.left.left = new TreeNode(-5);
            
            assertEquals(-5, solution.kthLargestLevelSum(root, 1), "The largest level sum should be -5.");
            assertEquals(-10, solution.kthLargestLevelSum(root, 2), "The second largest level sum should be -10.");
            assertEquals(-50, solution.kthLargestLevelSum(root, 3), "The third largest level sum should be -50.");
        }
	}

	@Nested
	public class October23Test {
		@Test
		public void testReplaceValueInTree_EmptyTree() {
			October23.Solution solution = new October23.Solution();
			TreeNode root = null;
			assertNull(solution.replaceValueInTree(root), "Should return null for an empty tree");
		}
	
		@Test
		public void testReplaceValueInTree_SingleNode() {
			October23.Solution solution = new October23.Solution();
			TreeNode root = new TreeNode(1);
			TreeNode result = solution.replaceValueInTree(root);
			assertEquals(0, result.val, "Single node value should be set to 0");
			assertNull(result.left, "Left child should be null");
			assertNull(result.right, "Right child should be null");
		}
	
		@Test
		public void testReplaceValueInTree_TwoLevelTree() {
			October23.Solution solution = new October23.Solution();
			TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
			TreeNode result = solution.replaceValueInTree(root);
	
			assertEquals(0, result.val, "Root node should have value 0");
			assertEquals(3, result.left.val, "Left child should have value 3");
			assertEquals(2, result.right.val, "Right child should have value 2");
		}
	
		@Test
		public void testReplaceValueInTree_MultipleLevels() {
			October23.Solution solution = new October23.Solution();
			TreeNode root = new TreeNode(1,
					new TreeNode(2, new TreeNode(4), new TreeNode(5)),
					new TreeNode(3, new TreeNode(6), new TreeNode(7))
			);
			TreeNode result = solution.replaceValueInTree(root);
	
			assertEquals(0, result.val, "Root node should have value 0");
			assertEquals(12, result.left.val, "Left child of root should have value 12");
			assertEquals(10, result.right.val, "Right child of root should have value 10");
			assertEquals(0, result.left.left.val, "Left-left grandchild should have value 0");
			assertEquals(0, result.left.right.val, "Left-right grandchild should have value 0");
			assertEquals(0, result.right.left.val, "Right-left grandchild should have value 0");
			assertEquals(0, result.right.right.val, "Right-right grandchild should have value 0");
		}
	
		@Test
		public void testReplaceValueInTree_UnbalancedTree() {
			October23.Solution solution = new October23.Solution();
			TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), null);
			TreeNode result = solution.replaceValueInTree(root);
	
			assertEquals(0, result.val, "Root node should have value 0");
			assertEquals(4, result.left.val, "Left child of root should have value 4");
			assertEquals(0, result.left.left.val, "Left-left grandchild should have value 0");
		}
	
		@Test
		public void testReplaceValueInTree_LargerTree() {
			October23.Solution solution = new October23.Solution();
			TreeNode root = new TreeNode(1,
					new TreeNode(2, new TreeNode(4, new TreeNode(8), null), new TreeNode(5)),
					new TreeNode(3, new TreeNode(6), new TreeNode(7, null, new TreeNode(9)))
			);
			TreeNode result = solution.replaceValueInTree(root);
	
			assertEquals(0, result.val, "Root node should have value 0");
			assertEquals(20, result.left.val, "Left child of root should have value 20");
			assertEquals(17, result.right.val, "Right child of root should have value 17");
			assertEquals(9, result.left.left.val, "Left-left grandchild should have value 9");
			assertEquals(8, result.left.right.val, "Left-right grandchild should have value 8");
			assertEquals(7, result.right.left.val, "Right-left grandchild should have value 7");
			assertEquals(0, result.right.right.val, "Right-right grandchild should have value 0");
		}
	}	

	@Nested
	class October24Test {
		@Test
		public void testFlipEquiv_BothNullTrees() {
			October24.Solution solution = new October24().new Solution();
			October24.TreeNode root1 = null;
			October24.TreeNode root2 = null;
			assertTrue(solution.flipEquiv(root1, root2), "Both trees are null, should return true");
		}

		@Test
		public void testFlipEquiv_OneNullTree() {
			October24.Solution solution = new October24().new Solution();
			TreeNode root1 = new TreeNode(1);
			TreeNode root2 = null;
			assertFalse(solution.flipEquiv(root1, root2), "One tree is null, should return false");
		}

		@Test
		public void testFlipEquiv_IdenticalTrees() {
			October24.Solution solution = new October24().new Solution();
			October24.TreeNode root1 = new October24().new TreeNode(1, new October24().new TreeNode(2), new October24().new TreeNode(3));
			October24.TreeNode root2 = new October24().new TreeNode(1, new TreeNode(2), new TreeNode(3));
			assertTrue(solution.flipEquiv(root1, root2), "Identical trees should be flip equivalent");
		}

		@Test
		public void testFlipEquiv_DifferentValuesAtRoot() {
			October24.Solution solution = new October24().new Solution();
			October24.TreeNode root1 = new October24().new TreeNode(1);
			October24.TreeNode root2 = new October24().new TreeNode(2);
			assertFalse(solution.flipEquiv(root1, root2), "Trees with different values at the root should return false");
		}

		@Test
		public void testFlipEquiv_MultipleLevelsWithNullNodes() {
			October24.Solution solution = new October24().new Solution();
			October24.TreeNode root1 = new October24().new TreeNode(1, new October24().new TreeNode(2), null);
			October24.TreeNode root2 = new October24().new TreeNode(1, null, new October24().new TreeNode(2));
			assertTrue(solution.flipEquiv(root1, root2), "Trees with null nodes in equivalent positions should return true");
		}

		@Test
		public void testFlipEquiv_AsymmetricTrees() {
			October24.Solution solution = new October24().new Solution();
			October24.TreeNode root1 = new October24().new TreeNode(1, new October24().new TreeNode(2), new October24().new TreeNode(3));
			October24.TreeNode root2 = new October24().new TreeNode(1, new October24().new TreeNode(3), null);
			assertFalse(solution.flipEquiv(root1, root2), "Asymmetric trees should return false");
		}

		@Test
		public void testFlipEquiv_FullTreeWithOneMissingLeaf() {
			October24.Solution solution = new October24().new Solution();
			October24.TreeNode root1 = new October24().new TreeNode(1,
				new October24().new TreeNode(2, new October24().new TreeNode(4), new October24().new TreeNode(5)),
				new October24().new TreeNode(3, new October24().new TreeNode(6), new October24().new TreeNode(7))
			);
			October24.TreeNode root2 = new October24().new TreeNode(1,
				new October24().new TreeNode(3, new October24().new TreeNode(6), null),
				new October24().new TreeNode(2, new October24().new TreeNode(4), new October24().new TreeNode(5))
			);
			assertFalse(solution.flipEquiv(root1, root2), "Trees where one is missing a leaf should return false");
		}

		@Test
		public void testFlipEquiv_TreeWithSingleChildFlip() {
			October24.Solution solution = new October24().new Solution();
			October24.TreeNode root1 = new October24().new TreeNode(1, new October24().new TreeNode(2), null);
			October24.TreeNode root2 = new October24().new TreeNode(1, null, new October24().new TreeNode(2));
			assertTrue(solution.flipEquiv(root1, root2), "Trees with a single child on opposite sides should return true");
		}

		@Test
		public void testFlipEquiv_LargeIdenticalStructureWithFlips() {
			October24.Solution solution = new October24().new Solution();
			October24.TreeNode root1 = new October24().new TreeNode(1,
				new October24().new TreeNode(2, new October24().new TreeNode(4), new October24().new TreeNode(5)),
				new October24().new TreeNode(3, new October24().new TreeNode(6), new October24().new TreeNode(7))
			);
			October24.TreeNode root2 = new October24().new TreeNode(1,
				new October24().new TreeNode(3, new October24().new TreeNode(7), new October24().new TreeNode(6)),
				new October24().new TreeNode(2, new October24().new TreeNode(5), new October24().new TreeNode(4))
			);
			assertTrue(solution.flipEquiv(root1, root2), "Larger trees with multiple flips should return true");
		}
	}

	@Nested
	class October25Test {
		@Test
		public void testRemoveSubfolders_BasicCase() {
			October25.Solution solution = new October25().new Solution();
			String[] folders = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
			List<String> expected = Arrays.asList("/a", "/c/d", "/c/f");
			assertEquals(expected, solution.removeSubfolders(folders), "Basic case with nested folders should return only top-level folders");
		}

		@Test
		public void testRemoveSubfolders_NoSubfolders() {
			October25.Solution solution = new October25().new Solution();
			String[] folders = {"/a", "/b", "/c"};
			List<String> expected = Arrays.asList("/a", "/b", "/c");
			assertEquals(expected, solution.removeSubfolders(folders), "If there are no subfolders, all folders should be returned");
		}

		@Test
		public void testRemoveSubfolders_AllSubfolders() {
			October25.Solution solution = new October25().new Solution();
			String[] folders = {"/a/b/c", "/a/b", "/a"};
			List<String> expected = Collections.singletonList("/a");
			assertEquals(expected, solution.removeSubfolders(folders), "If all folders are subfolders of the first one, only the top-level folder should be returned");
		}

		@Test
		public void testRemoveSubfolders_OverlappingFolderNames() {
			October25.Solution solution = new October25().new Solution();
			String[] folders = {"/a", "/a1", "/a/b", "/a1/b"};
			List<String> expected = Arrays.asList("/a", "/a1");
			assertEquals(expected, solution.removeSubfolders(folders), "Overlapping folder names should not affect removal of subfolders");
		}

		@Test
		public void testRemoveSubfolders_SingleFolder() {
			October25.Solution solution = new October25().new Solution();
			String[] folders = {"/a"};
			List<String> expected = Collections.singletonList("/a");
			assertEquals(expected, solution.removeSubfolders(folders), "Single folder should be returned as it has no subfolders");
		}

		@Test
		public void testRemoveSubfolders_MultipleNestedLevels() {
			October25.Solution solution = new October25().new Solution();
			String[] folders = {"/a", "/a/b", "/a/b/c", "/a/b/c/d", "/e", "/e/f"};
			List<String> expected = Arrays.asList("/a", "/e");
			assertEquals(expected, solution.removeSubfolders(folders), "Multiple nested levels should result in only top-level folders being returned");
		}

		@Test
		public void testRemoveSubfolders_FolderWithTrailingSlash() {
			October25.Solution solution = new October25().new Solution();
			String[] folders = {"/a", "/a/b/", "/a/b/c", "/a/b/c/"};
			List<String> expected = Collections.singletonList("/a");
			assertEquals(expected, solution.removeSubfolders(folders), "Trailing slashes should be ignored in determining subfolder relationships");
		}

		@Test
		public void testRemoveSubfolders_UnorderedFolders() {
			October25.Solution solution = new October25().new Solution();
			String[] folders = {"/c/d", "/a", "/c", "/c/d/e", "/a/b"};
			List<String> expected = Arrays.asList("/a", "/c");
			assertEquals(expected, solution.removeSubfolders(folders), "Unordered folders should still return only top-level folders");
		}

		@Test
		public void testRemoveSubfolders_MultipleRootFolders() {
			October25.Solution solution = new October25().new Solution();
			String[] folders = {"/a", "/a/b", "/b", "/b/c", "/c/d"};
			List<String> expected = Arrays.asList("/a", "/b", "/c/d");
			assertEquals(expected, solution.removeSubfolders(folders), "Multiple root folders should each return only their top-level or non-nested subfolder");
		}
	}
}
