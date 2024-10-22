package testing;

import DailyQuestions.*;
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
			October1.Solution solution = new October1().new Solution();
			int[] arr1 = {1, 2, 3, 4, 5, 10, 6, 7, 8, 9};
			int k1 = 5;
			assertTrue(solution.canArrange(arr1, k1), "October1 Test case 1 failed.");
		}
		
		@Test
		void testNoPairs() {
			October1.Solution solution = new October1().new Solution();		
			int[] arr2 = {1, 2, 3, 4, 5, 6};
			int k2 = 7;
			assertTrue(solution.canArrange(arr2, k2), "October1 Test case 2 failed.");
		}
		
		@Test
		void testWithNegativeNumbers() {
		    October1.Solution solution = new October1().new Solution();
		    int[] arr = {-10, 10};
		    int k = 2;
		    assertTrue(solution.canArrange(arr, k), "Test case with negative numbers failed");
		}

		@Test
		void testNotAllPairsMatch() {
		    October1.Solution solution = new October1().new Solution();
		    int[] arr = {1, 2, 3, 4, 5, 6};
		    int k = 7;
		    assertTrue(solution.canArrange(arr, k), "Test case with not all pairs matching failed");
		}

		@Test
		void testMixedPositiveAndNegative() {
		    October1.Solution solution = new October1().new Solution();
		    int[] arr = {-1, 1, -2, 2, -3, 3, -4, 4};
		    int k = 3;
		    assertTrue(solution.canArrange(arr, k), "Test case with mixed positive and negative numbers failed");
		}

		@Test
		void testAllZeros() {
		    October1.Solution solution = new October1().new Solution();
		    int[] arr = {0, 0, 0, 0};
		    int k = 1;
		    assertTrue(solution.canArrange(arr, k), "Test case with all zeros failed");
		}

		@Test
		void testLargeNumbers() {
		    October1.Solution solution = new October1().new Solution();
		    int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE};
		    int k = 4;
		    assertFalse(solution.canArrange(arr, k), "Test case with large numbers failed");
		}

		@Test
		void testSingleElement() {
		    October1.Solution solution = new October1().new Solution();
		    int[] arr = {5};
		    int k = 5;
		    assertFalse(solution.canArrange(arr, k), "Test case with a single element failed");
		}

		@Test
		void testPairCountsMismatch() {
		    October1.Solution solution = new October1().new Solution();
		    int[] arr = {1, 1, 2, 2, 3, 4};
		    int k = 3;
		    assertFalse(solution.canArrange(arr, k), "Test case with mismatched pair counts failed");
		}

		@Test
		void testLargeK() {
		    October1.Solution solution = new October1().new Solution();
		    int[] arr = {10, 20, 30, 40};
		    int k = 100;
		    assertFalse(solution.canArrange(arr, k), "Test case with large k failed");
		}
	}
	
	@Nested
    class October2Test {
        @Test
        void testEmptyArray() {
            October2.Solution solution = new October2().new Solution();
            int[] arr = {};
            assertArrayEquals(new int[]{}, solution.arrayRankTransform(arr), "Empty array failed");
        }

        @Test
        void testSingleElement() {
            October2.Solution solution = new October2().new Solution();
            int[] arr = {5};
            assertArrayEquals(new int[]{1}, solution.arrayRankTransform(arr), "Single element failed");
        }

        @Test
        void testAllElementsTheSame() {
            October2.Solution solution = new October2().new Solution();
            int[] arr = {100, 100, 100, 100};
            assertArrayEquals(new int[]{1, 1, 1, 1}, solution.arrayRankTransform(arr), "All elements the same failed");
        }

        @Test
        void testAlreadySortedArray() {
            October2.Solution solution = new October2().new Solution();
            int[] arr = {1, 2, 3, 4, 5};
            assertArrayEquals(new int[]{1, 2, 3, 4, 5}, solution.arrayRankTransform(arr), "Already sorted array failed");
        }

        @Test
        void testReverseSortedArray() {
            October2.Solution solution = new October2().new Solution();
            int[] arr = {5, 4, 3, 2, 1};
            assertArrayEquals(new int[]{5, 4, 3, 2, 1}, solution.arrayRankTransform(arr), "Reverse sorted array failed");
        }

        @Test
        void testMixedPositiveAndNegativeNumbers() {
            October2.Solution solution = new October2().new Solution();
            int[] arr = {-10, 0, 5, -20, 10};
            assertArrayEquals(new int[]{2, 3, 4, 1, 5}, solution.arrayRankTransform(arr), "Mixed positive and negative numbers failed");
        }

        @Test
        void testAllNegativeNumbers() {
            October2.Solution solution = new October2().new Solution();
            int[] arr = {-1, -2, -3, -4, -5};
            assertArrayEquals(new int[]{5, 4, 3, 2, 1}, solution.arrayRankTransform(arr), "All negative numbers failed");
        }

        @Test
        void testMaxAndMinIntegers() {
            October2.Solution solution = new October2().new Solution();
            int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
            assertArrayEquals(new int[]{3, 1, 2}, solution.arrayRankTransform(arr), "Max and Min integers failed");
        }

        @Test
        void testLargeNumberOfElements() {
            October2.Solution solution = new October2().new Solution();
            int[] arr = new int[1000];
            Arrays.fill(arr, 100); 
            int[] expected = new int[1000];
            Arrays.fill(expected, 1); 
            assertArrayEquals(expected, solution.arrayRankTransform(arr), "Large number of elements failed");
        }

        @Test
        void testRepeatedElementsInRandomOrder() {
            October2.Solution solution = new October2().new Solution();
            int[] arr = {10, 5, 5, 10, 20, 5};
            assertArrayEquals(new int[]{2, 1, 1, 2, 3, 1}, solution.arrayRankTransform(arr), "Repeated elements in random order failed");
        }
    }
	
	@Nested
	class October3Test {
		@Test
	    void testSumDivisibleByP() {
		    October3.Solution solution = new October3().new Solution();
		    int[] nums = {1, 2, 3, 4};
		    int p = 10;
		    assertEquals(0, solution.minSubarray(nums, p), "Sum divisible by p failed");
		}
		
		@Test
		void testNoValidSubarray() {
		    October3.Solution solution = new October3().new Solution();
		    int[] nums = {1, 2, 3};
		    int p = 7;
		    assertEquals(-1, solution.minSubarray(nums, p), "No valid subarray failed");
		}

		@Test
		void testSingleElement() {
		    October3.Solution solution = new October3().new Solution();
		    int[] nums = {5};
		    int p = 2;
		    assertEquals(-1, solution.minSubarray(nums, p), "Single element failed");
		}

		@Test
		void testLargeP() {
		    October3.Solution solution = new October3().new Solution();
		    int[] nums = {3, 1, 4, 1, 5, 9};
		    int p = 100;
		    assertEquals(-1, solution.minSubarray(nums, p), "Large p value failed");
		}

		@Test
		void testRemainderSubarray() {
		    October3.Solution solution = new October3().new Solution();
		    int[] nums = {3, 1, 4, 1, 5, 9};
		    int p = 7;
		    assertEquals(1, solution.minSubarray(nums, p), "Remainder subarray failed");
		}

		@Test
		void testAllElementsDivisibleByP() {
		    October3.Solution solution = new October3().new Solution();
		    int[] nums = {2, 4, 6, 8};
		    int p = 2;
		    assertEquals(0, solution.minSubarray(nums, p), "All elements divisible by p failed");
		}

		@Test
		void testSumEqualsP() {
		    October3.Solution solution = new October3().new Solution();
		    int[] nums = {5, 5, 5};
		    int p = 15;
		    assertEquals(0, solution.minSubarray(nums, p), "Sum equals p failed");
		}
		
		@Test
		void testAllZeros() {
		    October3.Solution solution = new October3().new Solution();
		    int[] nums = {0, 0, 0, 0};
		    int p = 5;
		    assertEquals(0, solution.minSubarray(nums, p), "All elements are zeroes failed");
		}

		@Test
		void testSubarrayRemovalAtBeginning() {
		    October3.Solution solution = new October3().new Solution();
		    int[] nums = {7, 6, 5, 1};
		    int p = 5;
		    assertEquals(-1, solution.minSubarray(nums, p), "Subarray removal at beginning failed");
		}

		@Test
		void testRemoveLastElement() {
		    October3.Solution solution = new October3().new Solution();
		    int[] nums = {1, 1, 1, 3};
		    int p = 2;
		    assertEquals(0, solution.minSubarray(nums, p), "Only last element removal failed");
		}
	}
	
	@Nested
	class October4Test {
		@Test
		public void testEvenPlayersBalanced() {
			October4.Solution solution = new October4().new Solution();
		    int[] skill = {2, 3, 3, 2};
		    long expected = 12;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testMinimumInputSizeValid() {
			October4.Solution solution = new October4().new Solution();
		    int[] skill = {1, 1};
		    long expected = 1;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testMinimumInputSizeInvalid() {
			October4.Solution solution = new October4().new Solution();
		    int[] skill = {1, 2};
		    long expected = 2;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testAllSameSkillLevel() {
			October4.Solution solution = new October4().new Solution();
		    int[] skill = {4, 4, 4, 4};
		    long expected = 32;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testMixedSkillsInvalidPairing() {
			October4.Solution solution = new October4().new Solution();
		    int[] skill = {1, 3, 3, 5};
		    long expected = 14;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testDescendingOrder() {
			October4.Solution solution = new October4().new Solution();
		    int[] skill = {10, 8, 6, 4};
		    long expected = 88;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testLargeDifferenceInvalid() {
			October4.Solution solution = new October4().new Solution();
		    int[] skill = {1, 2, 3, 10};
		    long expected = -1;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testEvenPlayersValid() {
			October4.Solution solution = new October4().new Solution();
		    int[] skill = {1, 2, 2, 3};
		    long expected = 7;
		    assertEquals(expected, solution.dividePlayers(skill));
		}

		@Test
		public void testHighSkillDifference() {
			October4.Solution solution = new October4().new Solution();
		    int[] skill = {1, 1, 100, 100};
		    long expected = 200;
		    assertEquals(expected, solution.dividePlayers(skill));
		}
	}
	
	@Nested
	class October5Test {
		@Test
		public void testBasicValidPermutation() {
			October5.Solution solution = new October5().new Solution();
		    String s1 = "ab";
		    String s2 = "eidbaooo";
		    boolean expected = true;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}
		
		@Test
		public void testNoPermutation() {
			October5.Solution solution = new October5().new Solution();
		    String s1 = "ab";
		    String s2 = "eidboaoo";
		    boolean expected = false;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}
		
		@Test
		public void testExactMatch() {
			October5.Solution solution = new October5().new Solution();
		    String s1 = "abc";
		    String s2 = "abc";
		    boolean expected = true;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}

		@Test
		public void testPermutationAtEnd() {
			October5.Solution solution = new October5().new Solution();
		    String s1 = "abc";
		    String s2 = "xyzzabc";
		    boolean expected = true;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}

		@Test
		public void testNoPermutationLargeString() {
			October5.Solution solution = new October5().new Solution();
		    String s1 = "ab";
		    String s2 = "eidbaoooooo";
		    boolean expected = true;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}

		@Test
		public void testSingleCharacterMatch() {
			October5.Solution solution = new October5().new Solution();
		    String s1 = "a";
		    String s2 = "a";
		    boolean expected = true;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}

		@Test
		public void testSingleCharacterNoMatch() {
			October5.Solution solution = new October5().new Solution();
		    String s1 = "a";
		    String s2 = "b";
		    boolean expected = false;
		    assertEquals(expected, solution.checkInclusion(s1, s2));
		}

		@Test
		public void testPermutationInMiddle() {
			October5.Solution solution = new October5().new Solution();
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
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "I love programming";
		    String sentence2 = "I love programming";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testCompletelyDifferentSentences() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "I love programming";
		    String sentence2 = "She enjoys reading";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testSentencePrefix() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "I love programming";
		    String sentence2 = "I love";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testSentenceSuffix() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "I love programming";
		    String sentence2 = "love programming";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testOneWordCommonAtStart() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "Hello world";
		    String sentence2 = "Hello everyone";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testOneWordCommonAtEnd() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "I like apples";
		    String sentence2 = "She eats apples";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testPrefixAndSuffixMatch() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "I love programming in Java";
		    String sentence2 = "I love coding in Java";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testNoCommonWords() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "I love programming";
		    String sentence2 = "She hates running";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testFullMatchExceptMiddle() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "The quick brown fox jumps over the lazy dog";
		    String sentence2 = "The slow yellow fox jumps over the lazy dog";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testVeryShortSentencesNoMatch() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "Hi";
		    String sentence2 = "Bye";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testEmptySentences() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "";
		    String sentence2 = "";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testOneEmptySentence() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "";
		    String sentence2 = "Hello";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testSingleWordMatch() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "Hello";
		    String sentence2 = "Hello";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testLongSentencesNoMatch() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "The quick brown fox jumps over the lazy dog";
		    String sentence2 = "A fast black cat runs under the energetic dog";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testPrefixMatchOnly() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "This is a test sentence";
		    String sentence2 = "This is";
		    boolean expected = true;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testSubstringInLongerSentence() {
			October6.Solution solution = new October6().new Solution();
		    String sentence1 = "love programming";
		    String sentence2 = "I really love programming languages";
		    boolean expected = false;
		    assertEquals(expected, solution.areSentencesSimilar(sentence1, sentence2));
		}

		@Test
		public void testLargeDifferenceInLengthNoMatch() {
			October6.Solution solution = new October6().new Solution();
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
			October7.Solution solution = new October7().new Solution();
		    String s = "ABCD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testNoRemovablePairs() {
			October7.Solution solution = new October7().new Solution();
		    String s = "ACDB";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testMixedPairs() {
			October7.Solution solution = new October7().new Solution();
		    String s = "CABD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testSingleCharacter() {
			October7.Solution solution = new October7().new Solution();
		    String s = "A";
		    int expected = 1;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testEntireStringRemoved() {
			October7.Solution solution = new October7().new Solution();
		    String s = "ABABABCDCD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testSinglePairRestUnchanged() {
			October7.Solution solution = new October7().new Solution();
		    String s = "EFAB";
		    int expected = 2;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testLongStringMultiplePairs() {
			October7.Solution solution = new October7().new Solution();
		    String s = "ABABCDCDABCD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testNestedPairs() {
			October7.Solution solution = new October7().new Solution();
		    String s = "AABBCCDD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testNoABCD() {
			October7.Solution solution = new October7().new Solution();
		    String s = "XYZ";
		    int expected = 3;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testConsecutivePairs() {
			October7.Solution solution = new October7().new Solution();
		    String s = "AABBCCDD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testInterleavedNoAdjacent() {
			October7.Solution solution = new October7().new Solution();
		    String s = "ACBD";
		    int expected = 4;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testPairFormingAtDifferentPoints() {
			October7.Solution solution = new October7().new Solution();
		    String s = "AABBABCD";
		    int expected = 0;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testStringWithNoValidPairs() {
			October7.Solution solution = new October7().new Solution();
		    String s = "ACDCBA";
		    int expected = 4;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testOnlyCDPairs() {
			October7.Solution solution = new October7().new Solution();
		    String s = "CCD";
		    int expected = 1;
		    assertEquals(expected, solution.minLength(s));
		}

		@Test
		public void testAlternatingValidInvalidPairs() {
			October7.Solution solution = new October7().new Solution();
		    String s = "ABCDDCBA";
		    int expected = 4;
		    assertEquals(expected, solution.minLength(s));
		}
	}
	
	@Nested
	class October8Test {
		@Test
		public void testBalancedBrackets() {
			October8.Solution solution = new October8().new Solution();
		    String s = "[]";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testOneSwapNeeded() {
			October8.Solution solution = new October8().new Solution();
		    String s = "][";
		    int expected = 1;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testLongBalancedString() {
			October8.Solution solution = new October8().new Solution();
		    String s = "[[]][]";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testMultipleSwapsNeeded() {
			October8.Solution solution = new October8().new Solution();
		    String s = "]]][[[";
		    int expected = 2;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testNestedBalancedBrackets() {
			October8.Solution solution = new October8().new Solution();
		    String s = "[[[]]]";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testLargeUnbalancedString() {
			October8.Solution solution = new October8().new Solution();
		    String s = "[]]]][[[[]";
		    int expected = 2;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testEmptyString() {
			October8.Solution solution = new October8().new Solution();
		    String s = "";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testAllClosingBrackets() {
			October8.Solution solution = new October8().new Solution();
		    String s = "]]]]";
		    int expected = 2;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testAllOpeningBrackets() {
			October8.Solution solution = new October8().new Solution();
		    String s = "[[[[";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testAlternatingBalancedBrackets() {
			October8.Solution solution = new October8().new Solution();
		    String s = "[]][[]";
		    int expected = 1;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testSingleBracket() {
			October8.Solution solution = new October8().new Solution();
		    String s = "[";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}

		@Test
		public void testLargeValidStringNoSwaps() {
			October8.Solution solution = new October8().new Solution();
		    String s = "[[]][[][]][]";
		    int expected = 0;
		    assertEquals(expected, solution.minSwaps(s));
		}
	}
	
	@Nested
	class October9Test {
		@Test
		public void testValidParentheses() {
			October9.Solution solution = new October9().new Solution();
		    String s = "()";
		    int expected = 0;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testAllOpenParentheses() {
			October9.Solution solution = new October9().new Solution();
		    String s = "((((";
		    int expected = 4;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testAllCloseParentheses() {
			October9.Solution solution = new October9().new Solution();
		    String s = "))))";
		    int expected = 4;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testMixedParenthesesNeedingAdditions() {
			October9.Solution solution = new October9().new Solution();
		    String s = "())";
		    int expected = 1;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testValidNestedParentheses() {
			October9.Solution solution = new October9().new Solution();
		    String s = "((()))";
		    int expected = 0;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testEmptyString() {
			October9.Solution solution = new October9().new Solution();
		    String s = "";
		    int expected = 0;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testAlternatingUnbalancedParentheses() {
			October9.Solution solution = new October9().new Solution();
		    String s = ")()(";
		    int expected = 2;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testBalancedSections() {
			October9.Solution solution = new October9().new Solution();
		    String s = "(()))(";
		    int expected = 2;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testNestedParenthesesNeedingAdditions() {
			October9.Solution solution = new October9().new Solution();
		    String s = "(((";
		    int expected = 3;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testOneSidedBalancedParentheses() {
			October9.Solution solution = new October9().new Solution();
		    String s = ")))(((";
		    int expected = 6;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testLongValidString() {
			October9.Solution solution = new October9().new Solution();
		    String s = "((()()()))";
		    int expected = 0;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testLongUnbalancedString() {
			October9.Solution solution = new October9().new Solution();
		    String s = "(()()(()";
		    int expected = 2;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}

		@Test
		public void testComplexUnbalancedCase() {
			October9.Solution solution = new October9().new Solution();
		    String s = "((())())(((()())())())(";
		    int expected = 1;
		    assertEquals(expected, solution.minAddToMakeValid(s));
		}
		
		@Test
		public void testNestedAndAlternatingUnbalanced() {
			October9.Solution solution = new October9().new Solution();
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
}
