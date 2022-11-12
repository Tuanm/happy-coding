package dev.tuanm.sandbox.leetcode.core;

import dev.tuanm.sandbox.leetcode.exception.NotImplementedException;

/**
 * Provides methods for problem solving.
 */
public interface Solvable<O> {
    default O solve(Object... inputs) {
        throw new NotImplementedException();
    }
}
