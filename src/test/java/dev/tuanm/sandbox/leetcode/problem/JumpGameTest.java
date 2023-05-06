package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

import static dev.tuanm.sandbox.leetcode.util.Creators.ints;

public class JumpGameTest extends ProblemTest<JumpGame> {
    @ParameterizedTest
    @MethodSource("source")
    void testExamples(int[] nums, boolean expected) {
        assertEquals(expected, problem.solve(nums));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(ints(0), true),
                Arguments.of(ints(2, 3, 1, 1, 4), true),
                Arguments.of(ints(3, 2, 1, 0, 4), false));
    }
}
