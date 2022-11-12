package dev.tuanm.sandbox.leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.tuanm.sandbox.leetcode.ProblemTest;
import dev.tuanm.sandbox.leetcode.common.ListNode;

public class MergeTwoSortedListsTest extends ProblemTest<MergeTwoSortedLists> {
    @Override
    protected MergeTwoSortedLists problem() {
        return new MergeTwoSortedLists();
    }

    @ParameterizedTest
    @MethodSource("source")
    void testExamples(ListNode list1, ListNode list2, ListNode expectation) {
        assertEquals(expectation, problem.solve(list1, list2));
    }

    static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of(
                        ListNode.of(1, 2, 4),
                        ListNode.of(1, 3, 4),
                        ListNode.of(1, 1, 2, 3, 4, 4)),
                Arguments.of(ListNode.of(), ListNode.of(), ListNode.of()),
                Arguments.of(ListNode.of(), ListNode.of(0), ListNode.of(0)));
    }
}
