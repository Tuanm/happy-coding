package dev.tuanm.sandbox.leetcode.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import dev.tuanm.sandbox.leetcode.common.Tag;

/**
 * Marks a class as a problem.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Problem {
    /**
     * The title or the name or the problem.
     */
    String name() default "";

    /**
     * The URL for the problem on
     * <a href="https://leetcode.com/problems">LeetCode</a>.
     */
    String source() default "";

    /**
     * The description of the problem.
     */
    String[] description() default "";

    /**
     * The tags associated with the problem.
     */
    Tag[] tag() default Tag.NONE;

    /**
     * The difficulty of the problem.
     */
    Difficulty difficulty();
}
