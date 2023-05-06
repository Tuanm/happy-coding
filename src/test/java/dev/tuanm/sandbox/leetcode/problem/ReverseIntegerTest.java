package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class ReverseIntegerTest extends ProblemTest<ReverseInteger> {
    @ParameterizedTest
    @MethodSource("source")
    void testExamples(int x, int expected) {
        assertEquals(expected, problem.solve(x));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(120, 21),
                Arguments.of(1234567899, 0));
    }
}
