package dev.tuanm.sandbox.leetcode.core;

import dev.tuanm.sandbox.leetcode.exception.NotSupportedException;

public interface Solvable4<I1, I2, I3, I4, O> extends Solvable<O> {
    O solve(I1 i1, I2 i2, I3 i3, I4 i4);

    @Override
    default O solve(Object... inputs) {
        if (inputs.length < 4) {
            throw new NotSupportedException();
        }
        I1 input1 = this.inputAt(0, inputs);
        I2 input2 = this.inputAt(1, inputs);
        I3 input3 = this.inputAt(2, inputs);
        I4 input4 = this.inputAt(3, inputs);
        return this.solve(input1, input2, input3, input4);
    }
}
