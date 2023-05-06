package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class LongestPalindromicSubstringTest extends ProblemTest<LongestPalindromicSubstring> {
    @ParameterizedTest
    @MethodSource("source")
    void testExamples(String s, String expected) {
        assertEquals(expected, problem.solve(s));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("babad", "bab"),
                Arguments.of("cbbd", "bb"),
                Arguments.of("bb", "bb"),
                Arguments.of("ccc", "ccc"));
    }
}
