package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class LetterCombinationsOfAPhoneNumberTest extends ProblemTest<LetterCombinationsOfAPhoneNumber> {
    @ParameterizedTest
    @MethodSource("source")
    void testExamples(String digits, List<String> expected) {
        assertTrue(problem.test(expected, digits));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("23", Arrays.asList(
                        "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")),
                Arguments.of("", Arrays.asList()),
                Arguments.of("2", Arrays.asList(
                        "a", "b", "c")));
    }
}
