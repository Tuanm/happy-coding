package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class SearchInsertPositionTest extends ProblemTest<SearchInsertPosition> {
    @ParameterizedTest
    @MethodSource("source")
    void testExamples(int[] nums, int target, int expected) {
        assertEquals(expected, problem.solve(nums, target));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(new int[] { 1, 3, 5, 6 }, 5, 2),
                Arguments.of(new int[] { 1, 3, 5, 6 }, 2, 1),
                Arguments.of(new int[] { 1, 3, 5, 6 }, 7, 4),
                Arguments.of(new int[] { 1 }, 5, 1),
                Arguments.of(new int[] { 1 }, 1, 0),
                Arguments.of(new int[0], 5, 0),
                Arguments.of(new int[] { 6 }, 5, 0));
    }
}
