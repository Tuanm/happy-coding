package dev.tuanm.sandbox.leetcode.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Provides some {@link Comparator}s.
 */
public final class Comparators {
    private static final int EQUAL = 0;
    private static final int NOT_EQUAL = -1;

    private Comparators() {
    }

    /**
     * Retrieves a simple {@link Comparator} for two list.
     *
     * @param <T> the element's type.
     */
    public static <T extends Comparable<T>> Comparator<List<T>> list() {
        return (l1, l2) -> {
            if (l1 == null || l2 == null || l1.size() != l2.size()) {
                return NOT_EQUAL;
            }

            l1 = new ArrayList<>(l1);
            l2 = new ArrayList<>(l2);

            Collections.sort(l1);
            Collections.sort(l2);

            return Objects.deepEquals(l1, l2) ? EQUAL : NOT_EQUAL;
        };
    }
}
