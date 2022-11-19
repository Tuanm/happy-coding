package dev.tuanm.sandbox.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
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
        List<List<Integer>> triplets = new ArrayList<>();
        Set<Integer> tripletHashes = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);
                        Integer hash = Objects.hash(triplet);
                        if (!tripletHashes.contains(hash)) {
                            triplets.add(triplet);
                            tripletHashes.add(hash);
                        }
                    }
                }
            }
        }

        return triplets;
    }
}
