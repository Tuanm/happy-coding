package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Reverse Integer",
        source = "https://leetcode.com/problems/reverse-integer/",
        description = {
            "Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.",
            "Assume the environment does not allow you to store 64-bit integers (signed or unsigned)."
        },
        difficulty = Difficulty.MEDIUM
)
public class ReverseInteger implements Solvable1<Integer, Integer> {
    @Override
    public Integer solve(Integer x) {
        int y = 0;
        while (x != 0) {
            int z = y;
            int d = x % 10;
            y = z * 10 + d;
            if ((y - d) / 10 != z) return 0;
            x /= 10;
        }
        return y;
    }
}
