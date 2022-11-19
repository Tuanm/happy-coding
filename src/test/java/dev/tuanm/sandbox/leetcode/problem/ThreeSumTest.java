package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class ThreeSumTest extends ProblemTest<ThreeSum> {
    @Override
    protected ThreeSum problem() {
        return new ThreeSum();
    }

    @ParameterizedTest
    @MethodSource("source")
    void testExamples(int[] nums, List<List<Integer>> expected) {
        assertEquals(expected, problem.solve(nums));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(new int[] { -1, 0, 1, 2, -1, -4 }, Arrays.asList(
                        Arrays.asList(-1, -1, 2),
                        Arrays.asList(-1, 0, 1))),
                Arguments.of(new int[] { 0, 1, 1 }, Arrays.asList()),
                Arguments.of(new int[] { 0, 0, 0 }, Arrays.asList(
                        Arrays.asList(0, 0, 0))));
    }
}
