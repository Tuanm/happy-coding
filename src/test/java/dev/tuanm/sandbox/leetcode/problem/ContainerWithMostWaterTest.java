package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class ContainerWithMostWaterTest extends ProblemTest<ContainerWithMostWater> {
    @Override
    protected ContainerWithMostWater problem() {
        return new ContainerWithMostWater();
    }

    @ParameterizedTest
    @MethodSource("source")
    void testExamples(int[] height, int expected) {
        assertEquals(expected, problem.solve(height));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }, 49),
                Arguments.of(new int[] { 1, 1 }, 1));
    }
}
