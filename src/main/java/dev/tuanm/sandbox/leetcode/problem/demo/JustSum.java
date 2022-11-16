package dev.tuanm.sandbox.leetcode.problem.demo;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable2;

@Problem(name = "Just Sum", source = "demo", description = {
        "This is a demo problem.",
        "You have to implement the method solve(int, int) below to return the sum of two 32-bit signed integers a and b.",
        "If the result reaches out of range [-2^31, 2^31 - 1], take the nearest bound of the range."
}, difficulty = Difficulty.EASY)
public class JustSum implements Solvable2<Integer, Integer, Integer> {
    @Override
    public Integer solve(Integer a, Integer b) {
        return a + b;
    }
}
