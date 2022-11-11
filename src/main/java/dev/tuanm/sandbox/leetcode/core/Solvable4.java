package dev.tuanm.sandbox.leetcode.core;

import dev.tuanm.sandbox.leetcode.exception.NotImplementedException;

public interface Solvable4<I1, I2, I3, I4, O> extends Solvable<O> {
    default O solve(I1 i1, I2 i2, I3 i3, I4 i4) {
        throw new NotImplementedException();
    }
}
