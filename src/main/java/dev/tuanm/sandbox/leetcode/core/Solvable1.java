package dev.tuanm.sandbox.leetcode.core;

import dev.tuanm.sandbox.leetcode.exception.NotSupportedException;

public interface Solvable1<I1, O> extends Solvable<O> {
    O solve(I1 i1);

    @Override
    default O solve(Object... inputs) {
        if (inputs.length < 1) {
            throw new NotSupportedException();
        }
        I1 input1 = this.inputAt(0, inputs);
        return this.solve(input1);
    }
}
