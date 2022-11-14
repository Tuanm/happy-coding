package dev.tuanm.sandbox.leetcode.core;

import dev.tuanm.sandbox.leetcode.exception.NotSupportedException;

public interface Solvable3<I1, I2, I3, O> extends Solvable<O> {
    O solve(I1 i1, I2 i2, I3 i3);

    @Override
    default O solve(Object... inputs) {
        if (inputs.length < 3) {
            throw new NotSupportedException();
        }
        I1 input1 = Helper.cast(this.getClass(), 0, inputs[0]);
        I2 input2 = Helper.cast(this.getClass(), 1, inputs[1]);
        I3 input3 = Helper.cast(this.getClass(), 2, inputs[2]);
        return this.solve(input1, input2, input3);
    }
}
