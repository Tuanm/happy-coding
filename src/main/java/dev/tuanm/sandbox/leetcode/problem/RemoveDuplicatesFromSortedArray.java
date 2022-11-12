package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.NotOptimizedYet;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Remove Duplicates from Sorted Array",
        source = "https://leetcode.com/problems/remove-duplicates-from-sorted-array/",
        description = {
            "Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.",
            "The relative order of the elements should be kept the same.",
            "",
            "Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.",
            "More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.",
            "It does not matter what you leave beyond the first k elements.",
            "",
            "Return k after placing the final result in the first k slots of nums.",
            "",
            "Do not allocate extra space for another array.",
            "You must do this by modifying the input array in-place with O(1) extra memory."
        },
        difficulty = Difficulty.EASY
)
public class RemoveDuplicatesFromSortedArray implements Solvable1<int[], Integer> {
    @Override
    public Integer solve(int[] nums) {
        int k = nums.length;
        int j = 0;
        while (j < k - 1) {
            int i = 0; // count the number of consecutive duplicates
            for (int q = j; q < k - 1; q++) {
                if (nums[q] == nums[q + 1]) i++;
                else break;
            }
            if (i == 0) j++;
            else {
                for (int p = j + 1; p < k - i; p++) {
                    nums[p] = nums[p + i];
                }
                k -= i;
            }
        }
        return k;
    }

    @NotOptimizedYet
    int solve2(int[] nums) {
        int k = nums.length;
        int j = 0;
        while (j < k - 1) {
            if (nums[j] == nums[j + 1]) {
                for (int p = j + 1; p < k - 1; p++) {
                    nums[p] = nums[p + 1];
                }
                k--;
            } else j++;
        }
        return k;
    }

    @NotOptimizedYet
    int solve1(int[] nums) {
        int k = nums.length;

        int i = 0;
        while (i < k) {
            boolean q = true;
            for (int j = i + 1; j < k; j++) {
                if (nums[i] == nums[j]) {
                    for (int p = j - 1; p < k - 1; p++) {
                        nums[p] = nums[p + 1];
                    }
                    k--;
                    q = false;
                    break;
                }
            }
            if (q) i++;
        }

        return k;
    }
}
