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
     * Returns a {@code double} array.
     */
    public static double[] doubles(double... vals) {
        return vals;
    }

    /**
     * Returns a {@code float} array.
     */
    public static float[] floats(float... vals) {
        return vals;
    }

    /**
     * Returns a {@code long} array.
     */
    public static long[] longs(long... vals) {
        return vals;
    }

    /**
     * Returns an {@code int} array.
     */
    public static int[] ints(int... vals) {
        return vals;
    }

    /**
     * Returns a {@code char} array.
     */
    public static char[] chars(char... vals) {
        return vals;
    }

    /**
     * Returns a {@code byte} array.
     */
    public static byte[] bytes(byte... vals) {
        return vals;
    }

    /**
     * Returns a {@code boolean} array.
     */
    public static boolean[] booleans(boolean... vals) {
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
