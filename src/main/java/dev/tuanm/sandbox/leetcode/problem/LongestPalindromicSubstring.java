package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Longest Palindromic Substring",
        source = "https://leetcode.com/problems/longest-palindromic-substring/",
        description = "Given a string s, return the longest palindromic substring in s.",
        difficulty = Difficulty.MEDIUM
)
public class LongestPalindromicSubstring implements Solvable1<String, String> {
    @Override
    public String solve(String s) {
        if (s.length() < 1) return s;

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int l1 = subLength(s, i, i);
            int l2 = subLength(s, i, i + 1);
            int maxLength = Math.max(l1, l2);
            int oldMaxLength = end - start + 1;
            if (maxLength > oldMaxLength) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    /**
     * Returns the maximum length of the palindromic substring
     * with a specific probable centroid.
     *
     * @param s the original string.
     * @param centerLeft the left position of the centroid.
     * @param centerRight the right position of the centroid.
     * @return the maximum length of the palindromic substring
     * if the passed positions belong to a centroid; otherwise, 0.
     */
    int subLength(String s, int centerLeft, int centerRight) {
        int l = centerLeft;
        int r = centerRight;
        while (l >= 0 && r < s.length()) {
            if (s.charAt(l) != s.charAt(r)) break;
            l--;
            r++;
        }
        return r - l - 1;
    }
}
