package dev.tuanm.sandbox.leetcode.core;

import dev.tuanm.sandbox.leetcode.exception.NotImplementedException;

public interface Solvable1<I1, O> extends Solvable<O> {
    default O solve(I1 i1) {
        throw new NotImplementedException();
    }
}
