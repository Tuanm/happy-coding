package dev.tuanm.sandbox.leetcode.util;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import dev.tuanm.sandbox.leetcode.annotation.Difficulty;
import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.common.Tag;
import dev.tuanm.sandbox.leetcode.core.Solvable;
import dev.tuanm.sandbox.leetcode.exception.NotImplementedException;
import dev.tuanm.sandbox.leetcode.exception.NotSupportedException;

/**
 * A class helps us with {@link Solvable}s.
 */
public final class Problems {
    private Problems() {}

    /**
     * Creates an instance for a specific problem by invoking
     * its default constructor (no-args constructor).
     *
     * @param <O>   the problem's output type.
     * @param clazz the problem's class.
     */
    public static <O> Solvable<O> create(Class<? extends Solvable<O>> clazz) {
        try {
            return clazz.getConstructor().newInstance();
        } catch (Exception ex) {
            throw new NotSupportedException(ex.getMessage());
        }
    }

    /**
     * Retrieves the metadata of a problem.
     *
     * @param <S>     the problem's type.
     * @param problem the problem.
     */
    public static <S extends Solvable<? extends Object>> Problem metaData(S problem) {
        return Optional.ofNullable(problem)
                .map(Object::getClass)
                .map(clazz -> clazz.getAnnotation(Problem.class))
                .orElseThrow(() -> new NotSupportedException(
                        String.format("Class %s must be annotated with %s to be testable",
                                problem.getClass().getName(), Problem.class.getName())));
    }

    /**
     * Searches and returns a list of problems
     * that matches all of the specific {@link SearchParam}s.
     */
    @SuppressWarnings("java:S1452") // for using wildcard types
    @SafeVarargs
    public static List<Solvable<?>> search(SearchParam<? extends Solvable<?>>... searchParams) {
        /**
         * TODO: Implement the method Problems.search(SearchParam...)
         *
         * 1. Scan all classes in the package `dev.tuanm.sandbox.leetcode.problem`.
         * 2. Do filterings in the result.
         */
        throw new NotImplementedException();
    }

    /**
     * Provides some mostly-used {@link SearchParam}s
     * for the method {@link Problems#search(SearchParam...)}.
     */
    public static final class SearchParams {
        private SearchParams() {}

        public static <O> SearchParam<Solvable<O>> of(Difficulty... params) {
            List<Difficulty> difficulties = Arrays.asList(params);
            return problem -> {
                Problem metaData = metaData(problem);
                return difficulties.contains(metaData.difficulty());
            };
        }

        public static <O> SearchParam<Solvable<O>> of(Tag... params) {
            List<Tag> tags = Arrays.asList(params);
            return problem -> {
                Problem metaData = metaData(problem);
                return Arrays.asList(metaData.tag()).stream()
                        .anyMatch(tags::contains);
            };
        }
    }
}

/**
 * Simple filter for searching.
 */
@FunctionalInterface
interface SearchParam<T> {
    /**
     * Tests if an input satisfies an internal
     * condition or not.
     *
     * @param t the input.
     * @return {@code true} if satisfied; {@code false} otherwise.
     */
    boolean test(T t);
}
