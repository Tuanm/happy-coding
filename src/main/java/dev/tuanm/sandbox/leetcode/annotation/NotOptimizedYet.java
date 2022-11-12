package dev.tuanm.sandbox.leetcode.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a method is not an optimized solution, needing an improvement.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotOptimizedYet {
    /**
     * Some issues that need to be fixed.
     */
    String[] comments() default "";
}
