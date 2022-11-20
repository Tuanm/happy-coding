package dev.tuanm.sandbox.leetcode.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable1;

@Problem(
        name = "Letter Combinations of a Phone Number",
        source = "https://leetcode.com/problems/letter-combinations-of-a-phone-number/",
        description = {
                "Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.",
                "A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters."
        },
        difficulty = Difficulty.MEDIUM
)
public class LetterCombinationsOfAPhoneNumber implements Solvable1<String, List<String>> {
    @Override
    public List<String> solve(String digits) {
        final Map<Character, Set<Character>> digitToLetters = new HashMap<>();
        digitToLetters.put('2', new HashSet<>(Arrays.asList('a', 'b', 'c')));
        digitToLetters.put('3', new HashSet<>(Arrays.asList('d', 'e', 'f')));
        digitToLetters.put('4', new HashSet<>(Arrays.asList('g', 'h', 'i')));
        digitToLetters.put('5', new HashSet<>(Arrays.asList('j', 'k', 'l')));
        digitToLetters.put('6', new HashSet<>(Arrays.asList('m', 'n', 'o')));
        digitToLetters.put('7', new HashSet<>(Arrays.asList('p', 'q', 'r', 's')));
        digitToLetters.put('8', new HashSet<>(Arrays.asList('t', 'u', 'v')));
        digitToLetters.put('9', new HashSet<>(Arrays.asList('w', 'x', 'y', 'z')));

        List<String> letters = new ArrayList<>();
        letters.add("");

        for (char c : digits.toCharArray()) {
            for (String str : new HashSet<>(letters)) {
                letters.remove(str);
                digitToLetters.get(c)
                        .forEach(s -> letters.add(new StringBuilder(str).append(s).toString()));
            }
        }

        return letters.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
    }
}