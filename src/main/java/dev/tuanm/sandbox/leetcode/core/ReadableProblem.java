package dev.tuanm.sandbox.leetcode.core;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import dev.tuanm.sandbox.leetcode.annotation.Problem;
import dev.tuanm.sandbox.leetcode.common.Tag;
import dev.tuanm.sandbox.leetcode.exception.NotSupportedException;

/**
 * A class that overrides the {@link Object#toString()}
 * to make the instances of its more comprehensible.
 * The {@link ReadableProblem#toString()} returns a {@link String}
 * with the value depending on the associated annotation {@link Problem}'s
 * values.
 *
 * @see Problem
 */
public class ReadableProblem {
    @Override
    public String toString() {
        return this.id();
    }

    /**
     * The URI-based name of the problem.
     *
     * @see Problem#name()
     */
    public String id() {
        return problem().name()
                .toLowerCase().replaceAll("[^a-z0-9]+", "-");
    }

    /**
     * The title or the name or the problem.
     */
    public String name() {
        return problem().name();
    }

    /**
     * The URL for the problem on
     * <a href="https://leetcode.com/problems">LeetCode</a>.
     */
    public String source() {
        return problem().source();
    }

    /**
     * The description of the problem.
     */
    public String description() {
        StringBuilder description = new StringBuilder();
        for (String sentence : problem().description()) {
            if (sentence == null || sentence.trim().length() == 0) {
                description.append(System.lineSeparator());
            } else {
                description.append(" ").append(sentence);
            }
        }
        return description.toString();
    }

    /**
     * The tags associated with the problem.
     */
    public List<String> tags() {
        return Arrays.stream(problem().tag())
                .map(Tag::id)
                .collect(Collectors.toList());
    }

    /**
     * The difficulty of the problem.
     */
    public String difficulty() {
        return problem().difficulty().toString();
    }

    /**
     * Retrieves the {@link Problem} associated with this instance.
     *
     * @throws NotSupportedException if there's no {@link Problem}
     * associated with this instance, an exception will be thrown.
     */
    protected final Problem problem() {
        return Optional.ofNullable(this.getClass().getAnnotation(Problem.class))
                .orElseThrow(NotSupportedException::new);
    }
}
