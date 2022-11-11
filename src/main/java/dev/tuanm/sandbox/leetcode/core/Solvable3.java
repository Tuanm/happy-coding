package dev.tuanm.sandbox.leetcode.core;

import dev.tuanm.sandbox.leetcode.exception.NotImplementedException;

public interface Solvable3<I1, I2, I3, O> extends Solvable4<I1, I2, I3, Void, O> {
    default O solve(I1 i1, I2 i2, I3 i3) {
        throw new NotImplementedException();
    }
}
