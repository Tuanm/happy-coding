package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.common.Tag;
import dev.tuanm.sandbox.leetcode.core.Solvable2;

@Problem(
        name = "Word Search",
        source = "https://leetcode.com/problems/word-search/",
        description = {
                "Given an m x n grid of characters board and a string word, return true if word exists in the grid.",
                "The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once."
        },
        tag = Tag.DYNAMIC_PROGRAMMING,
        difficulty = Difficulty.MEDIUM
)
public class WordSearch implements Solvable2<char[][], String, Boolean> {
    @Override
    public Boolean solve(char[][] board, String word) {
        return false;
    }
}