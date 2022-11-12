package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Palindrome Number",
        source = "https://leetcode.com/problems/palindrome-number/",
        description = "Given an integer x, return true if x is a palindrome, and false otherwise.",
        difficulty = Difficulty.EASY
)
public class PalindromeNumber implements Solvable1<Integer, Boolean> {
    @Override
    public Boolean solve(Integer x) {
        if (x < 0) return false;
        if (x < 10) return true;

        String str = String.valueOf(x);
        int half = str.length() / 2;
        for (int i = 0; i < half; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
