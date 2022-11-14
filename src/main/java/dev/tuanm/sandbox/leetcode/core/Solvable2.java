package dev.tuanm.sandbox.leetcode.core;

import dev.tuanm.sandbox.leetcode.exception.NotSupportedException;

public interface Solvable2<I1, I2, O> extends Solvable<O> {
    O solve(I1 i1, I2 i2);

    @Override
    default O solve(Object... inputs) {
        if (inputs.length < 2) {
            throw new NotSupportedException();
        }
        I1 input1 = Helper.cast(this.getClass(), 0, inputs[0]);
        I2 input2 = Helper.cast(this.getClass(), 1, inputs[1]);
        return this.solve(input1, input2);
    }
}
