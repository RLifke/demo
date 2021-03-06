package com.coveros.training.helpers;

/**
 * helper methods to assert that certain things in our code are true,
 * or else we throw an exception.
 */
public class CheckUtils {

    private CheckUtils() {
        // using a private constructor to hide the implicit public one.
    }

    /**
     * Asserts that the integer value received is 1 or above.
     * @param parameter a value to check for being positive
     * @throws IllegalArgumentException if the input isn't a positive integer
     */
    public static void checkIntParamPositive(long parameter) {
        if (parameter <= 0) {
            throw new IllegalArgumentException("int value must be 1 or above.");
        }
    }

    /**
     * Makes sure the input value is a valid string of length 1 or greater
     * @param values the strings to check
     * @throws IllegalArgumentException if the string is null or empty
     */
    public static void checkStringNotNullOrEmpty(String ... values) {
        for (String value: values) {
            if(value == null || value.isEmpty()) {
                throw new IllegalArgumentException("string must not be null or empty at this point");
            }
        }

    }

}
