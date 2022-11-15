package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable2;

@Problem(
        name = "Add Binary",
        source = "https://leetcode.com/problems/add-binary/",
        description = "Given two binary strings a and b, return their sum as a binary string.",
        difficulty = Difficulty.EASY
)
public class AddBinary implements Solvable2<String, String, String> {
    @Override
    public String solve(String a, String b) {
        StringBuilder s = new StringBuilder();

        int l = Math.max(a.length(), b.length()) + 1;
        boolean r = false;
        for (int i = 0; i < l; i++) {
            char c1 = charAtOffset(a, i);
            char c2 = charAtOffset(b, i);
            char c;
            if (c1 == c2) {
                c = r ? '1' : '0';
                r = c1 == '1';
            } else {
                c = r ? '0' : '1';
                r = c == '0';
            }
            if (i < l - 1 || c == '1') s.insert(0, c);
        }

        return s.toString();
    }

    char charAtOffset(String s, int offset) {
        int index = s.length() - 1 - offset;
        if (index < 0) return '0';
        return s.charAt(index);
    }
}
