package dev.tuanm.sandbox.leetcode.core;

import dev.tuanm.sandbox.leetcode.exception.NotSupportedException;

public interface Solvable4<I1, I2, I3, I4, O> extends Solvable<O> {
    O solve(I1 i1, I2 i2, I3 i3, I4 i4);

    @Override
    default O solve(Object... inputs) {
        if (inputs.length < 4) {
            throw new NotSupportedException();
        }
        I1 input1 = Helper.cast(this.getClass(), 0, inputs[0]);
        I2 input2 = Helper.cast(this.getClass(), 1, inputs[1]);
        I3 input3 = Helper.cast(this.getClass(), 2, inputs[2]);
        I4 input4 = Helper.cast(this.getClass(), 3, inputs[3]);
        return this.solve(input1, input2, input3, input4);
    }
}
