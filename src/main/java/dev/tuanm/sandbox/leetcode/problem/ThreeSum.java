package dev.tuanm.sandbox.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "3Sum",
        source = "https://leetcode.com/problems/3sum/",
        description = {
                "Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.",
                "Notice that the solution set must not contain duplicate triplets."
        },
        difficulty = Difficulty.MEDIUM
)
public class ThreeSum implements Solvable1<int[], List<List<Integer>>> {
    @Override
    public List<List<Integer>> solve(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else {
                    if (sum == 0) {
                        triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        right--;
                    }
                    left++;
                }
            }
        }

        return new ArrayList<>(triplets);
    }
}
