package dev.tuanm.sandbox.leetcode.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.common.Tag;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Determine if String Halves Are Alike",
        source = "https://leetcode.com/problems/determine-if-string-halves-are-alike/",
        description = {
                "You are given a string s of even length.",
                "Split this string into two halves of equal lengths, and let a be the first half and b be the second half.",
                "Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').",
                "Notice that s contains uppercase and lowercase letters.",
                "Return true if a and b are alike. Otherwise, return false."
        },
        tag = Tag.GREEDY,
        difficulty = Difficulty.EASY
)
public class DetermineIfStringHalvesAreAlike implements Solvable1<String, Boolean> {
    @Override
    public Boolean solve(String s) {
        final Set<Character> vowels = new HashSet<>(Arrays.asList(
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
        ));
        int left = 0;
        int right = 0;

        int mid = s.length() / 2 - 1;
        for (int i = 0; mid - i >= 0; i++) {
            if (vowels.contains(s.charAt(mid - i))) {
                left++;
            }
            if (vowels.contains(s.charAt(mid + i + 1))) {
                right++;
            }
        }

        return left == right;
    }
}
