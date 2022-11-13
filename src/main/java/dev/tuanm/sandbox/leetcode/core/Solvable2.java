package dev.tuanm.sandbox.leetcode.core;

import dev.tuanm.sandbox.leetcode.exception.NotImplementedException;

public interface Solvable2<I1, I2, O> extends Solvable<O> {
    default O solve(I1 i1, I2 i2) {
        throw new NotImplementedException();
    }
}
