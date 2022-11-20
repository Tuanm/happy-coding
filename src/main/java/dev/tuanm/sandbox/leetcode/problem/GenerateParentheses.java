package dev.tuanm.sandbox.leetcode.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Generate Parentheses",
        source = "https://leetcode.com/problems/generate-parentheses/",
        description = "Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.",
        difficulty = Difficulty.MEDIUM
)
public class GenerateParentheses implements Solvable1<Integer, List<String>> {
    @Override
    public List<String> solve(Integer n) {
        final Set<String> parentheses = new HashSet<>();
        if (n > 0) {
            if (n == 1) {
                parentheses.add("()");
            } else {
                solve(n - 1).forEach(sub -> {
                    parentheses.add("(" + sub + ")");
                    parentheses.add("()" + sub);
                    parentheses.add(sub + "()");
                });
            }
        }
        return new ArrayList<>(parentheses);
    }
}
