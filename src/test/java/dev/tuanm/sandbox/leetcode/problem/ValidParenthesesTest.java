package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class ValidParenthesesTest extends ProblemTest<ValidParentheses> {
    @ParameterizedTest
    @CsvSource({
        "(), true",
        "()[]{}, true",
        "(], false",
        "((, false",
        "}(, false"
    })
    void testExamples(String s, boolean expectation) {
        assertEquals(expectation, problem.solve(s));
    }
}
