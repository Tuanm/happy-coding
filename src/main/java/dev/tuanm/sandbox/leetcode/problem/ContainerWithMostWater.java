package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Container With Most Water",
        source = "https://leetcode.com/problems/container-with-most-water/",
        description = {
            "You are given an integer array height of length n.",
            "There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).",
            "Find two lines that together with the x-axis form a container, such that the container contains the most water.",
            "Return the maximum amount of water a container can store.",
            "Notice that you may not slant the container."
        },
        difficulty = Difficulty.MEDIUM
)
public class ContainerWithMostWater implements Solvable1<int[], Integer> {
    @Override
    public Integer solve(int[] height) {
        int maxArea = 0;

        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int area = width * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);
            // maximize the area by moving the smaller line towards the bigger
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
