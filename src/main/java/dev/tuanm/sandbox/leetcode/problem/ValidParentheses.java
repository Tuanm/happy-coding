package dev.tuanm.sandbox.leetcode.problem;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Valid Parentheses",
        source = "https://leetcode.com/problems/valid-parentheses/",
        description = {
            "Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.",
            "An input string is valid if:",
            "   1. Open brackets must be closed by the same type of brackets.",
            "   2. Open brackets must be closed in the correct order.",
            "   3. Every close bracket has a corresponding open bracket of the same type."
        },
        difficulty = Difficulty.EASY
)
public class ValidParentheses implements Solvable1<String, Boolean> {
    @Override
    public Boolean solve(String s) {
        if (s.length() % 2 != 0) return false;

        Set<Character> openBrackets = new HashSet<>();
        openBrackets.add('(');
        openBrackets.add('[');
        openBrackets.add('{');

        Map<Character, Character> closeToOpenBracketMap = new HashMap<>();
        closeToOpenBracketMap.put(')', '(');
        closeToOpenBracketMap.put(']', '[');
        closeToOpenBracketMap.put('}', '{');

        Deque<Character> stack = new ArrayDeque<>(); // used as a stack
        for (char c : s.toCharArray()) {
            if (openBrackets.contains(c)) {
                stack.push(c);
            } else {
                try {
                    char openBracket = stack.pop();
                    if (openBracket != closeToOpenBracketMap.get(c)) {
                        return false;
                    }
                } catch (NoSuchElementException ex) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
