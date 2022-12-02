package dev.tuanm.sandbox.leetcode.problem;

import java.util.HashSet;
import java.util.Set;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.NotOptimizedYet;
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
        tag = { Tag.GREEDY, Tag.DYNAMIC_PROGRAMMING },
        difficulty = Difficulty.MEDIUM
)
public class JumpGame implements Solvable1<int[], Boolean> {
    @Override
    public Boolean solve(int[] nums) {
        return this.dpSolve(nums);
    }

    protected boolean dpSolve(int[] nums) {
        int[] max = new int[nums.length];

        max[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            max[i] = Math.max(max[i - 1], nums[i - 1]) - 1;
            if (max[i] < 0) return false;
        }

        return max[nums.length - 1] >= 0;
    }

    @NotOptimizedYet
    protected boolean greedySolve(int[] nums) {
        Set<Integer> jumpable = new HashSet<>();

        int index = nums.length - 1;
        while (index >= 0) {
            int max = index + nums[index];
            if (max >= nums.length - 1) {
                jumpable.add(index);
            } else for (Integer position : jumpable) {
                if (max >= position) {
                    jumpable.add(index);
                    break;
                }
            }
            index--;
        }

        return jumpable.contains(0);
    }
}
