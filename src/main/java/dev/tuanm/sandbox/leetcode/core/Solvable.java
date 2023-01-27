package dev.tuanm.sandbox.leetcode.core;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

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
     * then does the comparison using {@link Objects#deepEquals(Object, Object)}.
     *
     * @param expected the expected output.
     * @param inputs the inputs.
     * @return {@code true} if the test is passed; otherwise {@code false}.
     * @see Objects#deepEquals(Object, Object)
     */
    default boolean test(O expected, Object... inputs) {
        O actual = this.solve(inputs);
        return Objects.deepEquals(expected, actual);
    }

    /**
     * Tests the solution by invoking the method {@link Solvable#solve(Object...)},
     * then does the comparison using a specific {@link Comparator}.
     *
     * @param comparator the comparator.
     * @param expected the expected output.
     * @param inputs the inputs.
     * @return {@code true} if the test is passed; otherwise {@code false}.
     * @see Comparator
     */
    default boolean test(Comparator<O> comparator, O expected, Object... inputs) {
        O actual = this.solve(inputs);
        return Optional.ofNullable(comparator)
                .map(comp -> comp.compare(expected, actual) == 0)
                .orElseThrow(() -> new NotSupportedException("comparator cannot be null"));
    }

    /**
     * Retrieves the input at a specific position with its proper type.
     *
     * @see Helper#cast(Class, int, Object) 
     */
    default <I> I inputAt(int order, Object... inputs) {
        return Helper.cast(this.getClass(), order, inputs[order]);
    }

    /**
     * A helper-class for {@link Solvable}.
     */
    class Helper {
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
        public static <I, R> I cast(Class<R> clazz, int order, Object value) {
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
