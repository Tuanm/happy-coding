package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class ClimbingStairsTest extends ProblemTest<ClimbingStairs> {
    @Override
    protected ClimbingStairs problem() {
        return new ClimbingStairs();
    }

    @ParameterizedTest
    @MethodSource("source")
    void testExamples(int n, int expected) {
        assertEquals(expected, problem.solve(n));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(4, 5));
    }
}
