package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class RemoveDuplicatesFromSortedArrayTest extends ProblemTest<RemoveDuplicatesFromSortedArray> {
    @ParameterizedTest
    @MethodSource("source")
    void testExamples(int[] nums, int k, int[] expected) {
        assertEquals(k, problem.solve(nums));
        for (int i = 0; i < k; i++) {
            assertEquals(expected[i], nums[i]);
        }
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(new int[] { 1, 1, 2 }, 2, new int[] { 1, 2 }),
                Arguments.of(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }, 5, new int[] { 0, 1, 2, 3, 4 }));
    }
}
