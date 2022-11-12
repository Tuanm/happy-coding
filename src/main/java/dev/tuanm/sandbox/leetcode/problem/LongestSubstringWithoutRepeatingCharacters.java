package dev.tuanm.sandbox.leetcode.problem;

import java.util.HashMap;
import java.util.Map;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Longest Substring Without Repeating Characters",
        source = "https://leetcode.com/problems/longest-substring-without-repeating-characters/",
        description = "Given a string s, find the length of the longest substring without repeating characters.",
        difficulty = Difficulty.MEDIUM
)
public class LongestSubstringWithoutRepeatingCharacters implements Solvable1<String, Integer> {
    @Override
    public Integer solve(String s) {
        if (s.length() < 2) return s.length();

        int max = 0;
        Map<Character, Integer> presentCharsMap = new HashMap<>();

        int index = 0;
        int count = 0;
        while (index < s.length()) {
            char c = s.charAt(index);
            Integer lastIndex = presentCharsMap.get(c);
            if (lastIndex == null || lastIndex + count < index) {
                count++;
            } else {
                if (count > max) max = count;
                count = index - lastIndex;
            }
            presentCharsMap.put(c, index);
            index++;
        }

        return count > max ? count : max;
    }
}
