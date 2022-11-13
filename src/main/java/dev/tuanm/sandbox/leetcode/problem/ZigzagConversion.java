package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.NotOptimizedYet;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable2;

@Problem(
        name = "Zigzag Conversion",
        source = "https://leetcode.com/problems/zigzag-conversion/",
        description = {
            "The string \"PAYPALISHIRING\" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)",
            "   P   A   H   N",
            "   A P L S I I G",
            "   Y   I   R",
            "And then read line by line: \"PAHNAPLSIIGYIR\"",
            "Write the code that will take a string and make this conversion given a number of rows."
        },
        difficulty = Difficulty.MEDIUM
)
public class ZigzagConversion implements Solvable2<String, Integer, String> {
    @NotOptimizedYet
    @Override
    public String solve(String s, Integer numRows) {
        return null;
    }
}
