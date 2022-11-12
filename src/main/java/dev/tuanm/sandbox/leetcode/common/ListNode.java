package dev.tuanm.sandbox.leetcode.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Definition for singly-linked list.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListNode {
    /**
     * An empty list.
     */
    public static final ListNode EMPTY = new ListNode(null, null);

    private Integer val;
    private ListNode next;

    @Override
    public String toString() {
        List<Integer> vals = new ArrayList<>();
        ListNode cur = this;
        while (cur != null) {
            if (cur.getVal() == null) break;
            vals.add(cur.getVal());
            cur = cur.getNext();
        }
        return "[" + String.join(",", vals.stream()
                .map(Object::toString)
                .collect(Collectors.toList())) + "]";
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (other instanceof ListNode) {
            ListNode that = (ListNode) other;
            return ListNode.equals(this, that);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }

    /**
     * <p>Compares two {@link ListNode}s by comparing its linked nodes respectively.</p>
     * <em>Two {@code null} lists are equal.</em>
     */
    public static boolean equals(ListNode list1, ListNode list2) {
        if (list1 == list2) return true;
        if (list1 == null || list2 == null) return false;
        if (list1.getVal() != list2.getVal()) return false;
        return equals(list1.getNext(), list2.getNext());
    }

    /**
     * Returns a {@link ListNode} with its linked nodes
     * containing respectively the passed values.
     *
     * @param vals the passed values.
     */
    public static ListNode of(int... vals) {
        if (vals.length == 0) return ListNode.EMPTY;
        ListNode list = new ListNode();
        ListNode cur = list;
        for (int i = 0; i < vals.length; i++) {
            cur.setVal(vals[i]);
            if (i < vals.length - 1) {
                cur.setNext(new ListNode());
                cur = cur.getNext();
            }
        }
        return list;
    }
}
