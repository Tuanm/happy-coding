package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable2;

@Problem(
        name = "Search Insert Position",
        source = "https://leetcode.com/problems/search-insert-position/",
        description = {
            "Given a sorted array of distinct integers and a target value, return the index if the target is found.",
            "If not, return the index where it would be if it were inserted in order.",
            "You must write an algorithm with O(log n) runtime complexity."
        },
        difficulty = Difficulty.EASY
)
public class SearchInsertPosition implements Solvable2<int[], Integer, Integer> {
    @Override
    public Integer solve(int[] nums, Integer target) {
        if (nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        while (right - left > 1) {
            int middle = (right + left) / 2;
            int num = nums[middle];
            if (target == num) return middle;
            if (target < num) right = middle;
            else left = middle;
        }
        if (target <= nums[left]) return left;
        if (target > nums[right]) return right + 1;
        return left + 1;
    }
}
