package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static dev.tuanm.sandbox.leetcode.util.Creators.array;
import static dev.tuanm.sandbox.leetcode.util.Creators.chars;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class WordSearchTest extends ProblemTest<WordSearch> {
    @Override
    protected WordSearch problem() {
        return new WordSearch();
    }

    @ParameterizedTest
    @MethodSource("source")
    void testExamples(char[][] board, String word, boolean expected) {
        assertEquals(expected, problem.solve(board, word));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(array(
                        chars('A', 'B', 'C', 'E'),
                        chars('S', 'F', 'C', 'S'),
                        chars('A', 'D', 'E', 'E')), "ABCCED", true),
                Arguments.of(array(
                        chars('A', 'B', 'C', 'E'),
                        chars('S', 'F', 'C', 'S'),
                        chars('A', 'D', 'E', 'E')), "SEE", true),
                Arguments.of(array(
                        chars('A', 'B', 'C', 'E'),
                        chars('S', 'F', 'C', 'S'),
                        chars('A', 'D', 'E', 'E')), "ABCB", false));
    }
}