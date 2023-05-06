package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class TwoSumTest extends ProblemTest<TwoSum> {
    @Test
    @DisplayName("Example 1")
    void example1() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] expectation = { 0, 1 };
        assertTrue(Arrays.equals(expectation, problem.solve(nums, target)));
    }

    @Test
    @DisplayName("Example 2")
    void example2() {
        int[] nums = { 3, 2, 4 };
        int target = 6;
        int[] expectation = { 1, 2 };
        assertTrue(Arrays.equals(expectation, problem.solve(nums, target)));
    }

    @Test
    @DisplayName("Example 3")
    void example3() {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] expectation = { 0, 1 };
        assertTrue(Arrays.equals(expectation, problem.solve(nums, target)));
    }
}
