package dev.tuanm.sandbox.leetcode.common;

/**
 * A tag associated with the problem.
 */
public enum Tag {
    /**
     * Indicates that a problem is not tagged.
     */
    NONE(""),
    /**
     * Indicates a "Greedy" problem.
     */
    GREEDY("greedy"),
    /**
     * Indicates a "Dynamic Programming" problem.
     */
    DYNAMIC_PROGRAMMING("dynamic-programming");

    private final String id;

    Tag(String id) {
        this.id = id;
    }

    /**
     * Retrieves the URI-based id of the tag.
     */
    public String id() {
        return this.id;
    }
}
