package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.common.Tag;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Climbing Stairs",
        source = "https://leetcode.com/problems/climbing-stairs/",
        description = {
                "You are climbing a staircase. It takes n steps to reach the top.",
                "Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?"
        },
        tag = Tag.DYNAMIC_PROGRAMMING,
        difficulty = Difficulty.EASY
)
public class ClimbingStairs implements Solvable1<Integer, Integer> {
    @Override
    public Integer solve(Integer n) {
        int p = 0;
        int q = 1;
        for (int i = 1; i < n; i++) {
            int t = p;
            p = q;
            q += t;
        }
        return p + q;
    }
}
