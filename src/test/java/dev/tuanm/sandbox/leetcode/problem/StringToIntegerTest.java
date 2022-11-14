package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class StringToIntegerTest extends ProblemTest<StringToInteger> {
    @Override
    protected StringToInteger problem() {
        return new StringToInteger();
    }

    @ParameterizedTest
    @MethodSource("source")
    void testExamples(String s, int expected) {
        assertEquals(expected, problem.solve(s));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("42", 42),
                Arguments.of("   -42", -42),
                Arguments.of("4193 with words", 4193),
                Arguments.of("-2147483647", -2147483647),
                Arguments.of("2147483648", 2147483647));
    }
}
