package dev.tuanm.sandbox.leetcode.util;

import java.util.Arrays;
import java.util.List;

/**
 * It's easier now when you wanna create something.
 */
public final class Creators {
    private Creators() {}

    /**
     * Returns an array.
     *
     * @param <T> the type of the array's elements.
     */
    @SafeVarargs
    public static <T> T[] array(T... vals) {
        return vals;
    }

    /**
     * Returns a list.
     *
     * @param <T> the type of the array's elements.
     */
    @SafeVarargs
    public static <T> List<T> list(T... vals) {
        return Arrays.asList(vals);
    }
}
