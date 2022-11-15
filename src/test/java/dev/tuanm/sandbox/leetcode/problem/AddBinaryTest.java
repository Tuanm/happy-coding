package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;

public class AddBinaryTest extends ProblemTest<AddBinary> {
    @Override
    protected AddBinary problem() {
        return new AddBinary();
    }

    @ParameterizedTest
    @MethodSource("source")
    void testExamples(String a, String b, String expected) {
        assertEquals(expected, problem.solve(a, b));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("11", "1", "100"),
                Arguments.of("1010", "1011", "10101"));
    }
}
