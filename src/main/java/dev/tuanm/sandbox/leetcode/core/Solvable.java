package dev.tuanm.sandbox.leetcode.core;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

import dev.tuanm.sandbox.leetcode.exception.NotImplementedException;
import dev.tuanm.sandbox.leetcode.exception.NotSupportedException;

/**
 * Provides methods for problem solving.
 */
public interface Solvable<O> {
    /**
     * Solves the problem with some specific inputs.
     *
     * @param inputs the inputs.
     */
    default O solve(Object... inputs) {
        throw new NotImplementedException();
    }

    /**
     * Tests the solution by invoking the method {@link Solvable#solve(Object...)},
     * then does some comparisons.
     *
     * @param expected the expected output.
     * @param inputs the inputs.
     * @return {@code true} if the test is passed; otherwise {@code false}.
     */
    default boolean test(O expected, Object... inputs) {
        return Objects.deepEquals(expected, this.solve(inputs));
    }

    /**
     * A helper-class for {@link Solvable}.
     */
    static class Helper {
        private Helper() {}

        /**
         * Casts an {@link Object} to a specific generic type
         * of the input that has been declared in the interface.
         *
         * @param <I> the input type.
         * @param <R> the interface type.
         * @param clazz the class of the interface.
         * @param order the order of the input in the interface's declaration.
         * @param value the input's value.
         */
        @SuppressWarnings("unchecked")
        public static final <I, R> I cast(Class<R> clazz, int order, Object value) {
            Type[] types = clazz.getGenericInterfaces();
            if (types.length > 0 && types[0] instanceof ParameterizedType) {
                Type[] arguments = ((ParameterizedType) types[0]).getActualTypeArguments();
                if (order < arguments.length) {
                    return ((Class<I>) arguments[order]).cast(value); // this cast is unchecked
                }
            }
            throw new NotSupportedException();
        }
    }
}
