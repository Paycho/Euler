
package com.paycho.euler.utils.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Indicates that an argument to a function can be null, and null values for that argument
 * should be checked for.
 * @author Paycho <paycho@paycho.org>
 */
@Target(ElementType.PARAMETER)
public @interface Nullable {
}
