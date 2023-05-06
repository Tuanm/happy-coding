package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class RomanToIntegerTest extends ProblemTest<RomanToInteger> {
    @ParameterizedTest
    @CsvSource({
        "III, 3",
        "LVIII, 58",
        "MCMXCIV, 1994"
    })
    void testExamples(String s, int expectation) {
        assertEquals(expectation, problem.solve(s));
    }
}
