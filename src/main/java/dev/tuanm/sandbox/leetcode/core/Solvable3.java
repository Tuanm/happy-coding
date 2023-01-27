package dev.tuanm.sandbox.leetcode.core;

public interface Solvable3<I1, I2, I3, O> extends Solvable<O> {
    O solve(I1 i1, I2 i2, I3 i3);

    @Override
    default O solve(Object... inputs) {
        this.validateInputs(inputs);
        I1 input1 = this.inputAt(0, inputs);
        I2 input2 = this.inputAt(1, inputs);
        I3 input3 = this.inputAt(2, inputs);
        return this.solve(input1, input2, input3);
    }
}
