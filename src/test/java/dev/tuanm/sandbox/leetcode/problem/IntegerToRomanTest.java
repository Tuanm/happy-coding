package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class IntegerToRomanTest extends ProblemTest<IntegerToRoman> {
    @Override
    protected IntegerToRoman problem() {
        return new IntegerToRoman();
    }

    @ParameterizedTest
    @MethodSource("source")
    void testExamples(int num, String expected) {
        assertEquals(expected, problem.solve(num));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(3, "III"),
                Arguments.of(58, "LVIII"),
                Arguments.of(1994, "MCMXCIV"));
    }
}
