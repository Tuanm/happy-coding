package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.common.Tag;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Jump Game",
        source = "https://leetcode.com/problems/jump-game/",
        description = {
                "You are given an integer array nums.",
                "You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.",
                "Return true if you can reach the last index, or false otherwise."
        },
        tag = Tag.GREEDY,
        difficulty = Difficulty.MEDIUM
)
public class JumpGame implements Solvable1<int[], Boolean> {
    @Override
    public Boolean solve(int[] nums) {
        return false;
    }
}
