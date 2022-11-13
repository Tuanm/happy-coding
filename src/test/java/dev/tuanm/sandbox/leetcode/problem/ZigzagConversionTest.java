package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class ZigzagConversionTest extends ProblemTest<ZigzagConversion> {
    @Override
    protected ZigzagConversion problem() {
        return new ZigzagConversion();
    }

    @ParameterizedTest
    @MethodSource("source")
    void testExamples(String s, int numRows, String expected) {
        assertEquals(expected, problem.solve(s, numRows));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
                Arguments.of("PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
                Arguments.of("A", 1, "A"));
    }
}
