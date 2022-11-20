package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;
import dev.tuanm.sandbox.leetcode.util.Comparators;

public class GenerateParenthesesTest extends ProblemTest<GenerateParentheses> {
    @Override
    protected GenerateParentheses problem() {
        return new GenerateParentheses();
    }

    @ParameterizedTest
    @MethodSource("source")
    void testExamples(int n, List<String> expected) {
        assertTrue(problem.test(Comparators.list(), expected, n));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(4,
                        Arrays.asList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())",
                                "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())",
                                "()()()()")),
                Arguments.of(3, Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()")),
                Arguments.of(1, Arrays.asList("()")));
    }
}
