package dev.tuanm.sandbox.leetcode.core;

public interface Solvable2<I1, I2, O> extends Solvable<O> {
    O solve(I1 i1, I2 i2);

    @Override
    default O solve(Object... inputs) {
        this.validateInputs(inputs);
        I1 input1 = this.inputAt(0, inputs);
        I2 input2 = this.inputAt(1, inputs);
        return this.solve(input1, input2);
    }
}
