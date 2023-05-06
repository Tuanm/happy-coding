package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class LongestSubstringWithoutRepeatingCharactersTest
        extends ProblemTest<LongestSubstringWithoutRepeatingCharacters> {
    @ParameterizedTest
    @MethodSource("source")
    void testExamples(String s, int expected) {
        assertEquals(expected, problem.solve(s));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
                Arguments.of("au", 2),
                Arguments.of("dvdf", 3));
    }
}
