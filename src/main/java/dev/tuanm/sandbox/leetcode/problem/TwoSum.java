package dev.tuanm.sandbox.leetcode.problem;

import java.util.HashMap;
import java.util.Map;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable2;

@Problem(
        name = "Two Sum",
        source = "https://leetcode.com/problems/two-sum/",
        description = {
            "Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.",
            "You may assume that each input would have exactly one solution, and you may not use the same element twice.",
            "You can return the answer in any order."
        },
        difficulty = Difficulty.EASY
)
public class TwoSum implements Solvable2<int[], Integer, int[]> {
    @Override
    public int[] solve(int[] nums, Integer target) {
        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        Map<Integer, Integer> duplicatedNumToIndexMap = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            Integer existedIndex = numToIndexMap.get(num);
            if (existedIndex == null) {
                numToIndexMap.put(num, index);
            } else {
                duplicatedNumToIndexMap.put(num, index);
            }
        }

        for (int num : nums) {
            int firstIndex = numToIndexMap.get(num);
            Integer secondIndex = numToIndexMap.get(target - num);
            if (secondIndex == null) continue;
            if (secondIndex == firstIndex) {
                secondIndex = duplicatedNumToIndexMap.get(target - num);
            }
            if (secondIndex != null) {
                return new int[] { firstIndex, secondIndex };
            }
        }

        return new int[0];
    }
}
