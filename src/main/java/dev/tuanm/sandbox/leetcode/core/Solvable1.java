package dev.tuanm.sandbox.leetcode.core;

public interface Solvable1<I1, O> extends Solvable<O> {
    O solve(I1 i1);

    @Override
    default O solve(Object... inputs) {
        this.validateInputs(inputs);
        I1 input1 = this.inputAt(0, inputs);
        return this.solve(input1);
    }
}
