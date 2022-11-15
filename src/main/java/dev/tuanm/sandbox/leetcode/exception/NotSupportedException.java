package dev.tuanm.sandbox.leetcode.exception;

/**
 * An exception that should be thrown when a method invocation is not supported.
 */
public class NotSupportedException extends RuntimeException {
    /**
     * {@inheritDoc}
     */
    public NotSupportedException() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public NotSupportedException(String message) {
        super(message);
    }
}
