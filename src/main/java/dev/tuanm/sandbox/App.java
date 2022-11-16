package dev.tuanm.sandbox;

import dev.tuanm.sandbox.leetcode.core.Solvable;
import dev.tuanm.sandbox.leetcode.problem.demo.*;
import dev.tuanm.sandbox.leetcode.util.Problems;
import lombok.extern.java.Log;

@Log
public class App {
    public static void main(String[] args) {
        leetcode();
    }

    /**
     * Tests a problem from
     * <a href="https://leetcode.com/problems">LeetCode</a>.
     */
    static void leetcode() {
        Solvable<Integer> problem = Problems.create(JustSum.class);

        int a = 1073741823;
        int b = 1344069815;
        int expected = 2147483647;
        boolean passed = problem.test(expected, a, b);

        log.info(passed ? "PASSED" : "FAILED");
    }
}
