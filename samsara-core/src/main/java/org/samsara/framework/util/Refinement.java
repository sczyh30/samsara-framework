package org.samsara.framework.util;

import java.util.function.Predicate;

/**
 * Samsara Common Library
 * Refinement assert
 *
 * @author sczyh30
 */
public final class Refinement { //TODO: implement refinement types using annotation

    public static void notNull(Object object) {
        notNull(object, "Object does not correspond to the condition: must not be null");
    }

    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }

    public static<T> void mustBe(T obj, Predicate<T> p, String message) {
        if (!p.test(obj)) {
            throw new IllegalArgumentException(message);
        }
    }

}
