package dev.tuanm.sandbox.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;

import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.core.Solvable;
import dev.tuanm.sandbox.leetcode.exception.NotSupportedException;

/**
 * Base class for problem testing.
 */
public abstract class ProblemTest<S extends Solvable<?>> {
    /**
     * The problem for testing.
     */
    protected S problem;

    /**
     * <p>Retrieves a problem associated with these tests.</p>
     * <em>This method will be implicitly invoked inside
     * the method {@link ProblemTest#setUp()} before each test.</em>
     */
    protected abstract S problem();

    /**
     * <p>Configures the associated problem for each test,
     * and verifies if this problem has been annotated
     * with the annotation {@link Problem} or not.</p>
     * <em>The associated problem must be defined as a class
     * that is annotated with {@link Problem}, or the test
     * goes failed.</em>
     */
    @BeforeEach
    private void setUp() {
        problem = problem();
        Optional.ofNullable(problem)
                .map(problem -> problem.getClass())
                .map(clazz -> clazz.getAnnotation(Problem.class))
                .orElseThrow(() -> new NotSupportedException());
    }

    protected void run(Object expectation, Object... inputs) {
        assertEquals(expectation, problem.solve(inputs));
    }
}
