package dev.tuanm.sandbox.leetcode.problem;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.common.ListNode;
import dev.tuanm.sandbox.leetcode.core.Solvable2;

@Problem(
        name = "Merge Two Sorted Lists",
        source = "https://leetcode.com/problems/merge-two-sorted-lists/",
        description = {
            "You are given the heads of two sorted linked lists list1 and list2.",
            "Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.",
            "Return the head of the merged linked list."
        },
        difficulty = Difficulty.EASY
)
public class MergeTwoSortedLists implements Solvable2<ListNode, ListNode, ListNode> {
    @Override
    public ListNode solve(ListNode list1, ListNode list2) {
        if (ListNode.EMPTY.equals(list1)) return list2;
        if (ListNode.EMPTY.equals(list2)) return list1;

        ListNode base;
        ListNode comp;

        if (list1.getVal() < list2.getVal()) {
            base = list1;
            comp = list2;
        } else {
            base = list2;
            comp = list1;
        }

        ListNode cur = base;
        while (cur != null && comp != null) {
            ListNode next = cur.getNext();
            if (next == null) {
                cur.setNext(comp);
                break;
            }
            int val = next.getVal();
            if (comp.getVal() < val) {
                ListNode temp = comp.getNext();
                comp.setNext(next);
                cur.setNext(comp);
                comp = temp;
            }
            cur = cur.getNext();
        }

        return base;
    }
}
