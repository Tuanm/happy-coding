package dev.tuanm.sandbox.leetcode.util;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.List;

/**
 * It's easier now when you want to create something.
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

    /**
     * Creates an instance of a specific argument of a generic class.
     *
     * @param <T> the generic class' type.
     * @param <P> the creating instance's type.
     * @param clazz the generic class.
     * @param argumentIndex the argument's index in the generic parameter type list.
     */
    @SuppressWarnings("unchecked")
    public static <T, P> P fromGenericArgument(Class<T> clazz, int argumentIndex) {
        try {
            ParameterizedType pt = (ParameterizedType) clazz.getGenericSuperclass();
            Class<P> argumentClazz = (Class<P>) pt.getActualTypeArguments()[argumentIndex];
            return argumentClazz.getConstructor().newInstance();
        } catch (Exception ex) {
            throw new RuntimeException(ex.getMessage(), ex);
        }
    }
}
