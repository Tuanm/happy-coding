package dev.tuanm.sandbox.leetcode.problem;

import java.util.HashMap;
import java.util.Map;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.NotOptimizedYet;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Longest Substring Without Repeating Characters",
        source = "https://leetcode.com/problems/longest-substring-without-repeating-characters/",
        description = "Given a string s, find the length of the longest substring without repeating characters.",
        difficulty = Difficulty.MEDIUM
)
public class LongestSubstringWithoutRepeatingCharacters implements Solvable1<String, Integer> {
    @NotOptimizedYet
    @Override
    public Integer solve(String s) {
        if (s.length() < 2) return s.length();

        Map<Character, Integer> presentCharsMap = new HashMap<>();
        int max = 0;
        int i = 0;
        while (i < s.length()) {
            presentCharsMap.clear();
            int count = 0;
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                Integer lastIndex = presentCharsMap.get(c);
                if (lastIndex == null) {
                    presentCharsMap.put(c, j);
                    count++;
                } else {
                    i = lastIndex; // no need to find the longest substring from `lastIndex`
                    break;
                }
            }
            if (count > max) max = count;
            i++; // re-find from the next character
        }

        return max;
    }
}
