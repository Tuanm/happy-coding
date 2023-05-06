package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class PalindromeNumberTest extends ProblemTest<PalindromeNumber> {
    @Test
    @DisplayName("Example 1")
    void example1() {
        int x = 121;
        boolean output = true;
        assertEquals(output, problem.solve(x));
    }

    @Test
    @DisplayName("Example 2")
    void example2() {
        int x = -121;
        boolean output = false;
        assertEquals(output, problem.solve(x));
    }

    @Test
    @DisplayName("Example 3")
    void example3() {
        int x = 10;
        boolean output = false;
        assertEquals(output, problem.solve(x));
    }
}
